package com.metraj.recyclerview_hive;

public class Movie {
    private String title;
    private String Url;


    public Movie() {

    }

    public Movie(String title, String url) {
        this.title = title;
        Url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
