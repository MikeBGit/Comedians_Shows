package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.Comedian;
import com.example.restservice.model.Show;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowService {
    static List<Show> shows = new ArrayList<>();

    public static List<Show> getAllShows(){

        Comedian joe1 = new Comedian("Joe", "One");
        Comedian sally2 = new Comedian("Sally", "Two");
        Comedian jerry3 = new Comedian("Jerry", "Three");
        Comedian betty4 = new Comedian("Betty", "Four");

        Comedian[] lineUp1 = {joe1,sally2,jerry3};
        Comedian[] lineUp2 = {sally2,jerry3};
        Comedian[] lineUp3 = {betty4,jerry3,joe1};


        Show show1 = new Show(1,"yukyuks","may 6 2022",new Address(223,"Other street","MTL"), Arrays.asList(lineUp1));
        Show show2 = new Show(2,"comedyStore","march 3 2022",new Address(123,"goodStreet","MTL"), Arrays.asList(lineUp2));
        Show show3 = new Show(3,"clubLaughter","june 12 2022",new Address(432,"Top Street","MTL"), Arrays.asList(lineUp3));

        shows.add(show1);
        shows.add(show2);
        shows.add(show3);

        return shows;

    }
    public static Show getById(int id){
        for(Show s : shows){
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }


    public static void addShow(Show show){
        shows.add(show);
    }
}
