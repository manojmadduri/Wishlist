package com.movies.Wishlist.movies;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    public List<Movies> getMovies() {
        return List.of(
                new Movies(
                        1L,
                        "Fight Club",
                        "David Fincher",
                        "Thriller",
                        "1999"
                )

        );
    }
}

