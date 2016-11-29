package com.example.argenisferrer.androidintro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class StickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sticker);

        Intent intent = getIntent();
        int StickerId = intent.getIntExtra("STICKER_ID",0);

        ImageView mMainImage = (ImageView) findViewById(R.id.mainImageView);
        mMainImage.setImageResource(StickerId);
    }
}
