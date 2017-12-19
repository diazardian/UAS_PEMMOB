package com.belajar.soalunas2015;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ips2016 extends AppCompatActivity {

    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA1,PilihanB1,PilihanC1,PilihanD1,PilihanE1;
    int nomor = 0;
    public static int hasil,benar,salah;


    //Pertanyaan Soal UNAS
    String[] pertanyaan_UNASips = new String[]{
            "1. Pemakaian sumber minyak bumi yang sangat besar untuk berbagai keperluan telah menguras" +
                    "sumber - sumber minyak bumi dunia semakin lama semakin berkurang. Memang sampai sekarang" +
                    "minyak bumi masih merupakan sumber energi utama sebagai keperluan kehidupan manusia," +
                    "terutama untuk berbagai macam industri dan transportasi. Bila tidak ditemukan sumber energi lain" +
                    "sebagai sumber energi alternatif, dalam waktu tidak lama lagi dunia akan mengalami krisis  energi." +
                    "Simpulan yang dapat ditarik dari paragraf itu adalah",
            "Most  people  in  Nepal  are  farmers.  They  live  in  stone  or  timber  houses  with  thatched  or  slab +
            "roofing. They grow rice, which is their main crop, maize, barley, potatoes, and vegetables. Sheep are their +
            "main source of meet. Cows are kept to produce milk. Donkeys, mules, and dzose are used to carry goods" +
                    "Nepal is an isolated country so hardly any modernizing has occurred. They have few facilities and mainly" +
                    "live on their intensive subsistence agriculture.\n " +
                    "2. The text mainly talks about.......",
            "3. Ingkaran dari “ Ada bunga yang tidak harum” adalah....",
            //"4. Para pengendara di jalan raya harus memahami dan menyesuaikan tindakannya dengan norma dan nilai yang berlaku. " +
              //      "Deskripsi tersebut menunjukkan adanya unsur pembentuk keteraturan sosial yaitu ....",
            //"5. Perusahaan mengadakan survei produk baru untuk mendapat data masyarakat mana yang menyukai produk barunya. " +
                    "Dari permasalahan ekonomi di atas yang merupakan masalah ekonomi modern adalah ..."

    };

    //Jawaban Soal UNAS
    String[] jawaban_UNASips = new String[]{
            "Minyak bumi bukan satu - satunya sumber energi","Perlunya sumber energi alternatif dalam kehidupan","Pemakai sumber minyak bumi sangat besar","Persediaan minyak bumi semakin berkurang","Dunia akan mengalami krisis energi",
            "the borders of Nepal","the animals in Nepal","the facilities in Nepal","the people in Nepal","the scenery in Nepal",
            "Semua bunga harum baunya","Semua bunga tidak harum baunya","Ada bunga harum baunya","Ada bunga yang tidak harum atau Ada bunga harum ","Ada bunga yang tidak harum, tetapi ada juga bunga yang harum",
            "Pola perilaku","Tertib sosial","Order","Keajegan","Tindakan sosial",
            "Bagaimana cara menyalurkannya","Berapa banyak barang diproduksi","Barang apa yang akan diproduksi","Bagaimana cara memproduksi","Untuk siapa barang diproduksi",
    };

    //Jawaban UNAS yang benar
    String[] jawaban_benar = new String[]{
            "Dunia akan mengalami krisis energi",
            "the people in Nepal",
            "Ada bunga harum baunya",
            "Tertib sosial",
            "Untuk siapa barang diproduksi",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ips2015);

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
            Intent selesai = new Intent(getApplicationContext(),Hasilips.class);
            startActivity(selesai);


        }

    }
}
