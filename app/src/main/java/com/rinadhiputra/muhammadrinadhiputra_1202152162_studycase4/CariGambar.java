package com.rinadhiputra.muhammadrinadhiputra_1202152162_studycase4;

/**
 * Created by ASUS on 18/03/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class CariGambar extends AppCompatActivity {
    //mendeklarasikan variabel yang dibutuhkan
    ImageView picture;
    EditText source;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_gambar);
        setTitle("AsyncTask"); //set title pada tampilan

        //memanggil variabel yang ada pada layout
        picture = (ImageView)findViewById(R.id.pic);
        source = (EditText)findViewById(R.id.link);
    }
    //method saat button ditekan
    public void search(View view) {
        //loading gambar dari internet ke imageview
        Picasso.with(CariGambar.this).load(source.getText().toString())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(picture);
    }
}