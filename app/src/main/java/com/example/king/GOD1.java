package com.example.king;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GOD1 extends AppCompatActivity {
    ToggleButton tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, tb10, tb11, tb12, tb13, tb14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_god1);

        // 각 ToggleButton ID와 연결
        tb1 = findViewById(R.id.tb1);
        tb2 = findViewById(R.id.tb2);
        tb3 = findViewById(R.id.tb3);
        tb4 = findViewById(R.id.tb4);
        tb5 = findViewById(R.id.tb5);
        tb6 = findViewById(R.id.tb6);
        tb7 = findViewById(R.id.tb7);
        tb8 = findViewById(R.id.tb8);
        tb9 = findViewById(R.id.tb9);
        tb10 = findViewById(R.id.tb10);
        tb11 = findViewById(R.id.tb11);
        tb12 = findViewById(R.id.tb12);
        tb13 = findViewById(R.id.tb13);
        tb14 = findViewById(R.id.tb14);





        View.OnClickListener toggleClickListener = new View.OnClickListener() {
            @Override





            public void onClick(View view) {
                int id = view.getId();
                if (id == R.id.tb2) {
                    openActivity(Ares.class);
                } else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb5) {
                    openActivity(Athens.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }else if (id == R.id.tb7) {
                    openActivity(Demeter.class);
                }
            }
        };

        // 리스너 설정
        tb1.setOnClickListener(toggleClickListener);
        tb2.setOnClickListener(toggleClickListener);
        tb3.setOnClickListener(toggleClickListener);
        tb4.setOnClickListener(toggleClickListener);
        tb5.setOnClickListener(toggleClickListener);
        tb6.setOnClickListener(toggleClickListener);
        tb7.setOnClickListener(toggleClickListener);
        tb8.setOnClickListener(toggleClickListener);
        tb9.setOnClickListener(toggleClickListener);
        tb10.setOnClickListener(toggleClickListener);
        tb11.setOnClickListener(toggleClickListener);
        tb12.setOnClickListener(toggleClickListener);
        tb13.setOnClickListener(toggleClickListener);
        tb14.setOnClickListener(toggleClickListener);

        // Window Insets 설정
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // 새로운 Activity로 이동하는 메소드
    private void openActivity(Class<?> activityClass) {
        Intent intent = new Intent(GOD1.this, activityClass);
        startActivity(intent);
    }
}
