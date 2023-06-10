# 
Calculatrice scientifique#
package com.example.calculatricesf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button addition;
Button soustraction;
Button multiplication;
Button division;
Button puissance;
Button racine_carre;
Button LOG;
Button EXP;
Button COS;
Button SIN;
Button TAN;
Button pagesuivant;
 EditText Number1;
 EditText Number2;
 TextView Resultat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1 = findViewById(R.id.Number1);
        Number2 = findViewById(R.id.Number2);
        addition = findViewById(R.id.addition);
        Resultat = findViewById(R.id.Resultat);
        soustraction = findViewById(R.id.soustraction);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        puissance = findViewById(R.id.puissance);
        racine_carre = findViewById(R.id.racine_carre);
        LOG = findViewById(R.id.LOG);
        EXP = findViewById(R.id.EXP);
        COS = findViewById(R.id.COS);
        SIN = findViewById(R.id.SIN);
        TAN = findViewById(R.id.TAN);
        pagesuivant = findViewById(R.id.pagesuivant);




        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());
                double n2 = Double.parseDouble(Number2.getText().toString());
                double n=n1+n2;
                Resultat.setText(" "+n);


            }
        });
        soustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());
                double n2 = Double.parseDouble(Number2.getText().toString());
                double n=n1-n2;
                Resultat.setText(" "+n);


            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());
                double n2 = Double.parseDouble(Number2.getText().toString());
                double n=n1*n2;
                Resultat.setText(" "+n);


            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());
                double n2 = Double.parseDouble(Number2.getText().toString());
                double n=n1/n2;
                Resultat.setText(" "+n);


            }
        });
        puissance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());
                double n2 = Double.parseDouble(Number2.getText().toString());
                double n = Math.pow(n1,n2);
                Resultat.setText(" "+n);


            }
        });
        racine_carre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());

                double n = Math.sqrt(n1);
                Resultat.setText(" "+n);


            }
        });
        LOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());

                double n = Math.log(n1);
                Resultat.setText(" "+n);


            }
        });
        EXP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());

                double n = Math.exp(n1);
                Resultat.setText(" "+n);


            }
        });
        COS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());

                double n = Math.cos(n1);
                Resultat.setText(" "+n);


            }
        });
        SIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());

                double n = Math.sin(n1);
                Resultat.setText(" "+n);


            }
        });
        TAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(Number1.getText().toString());

                double n = Math.tan(n1);
                Resultat.setText(" "+n);


            }
        });
        pagesuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code pour passer à la deuxième interface
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}
