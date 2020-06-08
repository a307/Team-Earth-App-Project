package com.example.earthteamproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    //arrays to contain data
    String s1[], s2[];

    int images[] = {R.drawable.strawberry,
            R.drawable.apple,
            R.drawable.celeries,
            R.drawable.kales,
            R.drawable.tomato,
            R.drawable.blackberry,
            R.drawable.beet,
            R.drawable.potato};

    //recyler view object
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initalize recycler view
        recyclerView = findViewById(R.id.recyclerView);

        //get string arrays from strings.xml
        s1 = getResources().getStringArray(R.array.produce);
        s2 = getResources().getStringArray(R.array.descriptions);

        //intialize my adapter and sent data to its constructor
        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);

        recyclerView.setAdapter(myAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
