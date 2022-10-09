package com.example.moviescrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.moviescrud.model.Movie;
import com.example.moviescrud.repository.IMovieRepository;

@Service
public class MovieService {
    private final IMovieRepository movieRepository;

    public MovieService(IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll() {
        return movieRepository.getAll();
    }

    public Movie get(String id) {
        return movieRepository.get(id);
    }

    public Movie addMovie(Movie movie) {
        movie.setId(null);
        return movieRepository.save(movie);
    }

    public Movie updateMovie(String id, Movie movie) {

        Movie movieR = movieRepository.get(id);
        if (movieR == null) {
            return null;
        }
        movie.setId(id);;
        return movieRepository.save(movie);
    }

    public Movie deleteMovie(String id) {
        return movieRepository.delete(id);
    }
}
