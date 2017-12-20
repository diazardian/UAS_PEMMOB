package com.belajar.soalunas2015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pilihan2017 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan2017);
    }
    public void ipa2017(View view) {
        Intent ipa2017 = new Intent(getApplicationContext(), ipa2017.class);
        startActivity(ipa2017);
    }
    public void ips2017(View view) {
        Intent ips2017 = new Intent(getApplicationContext(), ips2017.class);
        startActivity(ips2017);
    }
}
