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

public class ips2017 extends AppCompatActivity{
    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA1,PilihanB1,PilihanC1,PilihanD1,PilihanE1;
    int nomor = 0;
    public static int hasil,benar,salah;


    //Pertanyaan Soal UNAS
    String[] pertanyaan_UNASips = new String[]{
            "1. Seorang ibu memproduksi dua jenis keripik pisang, yaitu rasa coklat dan rasa keju."+
                    "Setiap kilogram keripik rasa coklat mebutuhkan modal Rp10.000,00, sedangkan keripik rasa keju membutuhkan modal Rp15.000,00 per kilogram."+
                    "Modal yang dimiliki ibu tersebut Rp500.000,00. Tiap hari hanya bisa memproduksi paling banyak 40 kilogram. "+
                    "Keuntungan tiap kilogram keripik pisang rasa coklat adalah Rp2.500,00 dan keripik rasa keju Rp3.000,00 per kilogram."+
                    "Keuntungan terbesar yang dapat diperoleh ibu tersebut adalah … .",
            "2. Perjalanan dari Jakarta menuju Majalengka yang dilakukan Ibu Shinta menghabiskan waktu 2,5 jam."+
                "Hal ini berkaitan dengan...",
            "3. Fungsi penawaran suatu barang ditunjukkan oleh persamaan Q = -6 + 3P "+
                "Elastisitas penawaran pada P = 4 adalah...",
            "4. Mekanisme harga ditentukan oleh satu satunya produsen, "+
                    "sedangkan konsumen tidak mempunyai kekuatan dalam menetapkan harga"+
                "Kondisi pasar diatas terjadi pada bentuk pasar...",
            "5. Kondisi sosial masyarakat dapat bergerak majuatau mundur setelah masyarakat mengalami perubahan sosial."+
                    "Contoh perubahan sosial regres terdapat pada fenomena … ."

    };

    //Jawaban Soal UNAS
    String[] jawaban_UNASips = new String[]{
            "Rp 110.000,00","Rp 100.000,00","Rp 99.000,00","Rp 89.000,00","Rp 85.000,00",
            "konsep keterkaitan keruangan","konsep keterjangkauan","konsep aglomerasi","konsep lokasi","konsep jarak",
            "0,8","1,5","2","4","8",
            "Monopoli","Monopsoni","Oligopoli","Persaingan sempurna","Persaingan moopolistic",
            "Guru melakukan sosialisasi kepada peserta didik tentang dampak pergaulan bebas","Pemerintah memberi bantuan kredit dengan bunga rendah kepada pengusaha kecil","Kepala desa melakukan sosialisasi tentang rencana pembangunan puskesmas"," Kebakaran hutan menyebabkan aktivitas masyarakat terhambat","Pemerintah meningkatkan nilai standar Ujian Nasional",
    };

    //Jawaban UNAS yang benar
    String[] jawaban_benar = new String[]{
            "Rp 110.000,00",
            "konsep aglomerasi",
            "2",
            "Monopoli",
            "Monopoli","Monopsoni","Oligopoli","Persaingan sempurna","Persaingan moopolistic",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ips2017);

        pertanyaan = (TextView)findViewById(R.id.pertanyaan);
        rg = (RadioGroup)findViewById(R.id.radio_grup);
        PilihanA1 = (RadioButton)findViewById(R.id.pilihanA1);
        PilihanB1 = (RadioButton)findViewById(R.id.pilihanB1);
        PilihanC1 = (RadioButton)findViewById(R.id.pilihanC1);
        PilihanD1 = (RadioButton)findViewById(R.id.pilihanD1);
        PilihanE1 = (RadioButton)findViewById(R.id.pilihanE1);

        pertanyaan.setText(pertanyaan_UNASips[nomor]);
        PilihanA1.setText(jawaban_UNASips[0]);
        PilihanB1.setText(jawaban_UNASips[1]);
        PilihanC1.setText(jawaban_UNASips[2]);
        PilihanD1.setText(jawaban_UNASips[3]);
        PilihanE1.setText(jawaban_UNASips[4]);
    }
    public void lanjut(View view) {
        RadioButton jawaban_user = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
        String ambil_jawaban_user = jawaban_user.getText().toString();
        if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor]))benar++;
        else salah++;
        nomor++;
        if(nomor<pertanyaan_UNASips.length){
            pertanyaan.setText(pertanyaan_UNASips[nomor]);
            PilihanA1.setText(jawaban_UNASips[(nomor*5)+0]);
            PilihanB1.setText(jawaban_UNASips[(nomor*5)+1]);
            PilihanC1.setText(jawaban_UNASips[(nomor*5)+2]);
            PilihanD1.setText(jawaban_UNASips[(nomor*5)+3]);
            PilihanE1.setText(jawaban_UNASips[(nomor*5)+4]);
        }
        else{
            hasil =benar*20;
            Intent selesai = new Intent(getApplicationContext(),Hasilipa17.class);
            startActivity(selesai);


        }

    }
}
