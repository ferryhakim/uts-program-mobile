package com.example.utspemrogramanmobile;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnRealme,btnRedmi,btnSamsung;
    public static final String SERIES_GALERI_KEY = "SERIES_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnRealme = findViewById(R.id.btn_buka_type_Realme);
        btnRedmi = findViewById(R.id.btn_buka_type_Redmi);
        btnSamsung= findViewById(R.id.btn_buka_type_Samsung);
        btnRealme.setOnClickListener(view -> bukaGaleri("Realme"));
        btnRedmi.setOnClickListener(view -> bukaGaleri("Redmi"));
        btnSamsung.setOnClickListener(view -> bukaGaleri("Samsung"));
    }

    private void bukaGaleri(String merkHP) {
        Log.d("MAIN","Buka activity Realme");
        Intent intent = new Intent(this,GaleryActivity.class);
        intent.putExtra(SERIES_GALERI_KEY, merkHP);
        startActivity(intent);
    }
}