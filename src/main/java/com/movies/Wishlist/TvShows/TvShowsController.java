package com.movies.Wishlist.TvShows;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/TvShows")
public class TvShowsController {

    @GetMapping
    public List<TvShows> hello(){
        return List.of(
                new TvShows(
                        "1",
                        "Mr.Robot",
                        "Sam Esmail",
                        "Drama",
                        "2019"


                )
        );
    }
}
