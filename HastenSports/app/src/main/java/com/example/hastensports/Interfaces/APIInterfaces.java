package com.example.hastensports.Interfaces;


import com.example.hastensports.Models.Sport;
import com.example.hastensports.Response.SportResponse;
import com.example.hastensports.Utils.Urls;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Joel Fernandez.
 */

public interface APIInterfaces {
    @GET(Urls.GETSPORTURL)
    Call<List<Sport>> getSportList();
}
