package com.movies.Wishlist.TvShows;

public class TvShows {
    private String Id;
    private String Name;
    private String Director;
    private String Genre;
    private String Year;

    public TvShows(String id, String name, String director, String genre, String year) {
        Id = id;
        Name = name;
        Director = director;
        Genre = genre;
        Year = year;
    }

    public TvShows(String name, String director, String genre, String year) {
        Name = name;
        Director = director;
        Genre = genre;
        Year = year;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "TvShows{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Director='" + Director + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Year='" + Year + '\'' +
                '}';
    }
}
