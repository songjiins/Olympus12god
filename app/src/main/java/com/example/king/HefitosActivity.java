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

public class HefitosActivity extends AppCompatActivity {
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_hefitos);


        ImageView hefitosImage = findViewById(R.id.hefitos);
        hefitosImage.setImageResource(R.drawable.hefitos2);


        TextView interpretationText = findViewById(R.id.hefitosok);
        interpretationText.setText("헤파이토스(Hephaestus)는 그리스 신화에서 대장장이와 불의 신으로, 소수의 금속을 활용한 기술을 통해 신들에게 필요한 무기와 장신구를 만드는 역할을 했습니다. 제우스와 헤라의 아들로, 그리스 신들 미술은 유일하게 장애를 가진 신으로 묘사됩니다. ");


        VideoView hefitosVideo = findViewById(R.id.hefitosvideo);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hephaestus);
        hefitosVideo.setVideoURI(videoUri);
        hefitosVideo.start();

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HefitosActivity.this, GOD1.class);
                startActivity(intent);
            }
        });
    }
}