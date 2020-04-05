package com.example.takehomeassignment07_jiaqiq;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
import androidx.cardview.widget.CardView;

public class GroupViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView groupName;
    public TextView groupCompany;
    public ImageView groupPhoto;

    public GroupViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.cardview);
        groupName = (TextView) itemView.findViewById(R.id.name);
        groupCompany = (TextView) itemView.findViewById(R.id.info);
        groupPhoto = (ImageView) itemView.findViewById(R.id.photo);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, groupName.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
