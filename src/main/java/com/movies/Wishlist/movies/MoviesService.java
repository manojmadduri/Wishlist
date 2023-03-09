package com.movies.Wishlist.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

        public void addNewMovies(Movies movies){
       Optional<Movies> moviesOptional = moviesRepository
               .findMoviesByName(movies.getName());
       if (moviesOptional.isPresent()) {
           throw new IllegalStateException("Name exists");
       }

       moviesRepository.save(movies);

    }

    public void deleteMovies(Long movieId) {
       boolean exists = moviesRepository.existsById(movieId);
       if (!exists) {
           throw new IllegalStateException(
                   "movies with id " + movieId + "does not exists");
       }
       moviesRepository.deleteById(movieId);
       }


   }

