package com.example.hastensports.Activities;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.example.hastensports.Controllers.DataController;
import com.example.hastensports.Controllers.NavigationController;
import com.example.hastensports.R;


/**
 * Created by Joel Fernandez.
 */

public class SportActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set content
        setContentView(R.layout.sport_activity);

        //get views
        initViews();

        //create controllers
        controller = new NavigationController();
        dataController = new DataController();

        //initNavigation
        initNavigation();

    }
    @Override
    protected void initViews(){
        super.initViews();
    }

    @Override
    public void setTitle(String text) {
        //set color
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            // only for gingerbread and newer versions
            headerText.setTextColor(getResources().getColor(R.color.white));
        }else {
            headerText.setTextColor(ContextCompat.getColor(this, R.color.white));
        }
        super.setTitle(text);
    }

    private void initNavigation(){
        controller.initNavigation(fragment -> {
            //change fragment
            SportActivity.this.changeFragment(fragment, false);
        });
    }
}
