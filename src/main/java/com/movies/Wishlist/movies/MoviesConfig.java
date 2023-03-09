package com.movies.Wishlist.movies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MoviesConfig {
    @Bean
    CommandLineRunner commandLineRunner(MoviesRepository repository) {
        return args -> {
            Movies FightClub = new Movies (
                    "Fight Club",
                    "David Fincher",
                    "Thriller",
                    "1999"
            );

            Movies Enemy = new Movies(
                    "Enemy",
                    "David Fincher",
                    "Thriller",
                    "2002"
            );

            repository.saveAll(Arrays.asList(FightClub, Enemy)); // save both movies to the database

            List<Movies> movies = repository.findAll();

            for (Movies movie : movies) {
                System.out.println(movie.toString()); // print each movie on a separate line
            }
        };
    }



}
