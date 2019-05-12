package com.example.hastensports.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Sport implements Serializable {


    /**
     * Player name
     */
    @SerializedName("players")
    private ArrayList<Player> players;

    /**
     * Player name
     */
    @SerializedName("title")
    private String title;


    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
