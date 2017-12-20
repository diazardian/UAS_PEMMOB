package com.belajar.soalunas2015;

/**
 * Created by Samsung on 12/16/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ipa2017 extends AppCompatActivity {
    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA1,PilihanB1,PilihanC1,PilihanD1,PilihanE1;
    int nomor = 0;
    public static int hasil,benar,salah;


    //Pertanyaan Soal UNAS
    String[] pertanyaan_UNASipa = new String[]{
            "1. Sebuah benda bermassa 4 kg dijatuhkan dari ketinggian 25 m tanpa kecepatan awal. "+
                     "Jika percepatan gravitasi bumi g = 10,"+
                    "energi potensial dan energi kinetik benda pada ketinggian 10 m berturut-turut adalah ...",
            "2. Di bawah ini adalah beberapa pernyataan :" +
                    "1) Populasi besar" +
                    "2) Terjadinya migrasi" +
                    "3) perkawinan terjadi secara acak" +
                    "4) terjadi mutasi gen" +
                    "5) memiliki viabilitas dan fertilits tinggi" +
                    "Hukum Hady Weinberg hanya berlaku dalam keadaan ….",
            "3. Suatu senyawa mengandung 14% hidrogen dan 86% karbon. "+
                    "Jika Mr senyawa = 56, rumus empiris dan rumus molekul senyawa tersebut adalah …." +
                    "(Ar H = 1 ; dan C = 12)",
            "4. Sisi mengalami sakit kepala selama 4 hari, kemudian periksa ke dokter dan diukur tekanan darahnya."+
                    "Hasilnya tekanan darah Sisi 160/90mmHg."+
                    "Berdasarkan data tersebut menunjukkan bahwa Sisi mengalami …",
            "5. Jumlah semua bilangan ganjil antara 50 dan 100 adalah …."

    };

    //Jawaban Soal UNAS
    String[] jawaban_UNASipa = new String[]{
            "392 J dan 588 J","490 J dan 490 J","588 J dan 392 J","980 J dan 0","0 dan 980 J",
            "1–2–3","1–3–4","1–3–5","2–3–4","3–4–5",
            "CH4 dan CH4","CH2 dan C2H4","C3H4 dan C3H4","CH2 dan C4H8","C2H5 dan C4H10",
            "Anemia","Leukimia","Hipotensi","Hipertensi","Sklerosis",
            "875","975","1275","1425","1875",
    };

    //Jawaban UNAS yang benar
    String[] jawaban_benar = new String[]{
            "392 J dan 588 J",
            "1–3–5",
            "CH2 dan C4H8",
            "Hipertensi",
            "1875",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipa2017);

        pertanyaan = (TextView)findViewById(R.id.pertanyaan);
        rg = (RadioGroup)findViewById(R.id.radio_grup);
        PilihanA1 = (RadioButton)findViewById(R.id.pilihanA1);
        PilihanB1 = (RadioButton)findViewById(R.id.pilihanB1);
        PilihanC1 = (RadioButton)findViewById(R.id.pilihanC1);
        PilihanD1 = (RadioButton)findViewById(R.id.pilihanD1);
        PilihanE1 = (RadioButton)findViewById(R.id.pilihanE1);

        pertanyaan.setText(pertanyaan_UNASipa[nomor]);
        PilihanA1.setText(jawaban_UNASipa[0]);
        PilihanB1.setText(jawaban_UNASipa[1]);
        PilihanC1.setText(jawaban_UNASipa[2]);
        PilihanD1.setText(jawaban_UNASipa[3]);
        PilihanE1.setText(jawaban_UNASipa[4]);
    }
    public void lanjut(View view) {
        RadioButton jawaban_user = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
        String ambil_jawaban_user = jawaban_user.getText().toString();
        if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor]))benar++;
        else salah++;
        nomor++;
        if(nomor<pertanyaan_UNASipa.length){
            pertanyaan.setText(pertanyaan_UNASipa[nomor]);
            PilihanA1.setText(jawaban_UNASipa[(nomor*5)+0]);
            PilihanB1.setText(jawaban_UNASipa[(nomor*5)+1]);
            PilihanC1.setText(jawaban_UNASipa[(nomor*5)+2]);
            PilihanD1.setText(jawaban_UNASipa[(nomor*5)+3]);
            PilihanE1.setText(jawaban_UNASipa[(nomor*5)+4]);
        }
        else{
            hasil =benar*20;
            Intent selesai = new Intent(getApplicationContext(),Hasilipa17.class);
            startActivity(selesai);


        }

    }
}
