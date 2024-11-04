package com.example.king;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ArtemisActivity extends AppCompatActivity {
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activiti_artemis);

        ImageView artemisImage = findViewById(R.id.artemis);
        artemisImage.setImageResource(R.drawable.artemis2);



        VideoView artemisvideo = findViewById(R.id.artemisvideo);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.deartemis);
        artemisvideo.setVideoURI(videoUri);
        artemisvideo.start();

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArtemisActivity.this, GOD1.class);
                startActivity(intent);
            }
        });
    }
}
