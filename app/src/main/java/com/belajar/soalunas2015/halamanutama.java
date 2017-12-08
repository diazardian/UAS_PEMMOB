package com.belajar.soalunas2015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class halamanutama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanutama);
    }
    public void soal(View view) {
        Intent soal = new Intent(getApplicationContext(), pilihsoal.class);
        startActivity(soal);
    }
    public void tentang(View view) {
        Intent tentang = new Intent(getApplicationContext(), tentang.class);
        startActivity(tentang);
    }
    public void keluar(View view) {

        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
