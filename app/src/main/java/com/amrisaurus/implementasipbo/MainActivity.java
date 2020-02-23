package com.amrisaurus.implementasipbo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nilai1, nilai2;
    Button hitung1, hitung2, hitung3, hitung4;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nilai1 = findViewById(R.id.edt_nilai1);
        nilai2 = findViewById(R.id.edt_nilai2);
        hitung1 = findViewById(R.id.btn_hitung_tambah_yaaa);
        hitung2 = findViewById(R.id.btn_hitung_kurang_yes);
        hitung3 = findViewById(R.id.btn_hitung_bagi_sama_rata);
        hitung4 = findViewById(R.id.btn_hitung_kali_kali_kali);
        hasil = findViewById(R.id.txt_hasil);

        hitung1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = Integer.valueOf(nilai1.getText().toString());
                int value2 = Integer.valueOf(nilai2.getText().toString());

                double total = value1 + value2;

//                hasil.setText(String.valueOf(total));
                Intent intent = new Intent(MainActivity.this, HasilActivity.class);
                intent.putExtra("EXTRA",total);
                startActivity(intent);

            }
        });

        hitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = Integer.valueOf(nilai1.getText().toString());
                int value2 = Integer.valueOf(nilai2.getText().toString());

                double total = value1 - value2;

                Intent intent = new Intent(MainActivity.this, HasilActivity.class);
                intent.putExtra("EXTRA",total);
                startActivity(intent);
            }
        });

        hitung3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value1 = Integer.valueOf(nilai1.getText().toString());
                double value2 = Integer.valueOf(nilai2.getText().toString());

                double total = value1 / value2;

                Intent intent = new Intent(MainActivity.this, HasilActivity.class);
                intent.putExtra("EXTRA",total);
                startActivity(intent);
            }
        });

        hitung4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value1 = Integer.valueOf(nilai1.getText().toString());
                double value2 = Integer.valueOf(nilai2.getText().toString());

                double total = value1 * value2;

                Intent intent = new Intent(MainActivity.this, HasilActivity.class);
                intent.putExtra("EXTRA",total);
                startActivity(intent);
            }
        });
    }
}
