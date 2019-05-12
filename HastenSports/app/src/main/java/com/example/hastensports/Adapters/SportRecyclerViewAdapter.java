package com.example.hastensports.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hastensports.Fragments.ShowSportListFragment;
import com.example.hastensports.Models.Sport;
import com.example.hastensports.R;
import com.example.hastensports.Viewholders.PlayerSectionViewHolder;
import com.example.hastensports.Viewholders.SportSectionViewHolder;

import java.util.ArrayList;


/**
 * Created by Joel Fernandez.
 */

public class SportRecyclerViewAdapter extends RecyclerView.Adapter<SportSectionViewHolder> {

    /**
     * Context
     */
    private Context context;

    /**
     * Item recycler list
     */
    private ArrayList<Sport> itemList;


    public SportRecyclerViewAdapter(Context context, ArrayList<Sport> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public SportSectionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sport_section, parent, false);
        return new SportSectionViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(SportSectionViewHolder holder, int position) {
        final Sport sectionModel = itemList.get(position);
        //populate list
        holder.populate(sectionModel);

        setUpRecyclerView(holder);
        PlayerRecyclerViewAdapter adapter = new PlayerRecyclerViewAdapter(context, itemList.get(position).getPlayers());
        //add adapter to list
        holder.playerList.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    private void setUpRecyclerView(SportSectionViewHolder holder) {
        holder.playerList.setHasFixedSize(true);
        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(context);
        holder.playerList.setLayoutManager(gridLayoutManager);
    }
}