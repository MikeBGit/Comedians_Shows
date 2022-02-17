package com.example.restservice.model;

import java.util.List;

public class Show {
    private int id;
    private String venue;
    private String date;
    private Address address;
    private List<Comedian> comedians;



    public Show(int id, String venue, String date, Address address, List<Comedian> comedians) {
        this.id = id;
        this.venue = venue;
        this.date = date;
        this.address = address;
        this.comedians = comedians;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Comedian> getComedians() {
        return comedians;
    }

    public void setComedians(List<Comedian> comedians) {
        this.comedians = comedians;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", venue='" + venue + '\'' +
                ", date='" + date + '\'' +
                ", address=" + address +
                ", comedians=" + comedians +
                '}';
    }
}
