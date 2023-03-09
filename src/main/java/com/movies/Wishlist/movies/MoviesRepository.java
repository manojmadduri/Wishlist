package com.movies.Wishlist.movies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoviesRepository
        extends JpaRepository<Movies, Long> {

    @Query("SELECT s FROM Movies s WHERE s.name =?1")
    Optional<Movies> findMoviesByName(String name);
}


    