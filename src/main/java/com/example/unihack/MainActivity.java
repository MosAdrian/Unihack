package com.example.unihack;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRelief = (Button)findViewById(R.id.relief);
        Button btnHydrography = (Button)findViewById(R.id.hydrography);
        Button btnPoliticalMap = (Button)findViewById(R.id.political_map);

        btnRelief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Relief.class));
            }
        });
        btnHydrography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Relief.class));
            }
        });
        btnPoliticalMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Relief.class));
            }
        });



    }




}