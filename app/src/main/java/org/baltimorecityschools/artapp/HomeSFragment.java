package org.baltimorecityschools.artapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class HomeSFragment extends Fragment {

    private TextView quoteTextView2;
    private Button newQuoteButton;

    Button imageBTN;

    Button sKetBTN;

    Button textGCBTN;

    private String[] motivationalQuotes = {
            "Creativity takes courage. – Henri Matisse",
            "Every artist was first an amateur. – Ralph Waldo Emerson",
            "Don’t wait for inspiration. It comes while working.",
            "Start where you are. Use what you have. Do what you can.",
            "Art is not freedom from discipline, but disciplined freedom.",
            "Inspiration exists, but it has to find you working. – Picasso",
            "Done is better than perfect."
    };

    private Random random = new Random();

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_s, container, false);

        imageBTN = view.findViewById(R.id.imageZone);
        textGCBTN = view.findViewById(R.id.genideaBT);
        sKetBTN = view.findViewById(R.id.setckky);


        quoteTextView2 = view.findViewById(R.id.quoteTextView2);
        newQuoteButton = view.findViewById(R.id.newQuoteButton);

        imageBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ImageActivity.class);
                startActivity(intent);
            }
        });

        textGCBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TextGenActivity.class);
                startActivity(intent);
            }
        });



        newQuoteButton.setOnClickListener(v -> {
            int index = random.nextInt(motivationalQuotes.length);
            quoteTextView2.setText(motivationalQuotes[index]);
        });

        return view;

    }

    @Override
    public void onResume() {
        super.onResume();
        HomeActivity2 activity = (HomeActivity2) getActivity();
        if (activity != null && activity.fab != null) {
            activity.fab.setVisibility(View.VISIBLE); // Show FAB again
        }
    }


}