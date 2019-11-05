package com.example.changeimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imgView);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count % 2 ==0){
                    img.setImageResource(R.drawable.yellowcute);

                }
                else {
                    img.setImageResource(R.drawable.shiba);

                }
                count++;

            }
        });

    }
}