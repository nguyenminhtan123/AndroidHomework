package com.example.changescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button changeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeBtn= findViewById(R.id.changeBtn);
        changeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openSecondscreen();
            }
        });
    }
    private void openSecondscreen(){
        Intent intent= new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }
}
