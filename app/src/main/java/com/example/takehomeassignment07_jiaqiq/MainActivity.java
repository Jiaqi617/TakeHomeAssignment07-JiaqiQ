package com.example.takehomeassignment07_jiaqiq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //    Button button =findViewById(R.id.button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("K-pop Girl Groups");
    }

    public void startActivity(View view) {
        Intent intent = new Intent(this, ActionBar.class);
        startActivity(intent);
    }

}
