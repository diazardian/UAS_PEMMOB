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
            //"1. Hujan deras,gempabumi,tanah longsor,angin puting beliung, dan banjir merupakan " +
              //      "peristiwa yang sering melanda beberapa wilayah di negara kita." +
               //     "Pendekatan geografi yang paling tepat untuk mengkaji peristiwa tersebut adalah ....",
            //"2. Kondisi arus urbanisasi yang meningkat paksa lebaran hingga menambah kepadatan penduduk " +
              //      "di daerah kota serta menambah kemacetan lalu lintas di perkotaan. " +
               //     "Kondisi tersebut dalam geografi termasuk unsur .... ",
            //"3. Sebagian besar menghendaki perubahan ke arah yang lebih baik di segala bidang kehidupan " +
              //      "seperti bidang politik,hukum,ekonomi,dan sosial. Perwujudan nilai yang mendasari perilaku tersebut adalah nilai ....",
            //"4. Para pengendara di jalan raya harus memahami dan menyesuaikan tindakannya dengan norma dan nilai yang berlaku. " +
              //      "Deskripsi tersebut menunjukkan adanya unsur pembentuk keteraturan sosial yaitu ....",
            //"5. Perusahaan mengadakan survei produk baru untuk mendapat data masyarakat mana yang menyukai produk barunya. " +
                    "Dari permasalahan ekonomi di atas yang merupakan masalah ekonomi modern adalah ..."

    };

    //Jawaban Soal UNAS
    String[] jawaban_UNASips = new String[]{
            "Pendekatan keruangan","Pendekatan kelingkungan","Pendekatan kompleks wilayah","Pendekatan ekologi","Pendekatan korologi",
            "Atmosfer","Litosfer","Hidrosfer","Biosfer","Antroposfer",
            "Dominan","Material","Kerohanian","Kebaikan","Vital",
            "Pola perilaku","Tertib sosial","Order","Keajegan","Tindakan sosial",
            "Bagaimana cara menyalurkannya","Berapa banyak barang diproduksi","Barang apa yang akan diproduksi","Bagaimana cara memproduksi","Untuk siapa barang diproduksi",
    };

    //Jawaban UNAS yang benar
    String[] jawaban_benar = new String[]{
            "Pendekatan ekologi",
            "Antroposfer",
            "Dominan",
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
