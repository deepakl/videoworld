package com.thoughtworks.videorental.domain;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getCharge(final int daysRented) {
        return daysRented * 1;
    }


}
