package Generics;

public class Movie {
    private String genre;
    private String actors;
    private String directors;


    @Override
    public String toString() {
        return "Movie{" +
                "genre='" + genre + '\'' +
                ", actors='" + actors + '\'' +
                ", directors='" + directors + '\'' +
                '}';
    }

    public Movie() {
    }

    public Movie(String genre, String actors, String directors) {
        this.genre = genre;
        this.actors = actors;
        this.directors = directors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }
}
