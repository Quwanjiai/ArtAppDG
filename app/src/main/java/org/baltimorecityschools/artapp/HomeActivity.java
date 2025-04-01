package org.baltimorecityschools.artapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    ImageButton findBT,hmBT,srBTN,ssBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findBT = findViewById(R.id.findderhBTN);
        hmBT = findViewById(R.id.homeBTN);
        srBTN = findViewById(R.id.helpBTN);
        ssBTN = findViewById(R.id.settingBTN);

        ssBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, SSettingsActivity.class);
                startActivity(intent);

            }
        });

        };
    }
