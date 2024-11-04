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

public class HermesActivity extends AppCompatActivity {
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_hermes);


        ImageView hermesImage = findViewById(R.id.hermesImage);
        hermesImage.setImageResource(R.drawable.hermes2);


        TextView interpretationText = findViewById(R.id.hermessok);
        interpretationText.setText("헤르메스(Hermes)는 그리스 신화에서 신들의 전령이자 여행자와 여행자, 도둑의 수호신입니다. 그는 신들의 왕인 제우스와 물의 님프인 마이아 사이에서 태어나고, 영리하고 빠른 성격을 가지고 있어 신과 인간 세계를 위해 오갈 수 있는 능력을 지닙니다.");


        VideoView hermesVideo = findViewById(R.id.hermesvideo);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hermesyo);
        hermesVideo.setVideoURI(videoUri);
        hermesVideo.start();

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HermesActivity.this, GOD1.class);
                startActivity(intent);
            }
        });
    }
}