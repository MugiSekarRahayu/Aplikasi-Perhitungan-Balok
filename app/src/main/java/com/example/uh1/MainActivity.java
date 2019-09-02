package com.example.uh1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    private EditText et_Panjang, et_Lebar, et_Tinggi;
    private double p, l, t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Panjang = findViewById(R.id.etPanjang);
        et_Lebar = findViewById(R.id.etLebar);
        et_Tinggi = findViewById(R.id.etTinggi);
    }
    public void hitung_keliling(View view) {
        String panjang = et_Panjang.getText().toString();
        String lebar = et_Lebar.getText().toString();
        String tinggi = et_Tinggi.getText().toString();
        p = Double.parseDouble(panjang);
        l = Double.parseDouble(lebar);
        t = Double.parseDouble(tinggi);



        Double keliling = 4*(p+l+t);

        Intent intent = new Intent(this, Result_Activity.class);
        intent.putExtra("data", String.valueOf(keliling));
        intent.putExtra("kata","KELILING");

        startActivity(intent);

    }
    public void hitung_luas(View view) {
        String panjang = et_Panjang.getText().toString();
        String lebar = et_Lebar.getText().toString();
        String tinggi = et_Tinggi.getText().toString();
        p = Double.parseDouble(panjang);
        l = Double.parseDouble(lebar);
        t = Double.parseDouble(tinggi);




        Double luas = 2*(p*l+p*t+l*t);


        Intent intent = new Intent(this, Result_Activity.class);
        intent.putExtra("data", String.valueOf(luas));
        intent.putExtra("kata", "LUAS");

        startActivity(intent);


    }

    public void hitung_volume(View view) {
        String panjang = et_Panjang.getText().toString();
        String lebar = et_Lebar.getText().toString();
        String tinggi = et_Tinggi.getText().toString();
        p = Double.parseDouble(panjang);
        l = Double.parseDouble(lebar);
        t = Double.parseDouble(tinggi);


        Double volume = p*l*t;

        Intent intent = new Intent(this, Result_Activity.class);
        intent.putExtra("data", String.valueOf(volume));
        intent.putExtra("kata", "VOLUME");

        startActivity(intent);
    }
}
