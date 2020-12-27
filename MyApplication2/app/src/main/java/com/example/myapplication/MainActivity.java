package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText a = findViewById(R.id.quiz);
        EditText b = findViewById(R.id.hw);
        EditText c = findViewById(R.id.medterm);
        EditText d = findViewById(R.id.Final);
        Button calculate = findViewById(R.id.button1);
        Button reset = findViewById(R.id.button2);
        TextView Result = findViewById(R.id.Result);

       calculate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               int aa = Integer.parseInt(a.getText().toString());
               int bb = Integer.parseInt(b.getText().toString());
               int cc = Integer.parseInt(c.getText().toString());
               int dd = Integer.parseInt(d.getText().toString());
               int result = aa + bb + cc + dd;

               if (result >= 90) {
                   Result.setText("A");
                   Result.setTextColor(Color.BLUE);


               } else if (result >= 80 && result <= 89) {
                   Result.setText("B");
                   Result.setTextColor(Color.BLUE);

               } else if (result >= 70 && result <= 79) {
                   Result.setText("C");
                   Result.setTextColor(Color.BLUE);

               } else if (result < 60) {
                   Result.setText("F");
                   Result.setTextColor(Color.parseColor("#F44336"));
               }


           }
       });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setText("");
                b.setText("");
                c.setText("");
                d.setText("");

            }
        });

    }



}