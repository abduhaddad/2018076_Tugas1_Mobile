package com.example.a2018076_tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    EditText inpTinggi, inpAlas, inpHasil;
    Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        inpAlas = findViewById(R.id.inpAlas);
        inpTinggi = findViewById(R.id.inpTinggi);
        btnHasil = findViewById(R.id.btnHasil);
        inpHasil = findViewById(R.id.inpHasil);
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inpAlas.length() == 0 || inpTinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Alas dan Tinggi tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                } else {
                    double alas = Double.parseDouble(inpAlas.getText().toString());
                    double tinggi = Double.parseDouble(inpTinggi.getText().toString());
                    double hasil = LuasSegitiga(alas, tinggi);
                    String hsl = String.valueOf(hasil);
                    inpHasil.setText(hsl);
                }
            }
        });
    }

    double LuasSegitiga(double input_alas, double input_tinggi) {
        return input_alas * input_tinggi / 2;
    }
}