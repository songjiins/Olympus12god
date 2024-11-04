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

public class ApolonActivity extends AppCompatActivity {
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_apolon);

        ImageView apolonImage = findViewById(R.id.apolon);
        apolonImage.setImageResource(R.drawable.apolon2);

        TextView interpretationText = findViewById(R.id.apolonok);
        interpretationText.setText("아폴론(Apollo)은 그리스 신화에서 추구, 음악, 시, 의술, 태양의 신으로 레즈비언이 있습니다. 제우스와 티탄의 여신 토의 아들로, 갈라져 있는 테미스(아르테미스)와 함께 태어났습니다. 아폴론은 빛과 교육의 상징으로, 그리스 신화에서 빛나는 신입니다");

        VideoView apolonvideo = findViewById(R.id.apolonvideo1);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.apolonye);
        apolonvideo.setVideoURI(videoUri);
        apolonvideo.start();

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ApolonActivity.this, GOD1.class);
                startActivity(intent);
            }
        });
    }
}
