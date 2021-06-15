package ge.btu.badri.kavteladze.movieapi.service.impl;

import ge.btu.badri.kavteladze.movieapi.dto.*;
import ge.btu.badri.kavteladze.movieapi.model.Movie;
import ge.btu.badri.kavteladze.movieapi.repository.MovieRepository;
import ge.btu.badri.kavteladze.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        Movie movie = movieRepository.getById(getMovieInput.getId());
        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setId(movie.getId());
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());

        return getMovieOutput;
    }

    @Override
    public GetAllMoviesOutput getAllMovies(GetAllMoviesInput getAllMoviesInput) {
        List<MovieDTO> movieDTOList = new ArrayList<>();

        for (Movie movie : movieRepository.findAll()) {
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());
            movieDTOList.add(movieDTO);
        }

        GetAllMoviesOutput getAllMoviesOutput = new GetAllMoviesOutput();
        getAllMoviesOutput.setMovies(movieDTOList);
        return getAllMoviesOutput;
    }


    @Override
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());

        movieRepository.save(movie);
        AddMovieOutput addMovieOutput = new AddMovieOutput();
        addMovieOutput.setSuccessMsg(String.format("%s was added successfully", addMovieInput.getTitle()));
        return addMovieOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        Movie movie = movieRepository.getById(deleteMovieInput.getId());
        movieRepository.delete(movie);

        DeleteMovieOutput deleteMovieOutput = new DeleteMovieOutput();
        deleteMovieOutput.setSuccessMsg(String.format("%s was deleted successfully", movie.getTitle()));
        return deleteMovieOutput;
    }

    @Override
    public UpdateMovieOutput updateMovie(UpdateMovieInput updateMovieInput) {
        Movie movie = movieRepository.getById(updateMovieInput.getId());

        movie.setTitle(updateMovieInput.getTitle());
        movie.setCountry(updateMovieInput.getCountry());

        movieRepository.save(movie);

        UpdateMovieOutput updateMovieOutput = new UpdateMovieOutput();
        updateMovieOutput.setSuccessMsg(String.format("%s was deleted successfully", updateMovieInput.getTitle()));
        return updateMovieOutput;
    }


}
