package com.example.moviescrud.repository;

import java.util.List;

import com.example.moviescrud.model.Movie;

public interface IMovieRepository {
    public List<Movie> getAll();
    public Movie get(String id);
    public Movie save(Movie movie);
    public Movie delete(String id);
}
