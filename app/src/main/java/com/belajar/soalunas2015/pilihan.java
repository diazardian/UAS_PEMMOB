package com.belajar.soalunas2015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pilihan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan);
    }
    public void ipa(View view) {
        Intent ipa = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(ipa);
    }
    public void ips(View view) {
        Intent ips = new Intent(getApplicationContext(), ips2015.class);
        startActivity(ips);
    }
}
