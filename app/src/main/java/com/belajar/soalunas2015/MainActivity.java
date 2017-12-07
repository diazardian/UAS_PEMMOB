package com.belajar.soalunas2015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA,PilihanB,PilihanC,PilihanD,PilihanE;
    int nomor = 0;
    public static int hasil,benar,salah;


    //Pertanyaan Soal UNAS
    String[] pertanyaan_UNAS = new String[]{
      "1. Jarak fokus lensa obyektif sebuah mikroskop 2 cm dan okulernya 2,5 cm. " +
              "Sebuah Obyek diletakkan sejauh 2,5 cm didepan lensa obyektif. Apabila mikroskop digunakan dengan" +
              "mata tidak berakomodasi,maka perbesaran mikroskop adalah...... (Sn=25 cm)",
       "2. Seberkas cahaya monokromatik dengan panjang gelombang 5*10^7 m mengenai sisi yang terdiri dari N garis/mm." +
               "Jika sudut deviasi orde pertama sebesar 30 derajat,maka nilai N adalah....",
       "3. Hasil analisis terhadap suatu senyawa oksida nitrogen menunjukkan bahwa senyawa tersebut" +
               "mengandung 30% masa nitrogen. Rumus molekul senyawa tersebut (Mr = 92)" +
               "adalah..... (Ar:N=14,O=16)",
       "4. Kedalam 1000 mL aquadest dimasukkan padatan Ca(OH)2 sebanyak 3,7 gram lalu diaduk" +
               "(penambahan volume Ca(OH)2 padat diabaikan). pH larutan setelah seluruh padatan terlarut" +
               "adalah..... (Ar:Ca=40,O-16,dan H=1)",
       "5. Pembabatan hutan bakau untuk dijadikan tambak ikan akan berdampak pada...."
    };

    //Jawaban Soal UNAS
    String[] jawaban_UNAS = new String[]{
            "4 kali","10 kali","30 kali","40 kali","70 kali",
            "1000 garis/mm","500 garis/mm","100 garis/mm","50 garis/mm","10 garis/mm",
            "NO2","N2O","N2O3","N2O4","N2O5",
            "1+log1","2-log5","12+log5","13+log1","13-log5",
            "Penduduk sekitar pantai banyak terserang penyakit malaria","Hasil tangkapan ikan menurun","Pengasil nelayan meningkat","Harga kayu bakau menurun","Populasi ikan meningkat",
    };

    //Jawaban UNAS yang benar
    String[] jawaban_benar = new String[]{
            "40 kali",
            "1000 garis/mm",
            "N2O4",
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
