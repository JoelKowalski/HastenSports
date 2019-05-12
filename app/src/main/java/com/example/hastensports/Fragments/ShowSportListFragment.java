package com.example.hastensports.Fragments;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.hastensports.Activities.SportActivity;
import com.example.hastensports.Adapters.SportRecyclerViewAdapter;
import com.example.hastensports.Controllers.DataController;
import com.example.hastensports.Interfaces.MainInterfaces;
import com.example.hastensports.Models.Sport;
import com.example.hastensports.R;
import com.example.hastensports.Response.SportResponse;

import java.util.ArrayList;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * Created by Joel Fernandez.
 */

public class ShowSportListFragment extends MainFragment {

    /**
     * header back image
     */
    private ImageView backButton;

    /**
     * RecyclerView adapter
     */
    private RecyclerView recyclerView;

    /**
     * Adapter
     */
    private SportRecyclerViewAdapter adapter;

    /**
     * DataController
     */
    private DataController dataController;

    /**
     * Loading progress bar
     */
    private ProgressBar loading;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //get content view
        View view = inflater.inflate(R.layout.sport_fragment, container, false);

        dataController = new DataController();

        initView(view);

        getInfo();

        setListeners();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private void getInfo() {
        setUpRecyclerView();
        callAdapter();
    }
    public void setListeners() {
        backButton.setOnClickListener(v -> ShowSportListFragment.this.onBackPressed());
    }

    /**
     * Method to do an action when the user push back buttom
     */
    public void onBackPressed() {
        getActivity().finish();
    }

    protected void initView(View view) {
        backButton =  view.findViewById(R.id.back_image);
        recyclerView =  view.findViewById(R.id.sport_recycler_view);
        loading = view.findViewById(R.id.loading);

        ((SportActivity)getActivity()).setTitle(getResources().getString(R.string.headertext));
    }

    /**
     * Method to init Linear layout manager
     */
    private void setUpRecyclerView() {
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    private void callAdapter(){
        loading.setVisibility(VISIBLE);
        dataController.getSports(new MainInterfaces.ISportList() {

            @Override
            public void getSports(ArrayList<Sport> sports) {
                loading.setVisibility(GONE);
                recyclerView.setVisibility(VISIBLE);
                adapter = new SportRecyclerViewAdapter(ShowSportListFragment.this.getContext(), sports);
                //add adapter to list
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void error() {

            }
        });
    }
}