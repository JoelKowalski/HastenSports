package com.example.hastensports.Adapters;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hastensports.Models.Player;
import com.example.hastensports.Models.Sport;
import com.example.hastensports.R;
import com.example.hastensports.Viewholders.PlayerSectionViewHolder;
import com.example.hastensports.Viewholders.SportSectionViewHolder;

import java.util.ArrayList;

public class PlayerRecyclerViewAdapter extends RecyclerView.Adapter<PlayerSectionViewHolder> {

    /**
     * Context
     */
    private Context context;

    /**
     * Item recycler list
     */
    private ArrayList<Player> itemList;


    public PlayerRecyclerViewAdapter(Context context, ArrayList<Player> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public PlayerSectionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_section, parent, false);
        return new PlayerSectionViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(PlayerSectionViewHolder holder, int position) {
        final Player sectionModel = itemList.get(position);
        //populate list
        holder.populate(sectionModel,context);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}