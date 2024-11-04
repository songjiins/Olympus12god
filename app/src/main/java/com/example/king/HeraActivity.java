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

public class HeraActivity extends AppCompatActivity {
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_hera);


        ImageView heraImage = findViewById(R.id.heraImage);
        heraImage.setImageResource(R.drawable.hera);


        TextView interpretationText = findViewById(R.id.herahesok);
        interpretationText.setText("헤라는 그리스 신화에서 결혼과 가정의 여신이자, 올림포스 신들의 여왕입니다. 제우스의 아내이자 누이로, 주로 결혼과 가정의 수호자로서 중요한 역할을 맡고 있습니다. 로마 신화에서는 유노(Juno)로 불립니다.");


        VideoView heraVideo = findViewById(R.id.heraVideo);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hera1);
        heraVideo.setVideoURI(videoUri);
        heraVideo.start();

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HeraActivity.this, GOD1.class);
                startActivity(intent);
            }
        });
    }
}