package org.baltimorecityschools.artapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextGenActivity extends AppCompatActivity {

    TextView prompt1, prompt2, prompt3;
    Button geBTN;

    List<String> prompts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_gen);

        prompt1 = findViewById(R.id.prompt1);
        prompt2 = findViewById(R.id.prompt2);
        prompt3 = findViewById(R.id.prompt3);
        geBTN = findViewById(R.id.generateButton);

        prompts = new ArrayList<>();
        loadPrompts();


        geBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generatePrompts();
            }
        });

        generatePrompts(); // show 3 prompts when activity starts
    }

    private void loadPrompts() {
        prompts.add("Dragon");
        prompts.add("Castle");
        prompts.add("Spaceship");
        prompts.add("Pirate");
        prompts.add("Jungle");
        prompts.add("Mountain");
        prompts.add("Robot");
        prompts.add("Ocean");
        prompts.add("Knight");
        prompts.add("Snake");
        prompts.add("King");
        prompts.add("Cold");
        prompts.add("Transformation");
        prompts.add("Hunter");
        // Add more prompts here
    }

    private void generatePrompts() {
        // Shuffle the list
        Collections.shuffle(prompts);

        // Set first 3 prompts
        prompt1.setText(prompts.get(0));
        prompt2.setText(prompts.get(1));
        prompt3.setText(prompts.get(2));
    }
}
