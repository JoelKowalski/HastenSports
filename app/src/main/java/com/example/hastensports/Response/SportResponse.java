package com.example.hastensports.Response;

import com.example.hastensports.Models.Player;
import com.example.hastensports.Models.Sport;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Joel Fernandez.
 */

public class SportResponse {

    private ArrayList<Sport> data;

    public ArrayList<Sport> getData() {
        return data;
    }

    public void setData(ArrayList<Sport> data) {
        this.data = data;
    }
}
