package com.example.king;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class PoseidonActivity extends AppCompatActivity {
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_poseidon);


        ImageView poseidonImage = findViewById(R.id.poseidonImage);
        poseidonImage.setImageResource(R.drawable.poseidon);


        TextView interpretationText = findViewById(R.id.poseidonhesok);
        interpretationText.setText("포세이돈(Poseidon)은 그리스 신화에서 바다와 지진, 말의 신으로, 제우스와 하데스의 형제입니다. 그의 상징인 삼지창으로 바다를 다스리며 폭풍과 지진을 일으킬 수 있습니다");


        VideoView poseidonVideo = findViewById(R.id.poseidonVideo);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.poseidon1);
        poseidonVideo.setVideoURI(videoUri);
        poseidonVideo.start();

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoseidonActivity.this, GOD1.class);

                startActivity(intent);
            }
        });
    }
}