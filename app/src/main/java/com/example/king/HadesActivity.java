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

public class HadesActivity extends AppCompatActivity {
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_hades);


        ImageView hadesImage = findViewById(R.id.hadesImage);
        hadesImage.setImageResource(R.drawable.hades);


        TextView interpretationText = findViewById(R.id.hadeshesok);
        interpretationText.setText("하데스는 그리스 신화에서 저승과 죽음의 신이자, 올림포스 12신 중 하나입니다. 크로노스와 레아의 아들로, 제우스와 포세이돈의 형제이며, 죽은 자들의 영혼이 머무는 저승을 다스리는 역할을 맡았습니다. 로마 신화에서는 플루토(Pluto)로 알려져 있습니다.");


        VideoView hadesVideo = findViewById(R.id.hadesVideo);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hades1);
        hadesVideo.setVideoURI(videoUri);
        hadesVideo.start();

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HadesActivity.this, GOD1.class);
                startActivity(intent);
            }
        });
    }
}