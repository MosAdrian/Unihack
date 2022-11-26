package com.example.unihack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AfisareScor extends AppCompatActivity {

    private TextView afisareScor;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afisare_scor);
        afisareScor = (TextView)findViewById(R.id.afisareScor);
        home = (Button)findViewById(R.id.goHomeBtn);
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String finalscore = sh.getString("finalscore", "");

        afisareScor.setText("Felicitari ai obtinut scorul de:" + finalscore);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AfisareScor.this, MainActivity.class));
            }
        });

    }
}