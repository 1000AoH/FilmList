package com.company;

import java.util.ArrayList;

public class FilmData {
    private int code;
    private String name;
    private String type;
    private int lengthMinute; //minute
    private String owner;
    private int publishYear;
    ArrayList<FilmData> listFilm = new ArrayList<>();

    public FilmData(){}
    public FilmData(int code, String name, String type, int length, String owner, int publishYear) {
        this.code = code;
        this.name = name;
        this.type = type;
        setLength(length);
        this.owner = owner;
        setPublishYear(publishYear);
    }
    public void addFilm(FilmData newFilm){
        listFilm.add(newFilm);
    }

    @Override
    public String toString() {
        return "Code: " + code + "\t Name: " + name + "\t Type: " + type + "\t Length: " +lengthMinute + "\t Owner: " + owner + "\t Publish Year: " + publishYear;
    }
    public void printFilm(ArrayList<FilmData> x){
        System.out.println("List films: ");
        for(FilmData i :x){
            System.out.println(i);
        }
    }
    public void getFilmWithType(String type){
        System.out.println("List films with type of " + type.toUpperCase() +" are: ");
        for (int i = 0; i<listFilm.size(); i++){
            if (listFilm.get(i).type.toLowerCase().contains(type.toLowerCase())){
                System.out.println(listFilm.get(i));
            }
        }
    }

    public void setPublishYear(int publishYear) {
        if (publishYear>2021 || publishYear<1000)
                throw new IllegalArgumentException("Published Year should be between 1000 - 2021");
        this.publishYear = publishYear;
    }

    public void setLength(int length) {
        if (length<0)
            throw new IllegalArgumentException("Movie length should be >0 minute");
        this.lengthMinute = length;
    }

    public String getType() {
        return type;
    }
}
