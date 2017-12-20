package com.belajar.soalunas2015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HasilUnasipa16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_unasipa16);
        setContentView(R.layout.activity_hasilips);
        TextView hasil1 = (TextView)findViewById(R.id.hasil1);
        TextView nilai1 = (TextView)findViewById(R.id.nilai1);

        hasil1.setText("Jawaban Benar : "+ipa2016.benar+"Jawaban Salah : "+ipa2016.salah);
        nilai1.setText(""+ipa2016.hasil);
    }
    public void ulangi1(View view){
        finish();
        Intent i = new Intent(getApplicationContext(),ips2015.class);
        startActivity(i);
    }


}
