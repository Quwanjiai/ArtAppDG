package org.baltimorecityschools.artapp;

import static org.baltimorecityschools.artapp.R.*;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.baltimorecityschools.artapp.databinding.ActivityHome2Binding;

public class HomeActivity2 extends AppCompatActivity {

    ActivityHome2Binding binding;

    public FloatingActionButton fab; // <-- Make this public
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityHome2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fab = findViewById(id.floatingActionButtonbb);


        replaceFragment(new HomeSFragment());
        binding.bottomNabView.setBackground(null);

        binding.bottomNabView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == id.Home) {
                replaceFragment(new HomeSFragment());
            } else if (itemId == id.me) {
                replaceFragment(new profileeFragment());
            } else if (itemId == id.Settings) {
                replaceFragment(new SettingFragment());
            } else if (itemId == id.InfoM) {
                replaceFragment(new infooFragment());
            }

            return true;

        });

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}