package com.example.hastensports.Models;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Joel Fernandez.
 */

public class Player implements Serializable {

    /**
     * Player name
     */
    @SerializedName("name")
    private String name;

    /**
     * Player surname
     */
    @SerializedName("surname")
    private String surname;

    /**
     * Player image
     */
    @SerializedName("image")
    private String image;


    /**
     * Player birthday
     */
    @SerializedName("date")
    private String birthday;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }



}
