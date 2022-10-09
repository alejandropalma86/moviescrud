package com.example.moviescrud.model;

import lombok.Data;

public @Data class Movie {
    private String id;
    private String name;
    private Integer premieredate;
    private String director;
    private String synopsis;
    public Movie(String name, Integer premieredate, String director, String synopsis) {
        this.name = name;
        this.premieredate = premieredate;
        this.director = director;
        this.synopsis = synopsis;
    }

}
