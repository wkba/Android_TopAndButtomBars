package com.example.wakabashi.topandbuttombars;

/**
 * Created by wakabashi on 2017/07/01.
 */

public class Card {

    private String imgURL;
    private String title;

    public Card(String imgURL, String title) {
        this.imgURL = imgURL;
        this.title = title;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

