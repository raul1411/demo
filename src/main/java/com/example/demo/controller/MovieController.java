package com.example.demo.controller;

import com.example.demo.domain.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;
    MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    // http://localhost:8080/hello/
    @GetMapping("/")
    public List<Movie> metodo() {
        return movieRepository.findAll();
    }

    @PostMapping("/")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }
}