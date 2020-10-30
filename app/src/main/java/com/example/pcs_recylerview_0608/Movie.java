package com.example.pcs_recylerview_0608;

public class Movie {
    private String title;
    private String Year;


    public Movie(String title, String year) {
        this.title = title;
        Year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }
}
