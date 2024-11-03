package com.example.king;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ares extends AppCompatActivity {
    Button btn1;
    private VideoView videoView1;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ares);
        btn1 = findViewById(R.id.btn1);
        videoView1 = findViewById(R.id.videoView1);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView1);
        videoView1.setMediaController(mediaController);

        //
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ares);
        videoView1.setVideoURI(uri);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ares.this,GOD1.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        videoView1.start();
        videoView1.setOnCompletionListener(mp -> videoView1.start());
    }
}
