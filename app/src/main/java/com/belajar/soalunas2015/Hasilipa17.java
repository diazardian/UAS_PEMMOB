package com.belajar.soalunas2015;

/**
 * Created by Samsung on 12/16/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Hasilipa17 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilipa17);
        TextView hasil1 = (TextView)findViewById(R.id.hasil);
        TextView nilai1 = (TextView)findViewById(R.id.nilai);

        hasil1.setText("Jawaban Benar : "+ipa2017.benar+"Jawaban Salah : "+ipa2017.salah);
        nilai1.setText(""+ipa2017.hasil);
    }
    public void ulangi1(View view){
        finish();
        Intent i = new Intent(getApplicationContext(),ipa2017.class);
        startActivity(i);
    }
}
