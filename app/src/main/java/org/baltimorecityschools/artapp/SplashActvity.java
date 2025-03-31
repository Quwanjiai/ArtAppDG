package org.baltimorecityschools.artapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActvity extends AppCompatActivity {
ImageView log,img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_actvity);
        img = findViewById(R.id.img);
        log = findViewById(R.id.log);

        img.animate().translationY(-3500).setDuration(800).setStartDelay(2500);
        log.animate().translationY(1400).setDuration(850).setStartDelay(2500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActvity.this, MainActivity.class);
                startActivity(intent);

            }
        },1500);


    }
}