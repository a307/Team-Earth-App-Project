package com.example.earthteamproject;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    //create objects of each widget in activty_second.xml
    ImageView mainImageView;

    TextView title, description;

    String data1, data2;

    int myImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);

        title = findViewById(R.id.title);

        description = findViewById(R.id.description);

        //call get and sets
        getData();

        setData();

    }

    //check if data exists in myadapter inner class view holder intent object
    private void getData(){

        if(getIntent().hasExtra("images") && getIntent().hasExtra(
                "data1") && getIntent().hasExtra("data2")){

            //if data exists it is stored in these temp variables
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");

            myImage = getIntent().getIntExtra("images",1);


        } else { // if data doesn't exist a toast will be made

            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();

        }

    }

    private void setData(){

        //set data in new activity

        //title
        title.setText(data1);

        //description
        description.setText(data2);

        //set image
        mainImageView.setImageResource(myImage);

    }

}
