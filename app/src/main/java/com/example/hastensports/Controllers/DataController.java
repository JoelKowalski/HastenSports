package com.example.hastensports.Controllers;


import com.example.hastensports.Interfaces.APIClient;
import com.example.hastensports.Interfaces.APIInterfaces;
import com.example.hastensports.Interfaces.MainInterfaces;
import com.example.hastensports.Models.Sport;
import com.example.hastensports.Response.SportResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by Joel Fernandez.
 */


public class DataController {

    APIInterfaces apiInterface;

    /**
     *
     */
    public void getSports(final MainInterfaces.ISportList listener){

        try{
            // show loading

            apiInterface = APIClient.getClient().create(APIInterfaces.class);

            /**
             GET Sport list
             **/
            Call<List<Sport>> call = apiInterface.getSportList();
            call.enqueue(new Callback<List<Sport>>() {
                @Override
                public void onResponse(Call <List<Sport>> call, Response<List<Sport>> response) {
                    if(response.isSuccessful()){
                        ArrayList<Sport> sportResponse= (ArrayList<Sport>) response.body();
                        listener.getSports(sportResponse);
                    }else{
                        listener.error();
                    }
                }

                @Override
                public void onFailure(Call<List<Sport>> call, Throwable t) {
                    call.cancel();
                }
            });
        } catch (Exception a) {
            a.printStackTrace();
        }
    }
}