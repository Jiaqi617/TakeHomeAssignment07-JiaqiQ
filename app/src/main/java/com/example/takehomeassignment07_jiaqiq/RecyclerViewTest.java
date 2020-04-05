package com.example.takehomeassignment07_jiaqiq;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewTest extends AppCompatActivity {

    private List<Group> groups;
    private GroupsAdapter groupsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        setTitle("RecyclerView");
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        initialData();
        groupsAdapter = new GroupsAdapter(groups, this);
        recyclerView.setAdapter(groupsAdapter);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groups.add(getRandomGroup());
                groupsAdapter.notifyDataSetChanged();
            }
        });
    }

    private Group getRandomGroup() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Group("Blackpink", "YG", R.drawable.blackpink);
        else if (num == 1)
            return new Group("ITZY", "JYP", R.drawable.itzy);
        else
            return new Group("Red Velvet", "SM", R.drawable.redvelvet);
    }

    private void initialData() {
        groups = new ArrayList<>();
        groups.add(new Group("Blackpink", "YG", R.drawable.blackpink));
        groups.add(new Group("ITZY", "JYP", R.drawable.itzy));
        groups.add(new Group("Red Velvet", "SM", R.drawable.redvelvet));
    }

}
