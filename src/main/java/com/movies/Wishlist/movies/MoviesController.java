package com.movies.Wishlist.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public void registerNewMovies(@RequestBody Movies movies) {
        moviesService.addNewMovies(movies);
    }
    @DeleteMapping(path ="{movieId}")
    public void deleteMovies(@PathVariable("movieId") Long movieId) {
        moviesService.deleteMovies(movieId);
    }



}
