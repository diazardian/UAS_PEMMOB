package com.belajar.soalunas2015;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.lang.*;

public class ipa2016 extends AppCompatActivity {
    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA,PilihanB,PilihanC,PilihanD,PilihanE;
    int nomor = 0;
    public static int hasil,benar,salah;

    //Pertanyaan Soal UNAS
    String[] pertanyaan_UNAS = new String[]{
      "1. Pemakaian sumber minyak bumi yang sangat besar untuk berbagai keperluan telah menguras" +
              "sumber - sumber minyak bumi dunia semakin lama semakin berkurang. Memang sampai sekarang" +
              "minyak bumi masih merupakan sumber energi utama sebagai keperluan kehidupan manusia," +
              "terutama untuk berbagai macam industri dan transportasi. Bila tidak ditemukan sumber energi lain" +
              "sebagai sumber energi alternatif, dalam waktu tidak lama lagi dunia akan mengalami krisis  energi." +
              "Simpulan yang dapat ditarik dari paragraf itu adalah",
       "Most  people  in  Nepal  are  farmers.  They  live  in  stone  or  timber  houses  with  thatched  or  slab" +
               "roofing. They grow rice, which is their main crop, maize, barley, potatoes, and vegetables. Sheep are their" +
               "main source of meet. Cows are kept to produce milk. Donkeys, mules, and dzose are used to carry goods" +
               "Nepal is an isolated country so hardly any modernizing has occurred. They have few facilities and mainly" +
               "live on their intensive subsistence agriculture.\n " +
       "2. The text mainly talks about.......",
       "3. Ingkaran dari “ Ada bunga yang tidak harum” adalah....",
       "4. Kedalam 1000 mL aquadest dimasukkan padatan Ca(OH)2 sebanyak 3,7 gram lalu diaduk" +
               "(penambahan volume Ca(OH)2 padat diabaikan). pH larutan setelah seluruh padatan terlarut" +
               "adalah..... (Ar:Ca=40,O-16,dan H=1)",
       "5. Pembabatan hutan bakau untuk dijadikan tambak ikan akan berdampak pada...."
    };

    //Jawaban Soal UNAS
    String[] jawaban_UNAS = new String[]{
            "Minyak bumi bukan satu - satunya sumber energi","Perlunya sumber energi alternatif dalam kehidupan","Pemakai sumber minyak bumi sangat besar","Persediaan minyak bumi semakin berkurang","Dunia akan mengalami krisis energi",
            "the borders of Nepal","the animals in Nepal","the facilities in Nepal","the people in Nepal","the scenery in Nepal",
            "Semua bunga harum baunya","Semua bunga tidak harum baunya","Ada bunga harum baunya","Ada bunga yang tidak harum atau Ada bunga harum ","Ada bunga yang tidak harum, tetapi ada juga bunga yang harum",
            "1+log1","2-log5","12+log5","13+log1","13-log5",
            "Penduduk sekitar pantai banyak terserang penyakit malaria","Hasil tangkapan ikan menurun","Pengasil nelayan meningkat","Harga kayu bakau menurun","Populasi ikan meningkat",
    };

    //Jawaban UNAS yang benar
    String[] jawaban_benar = new String[]{
            "Dunia akan mengalami krisis energi",
            "the people in Nepal",
            "Ada bunga harum baunya",
            "12+log5",
            "Hasil tangkapan ikan menurun",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pertanyaan = (TextView)findViewById(R.id.pertanyaan);
        rg = (RadioGroup)findViewById(R.id.radio_grup);
        PilihanA = (RadioButton)findViewById(R.id.pilihanA);
        PilihanB = (RadioButton)findViewById(R.id.pilihanB);
        PilihanC = (RadioButton)findViewById(R.id.pilihanC);
        PilihanD = (RadioButton)findViewById(R.id.pilihanD);
        PilihanE = (RadioButton)findViewById(R.id.pilihanE);

        pertanyaan.setText(pertanyaan_UNAS[nomor]);
        PilihanA.setText(jawaban_UNAS[0]);
        PilihanB.setText(jawaban_UNAS[1]);
        PilihanC.setText(jawaban_UNAS[2]);
        PilihanD.setText(jawaban_UNAS[3]);
        PilihanE.setText(jawaban_UNAS[4]);


    }

    public void next(View view) {
    RadioButton jawaban_user = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
    String ambil_jawaban_user = jawaban_user.getText().toString();
    if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor]))benar++;
    else salah++;
    nomor++;
    if(nomor<pertanyaan_UNAS.length){
        pertanyaan.setText(pertanyaan_UNAS[nomor]);
        PilihanA.setText(jawaban_UNAS[(nomor*5)+0]);
        PilihanB.setText(jawaban_UNAS[(nomor*5)+1]);
        PilihanC.setText(jawaban_UNAS[(nomor*5)+2]);
        PilihanD.setText(jawaban_UNAS[(nomor*5)+3]);
        PilihanE.setText(jawaban_UNAS[(nomor*5)+4]);
    }
    else{
        hasil =benar*20;
        Intent selesai = new Intent(getApplicationContext(),HasilUNAS.class);
        startActivity(selesai);


    }

}
}
