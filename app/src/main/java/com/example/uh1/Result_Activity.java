package com.example.uh1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_);

        Intent intent = getIntent();

        String hasil = intent.getStringExtra("data");
        String rumus1 = intent.getStringExtra("anu");
        TextView rumus2 = findViewById(R.id.tvResult);
        rumus2.setText(rumus1);
        TextView output = findViewById(R.id.tvvress);
        output.setText(hasil);
    }
}
