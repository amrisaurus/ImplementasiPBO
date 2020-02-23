package com.amrisaurus.implementasipbo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        hasil = findViewById(R.id.txt_hasil);
        double total = getIntent().getDoubleExtra("EXTRA", 0);

        hasil.setText(String.valueOf(total));
    }
}
