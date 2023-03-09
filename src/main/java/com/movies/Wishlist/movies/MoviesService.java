package com.movies.Wishlist.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    private final  MoviesRepository moviesRepository;

    @Autowired
    public MoviesService(MoviesRepository moviesRepository){
        this.moviesRepository = moviesRepository;
    }

    public List<Movies> getMovies() {
       return moviesRepository.findAll();
    }
}

