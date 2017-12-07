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
      "1. Sejak itu, jumlahnya bertambah dua kali lipat setiap 25 tahun." +
            "(1) Setelah tahun 1680, Inggris tidak lagi menjadi sumber terbesar imigrasi." +
            "(2) Banyak pula orang yang terpaksa meninggalkan kampung halamannya untuk " +
                "menghindari kemiskinan." +
            "(3) Pada tahun 1690, populasi penduduk Amerika telah berkembang menjadi seperempat" +
            "juta orang." +
            "(4) Ribuan pengungsi berbondong-bondong meninggalkan daratan Eropa untuk melarikan" +
            "diri dari bencana perang." +
              "" +
            "Perbaikan urutan yang tepat untuk menjadi paragraf cerita sejarah yang baik adalah" ,
      "2. Survey Badan Pusat Stastistik di Indonesia pada tahun 2013 menunjukkan, orang Indonesia" +
          "paling gemar menonton telivisi, yakni sekitar 91,68 persen,” kata Hamid. Sebelumnya, pada" +
          "12–13 November 2015, diselenggarakan pelatihan bagi 68 guru dari 33 propinsi mengenai" +
          "buku pengenalan terhadap jasa keuangan itu. Para peserta pelatihan juga berlatih" +
          "menggunakan permainan Sikapiuangmu, sebagai penerapan melalui permainan pengenalan" +
          "produk dan jasa keuangan. Diharapkan, siswa dapat bermain sambil balajar." +
              "" +
          "Kata yang tepat untuk memperbaiki kata yang tidak baku dalam paragraf tersebut adalah ...." ,
      "3. (1) Saya sekarang setiap hari menyempatkan membaca buku, terutama membaca buku\n" +
              "sastra. (2) Manfaat yang dihasilkan dari sebuah proses membaca karya sastra dapat\n" +
              "dirasakan langsung oleh penikmat sastra. (3) Menurut saya sebuah karya sastra mempunya\n" +
              "andil besar dalam menyebarkan manfaat bagi diri lewat keindahannya. (4) Bukan\n" +
              "sebaliknya, menyebarkan keindahan yang melenakan dan tidak membawa gerak perubahan\n" +
              "karena sastra lahir dari kejernihan jiwa, dan perasaan seseorang. (5) Oleh sebab itu, manfaat\n" +
              "tersebut dapat dirasakan antara lain: melembutkan perasan dan hati, memberi kesadaran akan\n" +
              "kebenaran hidup, kegembiran dan pengobat kegelisahan hati, memberikan penghayatan\n" +
              "mendalam, dan yang paling penting lagi menjadikan manusia berbudaya dan peka\n" +
              "lingkungan.\n" +
              "Kalimat fakta dalam paragraf tersebut, terdapat pada nomor ....\n" ,
    };

    //Jawaban Soal UNAS
    String[] jawaban_UNAS = new String[]{
            "(1),(2),(3),(4),dan(5)","(2),(5),(4),(1),dan(3)","(2),(3),(5),(4),dan(1)","(4),(1),(2),(5),dan(3)","(4),(2),(3),(4),dan(1)",
            "survai, televisi, propinsi","survei, televisi, provinsi","survei, telipisi, propinsi","survey, telivisi, provinsi","survay, televisi, propinsi",
            "(1)","(2)","(3)","(4)","(5)",
    };

    //Jawaban UNAS yang benar
    String[] jawaban_benar = new String[]{
            "(1),(2),(3),(4),dan(5)",
            "survei, televisi, provinsi",
            "(1)",
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
        nomor++;
        if(nomor<pertanyaan_UNAS.length){
            pertanyaan.setText(pertanyaan_UNAS[nomor]);
            PilihanA.setText(jawaban_UNAS[(nomor*5)+0]);
            PilihanB.setText(jawaban_UNAS[(nomor*5)+1]);
            PilihanC.setText(jawaban_UNAS[(nomor*5)+2]);
            PilihanD.setText(jawaban_UNAS[(nomor*5)+3]);
            PilihanE.setText(jawaban_UNAS[(nomor*5)+4]);
            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor]))benar++;
            else salah++;
        }
        else{
            hasil=benar*20;
            Intent selesai = new Intent(getApplicationContext(),HasilUNAS.class);
            startActivity(selesai);


        }

    }
}
