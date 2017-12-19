package com.belajar.soalunas2015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pilihan2016 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan2016);
    }
    public void ipa16(View view) {
        Intent ipa = new Intent(getApplicationContext(), ipa2016.class);
        startActivity(ipa);
    }
    public void ips16(View view) {
        Intent ips = new Intent(getApplicationContext(), ips2016.class);
        startActivity(ips);
    }
}
