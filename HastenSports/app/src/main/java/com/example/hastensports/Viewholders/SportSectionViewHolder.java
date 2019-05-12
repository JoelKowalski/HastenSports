package com.example.hastensports.Viewholders;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hastensports.Models.Sport;
import com.example.hastensports.R;

public class SportSectionViewHolder extends RecyclerView.ViewHolder{

    /**
     * Item section name
     */
    public TextView name;

    /**
     * Players Recycler View
     */
    public RecyclerView playerList;

    public SportSectionViewHolder(View itemView) {
        super(itemView);
        name =  itemView.findViewById(R.id.sport_title);
        playerList= itemView.findViewById(R.id.player_recycler_view);
    }

    public void populate(Sport item) {
        name.setText(item.getTitle());
    }
}
