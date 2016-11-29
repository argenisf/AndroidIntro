package com.example.argenisferrer.androidintro;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mMainButton;
    private Context mContext;
    private Sticker mSticker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainButton = (Button) findViewById(R.id.btnMain);
        mContext = this;
        mSticker = new Sticker(true);

        mMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, StickerActivity.class);
                intent.putExtra("STICKER_ID", mSticker.getSticketId());
                startActivity(intent);
            }
        });
    }
}
