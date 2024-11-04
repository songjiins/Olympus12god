package com.example.king;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class AphroditeDetailActivity extends AppCompatActivity {

    Button button_back1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aphrodite);

        ImageView hestiaImage = findViewById(R.id.aphroditeImage);
        hestiaImage.setImageResource(R.drawable.aphrodite2);

        VideoView videoView2 = findViewById(R.id.videoView2);
        videoView2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.aphroditevideo);


        videoView2.setOnPreparedListener(mp -> {
                    mp.setLooping(true);
                    videoView2.start();
                });
        TextView textView = findViewById(R.id.text_aphrodite);

        button_back1 = findViewById(R.id.button_back1);
        button_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AphroditeDetailActivity.this, GOD1.class);
                startActivity(intent);
            }
        });
    }
}
