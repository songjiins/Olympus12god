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

public class Athens extends AppCompatActivity {
    Button btn1;
    private VideoView videoView2;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_athens);

        btn1 = findViewById(R.id.btn1);
        videoView2 = findViewById(R.id.videoView2);


        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView2);
        videoView2.setMediaController(mediaController);


        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.thena);
        videoView2.setVideoURI(uri);


        videoView2.start();
        videoView2.setOnCompletionListener(mp -> videoView2.start());

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Athens.this, GOD1.class);
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
