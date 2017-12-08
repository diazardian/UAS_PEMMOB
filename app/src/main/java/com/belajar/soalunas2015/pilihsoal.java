package com.belajar.soalunas2015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pilihsoal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihsoal);
    }
    public void un15(View view) {
        Intent un15 = new Intent(getApplicationContext(), pilihan.class);
        startActivity(un15);
    }
    public void un16(View view) {
        Intent un15 = new Intent(getApplicationContext(), Pilihan2016.class);
        startActivity(un15);
    }
    public void un17(View view) {
        Intent un15 = new Intent(getApplicationContext(), Pilihan2017.class);
        startActivity(un15);
    }
}
