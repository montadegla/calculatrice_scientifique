package com.example.calculatricesf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    Button toDEC;
    Button toOCT;
    Button toHEX;
    Button toBIN;
    Button pi;
    Button random;
    Button log10;
    Button inverse_de_x;
    Button invCOS;
    Button invSIN;
    Button invTAN;
    Button pageprecedent;
    EditText numb1;

    TextView Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        numb1 = findViewById(R.id.numb1);
        toDEC = findViewById(R.id.toDEC);
        Result = findViewById(R.id.Result);
        toOCT = findViewById(R.id.toOCT);
        toHEX = findViewById(R.id.toHEX);
        toBIN = findViewById(R.id.toBIN);
        pi = findViewById(R.id.pi);
        random = findViewById(R.id.random);
        log10 = findViewById(R.id.log10);
        inverse_de_x = findViewById(R.id.inverse_de_x);
        invCOS = findViewById(R.id.invCOS);
        invSIN = findViewById(R.id.invSIN);
        invTAN = findViewById(R.id.invTAN);
        pageprecedent = findViewById(R.id.pageprecedent);




        toDEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1 = Integer.parseInt(numb1.getText().toString());
                String n = Integer.toHexString(n1);

                Result.setText(" "+n);


            }
        });
        toOCT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1 = Integer.parseInt(numb1.getText().toString());
                String n = Integer.toOctalString(n1);

                Result.setText(" "+n);


            }
        });
        toDEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1 = Integer.parseInt(numb1.getText().toString());


                Result.setText(" "+n1);


            }
        });
        toBIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1 = Integer.parseInt(numb1.getText().toString());
                String n = Integer.toBinaryString(n1);

                Result.setText(" "+n);


            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double n = Math.PI;
                Result.setText(" "+n);


            }
        });
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n = Math.random();
                Result.setText(" "+n);


            }
        });
        log10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(numb1.getText().toString());

                double n = Math.log10(n1);
                Result.setText(" "+n);


            }
        });
        inverse_de_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(numb1.getText().toString());

                double n =1/n1;
                Result.setText(" "+n);


            }
        });
        invCOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(numb1.getText().toString());

                double n = Math.acos(n1);
                Result.setText(" "+n);


            }
        });
        invSIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(numb1.getText().toString());

                double n = Math.asin(n1);
                Result.setText(" "+n);


            }
        });
        invTAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(numb1.getText().toString());

                double n = Math.atan(n1);
                Result.setText(" "+n);


            }
        });
        pageprecedent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code pour passer à la deuxième interface
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


}
