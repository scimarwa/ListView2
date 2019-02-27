package com.example.macomputer.listview2;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private int image;

    public Contact(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
