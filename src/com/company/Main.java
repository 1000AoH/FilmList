package com.company;

public class Main {
    public static FilmData filmData = new FilmData();
    public static void main(String[] args) {
        addFilm();
        filmData.printFilm(filmData.listFilm);
        System.out.println();
        filmData.getFilmWithType("action");
    }

    public static void  addFilm(){
        filmData.addFilm(new FilmData(1, "Avatar", "Fiction", 150, "Not me",2009));
        filmData.addFilm(new FilmData(2, "Fast&Furious", "Action", 120, "Not me",2014));
        filmData.addFilm(new FilmData(3, "John Carter", "Action", 100, "Not me",2015));
        filmData.addFilm(new FilmData(4, "The Lone Ranger", "Dramatic", 120, "Not me",2016));
        filmData.addFilm(new FilmData(5, "Titanic", "Dramatic", 160, "Not me",2002));
        filmData.addFilm(new FilmData(6, "Spider-Man 2", "Fiction, Action", 130, "Not me",2005));
        filmData.addFilm(new FilmData(7, "Toy Story 3", "Cartoon, Fiction", 120, "Not me",2011));
        filmData.addFilm(new FilmData(8, "Iron Man 3", "Fiction, Action", 100, "Not me",2015));
        filmData.addFilm(new FilmData(9, "Dark Knight", "Horror", 90, "Not me",2008));
    }
}
