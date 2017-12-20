package com.belajar.soalunas2015;

/**
 * Created by Samsung on 12/16/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
public class Hasilips17 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilips17);
        TextView hasil1 = (TextView)findViewById(R.id.hasil);
        TextView nilai1 = (TextView)findViewById(R.id.nilai);

        hasil1.setText("Jawaban Benar : "+ips2017.benar+"Jawaban Salah : "+ips2017.salah);
        nilai1.setText(""+ips2017.hasil);
    }
    public void ulangi1(View view){
        finish();
        Intent i = new Intent(getApplicationContext(),ips2017.class);
        startActivity(i);
    }
}
