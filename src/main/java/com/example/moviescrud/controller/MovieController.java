package com.example.moviescrud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.moviescrud.model.Movie;
import com.example.moviescrud.service.MovieService;

@RestController
@RequestMapping({"movie"})
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("")
    public List<Movie> getAll() {
        return movieService.getAll();
    }

    @GetMapping("/{id}")
    public Movie get(@PathVariable String id) {
        return movieService.get(id);
    }

    @PostMapping("")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @PutMapping("/{id}")
    public Movie addMovie(@PathVariable String id, @RequestBody Movie movie) {
        return movieService.updateMovie(id, movie);
    }

    @DeleteMapping("/{id}")
    public Movie addMovie(@PathVariable String id) {
        return movieService.deleteMovie(id);
    }
}
