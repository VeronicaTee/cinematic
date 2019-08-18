package me.jysh.cinematic.service;

import me.jysh.cinematic.model.Movie;
import me.jysh.cinematic.model.Screening;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();

    Movie getMovieById(Long movie_id);

    List<Screening> getAllScreeningByMovieId(Long movie_id);

    void deleteMovie(Long movie_id);
}
