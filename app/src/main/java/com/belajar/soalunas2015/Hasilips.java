package com.belajar.soalunas2015;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Hasilips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilips);
        TextView hasil1 = (TextView)findViewById(R.id.hasil1);
        TextView nilai1 = (TextView)findViewById(R.id.nilai1);

        hasil1.setText("Jawaban Benar : "+ips2015.benar+"Jawaban Salah : "+ips2015.salah);
        nilai1.setText(""+ips2015.hasil);
    }
    public void ulangi1(View view){
        finish();
        Intent i = new Intent(getApplicationContext(),ips2015.class);
        startActivity(i);
    }
    }

