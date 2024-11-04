package com.example.king;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class DionysusDetailActivity extends AppCompatActivity {

    Button button_back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dionysus);

        ImageView hestiaImage = findViewById(R.id.dionysusImage);
        hestiaImage.setImageResource(R.drawable.dionysus2);

        VideoView videoView3 = findViewById(R.id.videoView3);
        videoView3.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.dionysusvideo);


        videoView3.setOnPreparedListener(mp -> {
                    mp.setLooping(true);
                    videoView3.start();

                });
        TextView textView = findViewById(R.id.text_dionysus);

        button_back2 = findViewById(R.id.button_back2);
        button_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DionysusDetailActivity.this, GOD1.class);
                startActivity(intent);
            }
        });
    }
}
