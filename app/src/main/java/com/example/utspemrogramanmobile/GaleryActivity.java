package com.example.utspemrogramanmobile;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.utspemrogramanmobile.model.HP;

import java.util.List;

public class GaleryActivity extends AppCompatActivity {


    List<HP> HPs;
    int indeksTampil = 0;
    String merkHP;
    Button btnPertama, btnTerakhir, btnSebelumnya, btnBerikutnya;
    TextView txDeskripsi, txJudul, txType;
    ImageView ivFotoHP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        Intent intent = getIntent();
        merkHP = intent.getStringExtra(MainActivity.SERIES_GALERI_KEY);
        HPs = DataProvider.getHpbytipe(this, merkHP);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> HPPertama());
        btnTerakhir.setOnClickListener(view -> HPTerakhir());
        btnSebelumnya.setOnClickListener(view -> HPSebelumnya());
        btnBerikutnya.setOnClickListener(view -> HPBerikutnya());


        txType = findViewById(R.id.txType);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHP = findViewById(R.id.gambarHP);
        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Katalog HP " + merkHP);
    }


    private void tampilkanProfil() {
        HP k = HPs.get(indeksTampil);
        Log.d("Realme", "Menampilkan Realme " + k.getMerk());
        txType.setText(k.getType());
        txDeskripsi.setText(k.getDeskripsi());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ivFotoHP.setImageDrawable(this.getDrawable(k.getDrawableRes()));
        }
    }

    private void HPPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this, "Sudah di posisi pertama", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void HPTerakhir() {
        int posAkhir = HPs.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this, "Sudah di posisi terakhir", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void HPBerikutnya() {
        if (indeksTampil == HPs.size() - 1) {
            Toast.makeText(this, "Sudah di posisi terakhir", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void HPSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this, "Sudah di posisi pertama", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}

