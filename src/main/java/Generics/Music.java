package Generics;

public class Music {
    private String artiste;
    private String genre;
    private String melody;


    @Override
    public String toString() {
        return "Music{" +
                "artiste='" + artiste + '\'' +
                ", genre='" + genre + '\'' +
                ", melody='" + melody + '\'' +
                '}';
    }

    public Music() {
    }


    public Music(String artiste, String genre, String melody) {
        this.artiste = artiste;
        this.genre = genre;
        this.melody = melody;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMelody() {
        return melody;
    }

    public void setMelody(String melody) {
        this.melody = melody;
    }
}
