package com.example.hastensports.Viewholders;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hastensports.Models.Player;
import com.example.hastensports.R;
import com.squareup.picasso.Picasso;


/**
 * Created by Joel Fernandez.
 */

public class PlayerSectionViewHolder extends RecyclerView.ViewHolder{


    /**
     * Item section name
     */
    public TextView name;

    /**
     * Item section name
     */
    public TextView surname;

    /**
     * Item section name
     */
    public ImageView image;

    /**
     * Item section name
     */
    public TextView birthday;


    public PlayerSectionViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name_text);
        surname = itemView.findViewById(R.id.surname_text);
        birthday = itemView.findViewById(R.id.birthday_text);
        image = itemView.findViewById(R.id.player_image);
    }

    public void populate(Player item,Context context) {
        name.setText(item.getName());
        surname.setText(item.getSurname());
        birthday.setText(item.getBirthday()!=null ? item.getBirthday() : "no data");
        if(!item.getImage().equals(""))
            Glide.with(context)
                    .load(item.getImage()).into(image);
    }
}
