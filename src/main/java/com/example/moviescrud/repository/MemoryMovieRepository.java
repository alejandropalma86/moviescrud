package com.example.moviescrud.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.moviescrud.model.Movie;

@Repository
public class MemoryMovieRepository implements IMovieRepository {
    private Map<String, Movie> moviesMap;

    MemoryMovieRepository() {
        moviesMap = new HashMap<>();
    }

    @Override
    public List<Movie> getAll() {
        List<Movie> ret = new ArrayList<>();
        ret.addAll(moviesMap.values());
        return ret;
    }

    @Override
    public Movie get(String id) {
        return moviesMap.get(id);
    }

    @Override
    public Movie save(Movie movie) {
        if (movie.getId() == null) {
            movie.setId(String.valueOf(System.currentTimeMillis()));
        }
        return moviesMap.put(movie.getId(), movie);
    }

    @Override
    public Movie delete(String id) {
        return moviesMap.remove(id);
    }
}
