package ge.btu.badri.kavteladze.movieapi.controller;

import ge.btu.badri.kavteladze.movieapi.dto.*;
import ge.btu.badri.kavteladze.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("get-movie")
    public GetMovieOutput getMovie(@RequestBody GetMovieInput getMovieInput) {
        return movieService.getMovie(getMovieInput);
    }

    @PostMapping("get-movies")
    public GetAllMoviesOutput getAllMovies(@RequestBody GetAllMoviesInput getAllMoviesInput) {
        return movieService.getAllMovies(getAllMoviesInput);
    }

    @PostMapping("add-movie")
    public AddMovieOutput addMovie(@RequestBody AddMovieInput addMovieInput) {
        return movieService.addMovie(addMovieInput);
    }

    @PostMapping("delete-movie")
    public DeleteMovieOutput deleteMovie(@RequestBody DeleteMovieInput deleteMovieInput) {
        return movieService.deleteMovie(deleteMovieInput);
    }

    @PostMapping("update-movie")
    public UpdateMovieOutput updateMovie(@RequestBody UpdateMovieInput updateMovieInput) {
        return movieService.updateMovie(updateMovieInput);
    }

}
