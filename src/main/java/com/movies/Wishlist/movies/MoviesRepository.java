package com.movies.Wishlist.movies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository
        extends JpaRepository<Movies, Long> {
}
