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

public class ZeusActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_zeus);


        ImageView zeusImage = findViewById(R.id.zeusImage);
        zeusImage.setImageResource(R.drawable.zeus);


        TextView interpretationText = findViewById(R.id.zeushesok);
        interpretationText.setText("제우스는 그리스 신화에서 올림포스의 최고 신으로, 하늘과 번개, 신들의 왕을 상징합니다. 크로노스와 레아 사이에서 태어나 형제 자매들(헤라, 하데스, 포세이돈, 데메테르, 헤스티아)과 함께 올림포스를 통치하게 되었고, 로마 신화에서는 주피터(Jupiter)로 불립니다.");

        VideoView zeusVideo = findViewById(R.id.zeusVideo);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.godzeus);
        zeusVideo.setVideoURI(videoUri);
        zeusVideo.start();

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ZeusActivity.this, GOD1.class);
                startActivity(intent);
            }
        });

    }

}

