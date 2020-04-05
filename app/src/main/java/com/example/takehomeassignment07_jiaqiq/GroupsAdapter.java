package com.example.takehomeassignment07_jiaqiq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GroupsAdapter extends RecyclerView.Adapter<GroupViewHolder> {
    private List<Group> groups;
    private Context context;

    public GroupsAdapter(List<Group> groups, Context context) {
        this.context = context;
        this.groups = groups;
    }

    @Override
    public GroupViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_group, parent, false);
        return new GroupViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(GroupViewHolder holder, int position) {
        Group group = groups.get(position);
        holder.groupName.setText(group.name);
        holder.groupCompany.setText(group.company);
        holder.groupPhoto.setImageResource(group.groupPhoto);
    }

    public int getItemCount() {
        return groups.size();
    }
}
