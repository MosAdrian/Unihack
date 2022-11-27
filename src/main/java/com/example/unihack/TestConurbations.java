package com.example.unihack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Objects;

public class TestConurbations extends AppCompatActivity {

    private RadioGroup rg1;
    private RadioGroup rg2;
    private RadioGroup rg3;
    private RadioGroup rg4;
    private RadioGroup rg5;
    private RadioGroup rg6;
    private RadioGroup rg7;
    private RadioGroup rg8;
    private RadioGroup rg9;
    private RadioGroup rg10;

    private RadioButton rb;
    private Button btn;
    static int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_conurbations);

        rg1 = (RadioGroup)findViewById(R.id.rg1);
        rg2 = (RadioGroup)findViewById(R.id.rg2);
        rg3 = (RadioGroup)findViewById(R.id.rg3);
        rg4 = (RadioGroup)findViewById(R.id.rg4);
        rg5 = (RadioGroup)findViewById(R.id.rg5);
        rg6 = (RadioGroup)findViewById(R.id.rg6);
        rg7 = (RadioGroup)findViewById(R.id.rg7);
        rg8 = (RadioGroup)findViewById(R.id.rg8);
        rg9 = (RadioGroup)findViewById(R.id.rg9);
        rg10 = (RadioGroup)findViewById(R.id.rg10);

        btn = (Button)findViewById(R.id.submitBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int alegere1 = rg1.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(alegere1);
                if (rb!=null) {
                    String rasp1 = (String) rb.getText();
                    if (Objects.equals(rasp1, "Bucharest"))
                        k++;
                }
                int alegere2 = rg2.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(alegere2);
                if (rb != null) {
                    String rasp2 = (String) rb.getText();
                    if (Objects.equals(rasp2, "One point nine milion"))
                        k++;
                }
                int alegere3 = rg3.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(alegere3);
                if (rb != null) {
                    String rasp3 = (String) rb.getText();
                    if (Objects.equals(rasp3, "Three"))
                        k++;
                }
                int alegere4 = rg4.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(alegere4);
                if (rb != null) {
                    String rasp4 = (String) rb.getText();
                    if (Objects.equals(rasp4, "Yes"))
                        k++;
                }
                int alegere5 = rg5.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(alegere5);
                if (rb != null) {
                    String rasp5 = (String) rb.getText();
                    if (Objects.equals(rasp5, "Iasi, Timisoara, Constanta ,Cluj-Napoca and Craiova"))
                        k++;
                }
                int alegere6 = rg6.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(alegere6);
                if (rb != null) {
                    String rasp6 = (String) rb.getText();
                    if (Objects.equals(rasp6, "Prahova"))
                        k++;
                }
                int alegere7 = rg7.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(alegere7);
                if (rb != null) {
                    String rasp7 = (String) rb.getText();
                    if (Objects.equals(rasp7, "One"))
                        k++;
                }
                int alegere8 = rg8.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(alegere8);
                if (rb != null) {
                    String rasp8 = (String) rb.getText();
                    if (Objects.equals(rasp8, "Brasov"))
                        k++;
                }
                int alegere9 = rg9.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(alegere9);
                if (rb != null) {
                    String rasp9 = (String) rb.getText();
                    if (Objects.equals(rasp9, "Two point one milion"))
                        k++;
                }
                int alegere10 = rg10.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(alegere10);
                if (rb != null) {
                    String rasp10 = (String) rb.getText();
                    if (Objects.equals(rasp10, "Bucharest"))
                        k++;
                }


                String finalscore = String.valueOf(k);


                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("finalscore", finalscore);
                myEdit.apply();
                k=0;

                startActivity(new Intent(TestConurbations.this, AfisareScor.class));

            }

        });







    }

    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(TestConurbations.this,"Finish the test before exit",Toast.LENGTH_LONG).show();
        startActivity(new Intent(TestConurbations.this, TestConurbations.class));
        return;
    }
}