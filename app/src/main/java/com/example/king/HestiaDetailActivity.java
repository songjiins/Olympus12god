package com.example.king;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class HestiaDetailActivity extends AppCompatActivity {

    Button button_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hestia);

        ImageView hestiaImage = findViewById(R.id.hestiaImage);
        hestiaImage.setImageResource(R.drawable.hestia2);

        TextView interpretationText = findViewById(R.id.text_hestia);

        VideoView videoView1 = findViewById(R.id.videoView1);
        videoView1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.hestiavideo);


        videoView1.setOnPreparedListener(mp -> {
            mp.setLooping(true);
            videoView1.start();
        });

        button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HestiaDetailActivity.this, GOD1.class);
                startActivity(intent);
            }
        });
    }
}
