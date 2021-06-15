package ge.btu.badri.kavteladze.movieapi.service;

import ge.btu.badri.kavteladze.movieapi.dto.*;

public interface MovieService {
    GetMovieOutput getMovie(GetMovieInput getMovieInput);

    GetAllMoviesOutput getAllMovies(GetAllMoviesInput getAllMoviesInput);

    AddMovieOutput addMovie(AddMovieInput addMovieInput);

    DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput);

    UpdateMovieOutput updateMovie(UpdateMovieInput updateMovieInput);
}
