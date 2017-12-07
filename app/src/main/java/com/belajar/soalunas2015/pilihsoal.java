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
        Intent un15 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(un15);
    }
}
