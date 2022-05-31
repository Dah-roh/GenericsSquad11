package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Movie taken = new Movie("Action, Thriller",
                "Daniel Craig, Liam Neeson",
                "Quinto Tarantino");
        Music allTimeLow = new Music("Jon Bellion",
                "alternative/soft rock",
                "upbeat");

        Movie avengers =  new Movie("Action, Comedy, Sci-fi",
                "Robert Downey Jr",
                "Marvel");

        Catalog<Movie> movieCatalog = new Catalog<>();
        movieCatalog.setCatalog(taken);
        movieCatalog.setListOfCatalogs(taken);
        movieCatalog.setListOfCatalogs(avengers);

        Catalog<Music> musicCatalog = new Catalog<>();
        musicCatalog.setCatalog(allTimeLow);
        musicCatalog.setListOfCatalogs(allTimeLow);

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList = stringLinkedList.add(stringLinkedList, "Head");
        stringLinkedList = stringLinkedList.add(stringLinkedList, "next node");

        stringLinkedList.printLinkedListValues(stringLinkedList);
//        System.out.println(movieCatalog);
//        System.out.println(musicCatalog);
    }
}
