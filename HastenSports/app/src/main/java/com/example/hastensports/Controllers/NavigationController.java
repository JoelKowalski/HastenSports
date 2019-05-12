package com.example.hastensports.Controllers;


import com.example.hastensports.Fragments.MainFragment;
import com.example.hastensports.Fragments.ShowSportListFragment;
import com.example.hastensports.Interfaces.MainInterfaces;

/**
 * Created by Joel Fernandez.
 */

public class NavigationController {

    /**
     * Fragment show into activity
     */
    private MainFragment fragment;

    /**
     * Indicate if go back navigation
     */
    protected static boolean goToBack;

    /**
     * Method to select a fragment and init view with him
     * @param listener
     */
    public void initNavigation(MainInterfaces.IFirstNavigation listener) {

        //create fragment
        fragment = new ShowSportListFragment();
        //go to listener
        listener.initView(fragment);
    }

    public static boolean isGoToBack() {
        return goToBack;
    }
}