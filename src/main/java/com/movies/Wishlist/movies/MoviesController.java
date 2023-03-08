package com.movies.Wishlist.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/movies")
public class MoviesController {

    private final MoviesService moviesService;
    @Autowired
    public MoviesController(MoviesService moviesService){
        this.moviesService = moviesService;

    }
    @GetMapping
    public List<Movies> getMovies(){
        return moviesService.getMovies();

    }

}
