package com.example.hastensports.Interfaces;


import com.example.hastensports.Fragments.MainFragment;
import com.example.hastensports.Models.Sport;
import com.example.hastensports.Response.SportResponse;

import java.util.ArrayList;

/**
 * Created by Joel Fernandez.
 */

public class MainInterfaces {

    /**
     * First navigation interface
     */
    public interface IFirstNavigation{
        void initView(MainFragment fragment);
    }

    /**
     * Interface for click ingredientRecyclerView back button
     */
    public interface IPreshBackButton{
        void onClick(MainFragment fragment);
    }

    /**
     * Interface to pass sports between fragments
     */
    public interface ISportList{
        void getSports(ArrayList<Sport> sports);
        void error();
    }
}
