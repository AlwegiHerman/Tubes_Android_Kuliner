package com.example.alwegi.kuliner.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import com.example.alwegi.kuliner.R;
import com.example.alwegi.kuliner.activity_home;
import com.example.alwegi.kuliner.maps.maps_sate;
import com.squareup.picasso.Picasso;

public class detail_sate extends AppCompatActivity {

    //deklarasi variabel
    ImageView sate1;
    CardView card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menampilkan konten detail yang terkait
        setContentView(R.layout.detail_sate);

        //set gambar dari URL
        String imageUri = "https://www.goodindonesianfood.com/story/file/2016/04/malang-classic-sate-bunul-h-paino1--1170x780.jpg";
        //menghubungkan layout dengan activity melalui ID
        sate1 = (ImageView) findViewById(R.id.sate);

        //fungsi dari picasso
        Picasso.with(this).load(imageUri).into(sate1);

        //instansiasi objek imageview berdasarkan id yang terkait
        ImageView img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),activity_home.class);
                startActivity(i);
                finish();
            }
        });

        //instansiasi objek cardview berdasarkan id yang terkait
        card1 = (CardView) findViewById(R.id.lokasi);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),maps_sate.class);
                startActivity(i);
            }
        });
    }
}
