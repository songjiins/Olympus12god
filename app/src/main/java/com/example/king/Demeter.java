package com.example.king;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Demeter extends AppCompatActivity {
    Button btn1;
    private VideoView videoView3;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demeter);
        btn1 = findViewById(R.id.btn1);
        videoView3 = findViewById(R.id.videoView3);


        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView3);
        videoView3.setMediaController(mediaController);


        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.freya);
        videoView3.setVideoURI(uri);

        videoView3.start();
        videoView3.setOnCompletionListener(mp -> videoView3.start());

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Demeter.this, GOD1.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}