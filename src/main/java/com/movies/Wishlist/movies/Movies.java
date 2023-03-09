package com.movies.Wishlist.movies;


import jakarta.persistence.*;

@Entity
@Table
public class Movies {

    public Movies() {
    }

    @Id
    @SequenceGenerator(
            name = "Movies_sequence",
            sequenceName = "Movies_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Movies_sequence"
    )



    private Long id;
    private String name;
    private String director;
    private String genres;
    private String year;

    public Movies(Long id, String name, String director, String genres, String year) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.genres = genres;
        this.year = year;
    }

    public Movies(String name, String director, String genres, String year) {
        this.name = name;
        this.director = director;
        this.genres = genres;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Director: " + director + "\n" +
                "Genre: " + genres + "\n" +
                "Year: " + year + "\n";

    }
}