package org.baltimorecityschools.artapp;

import static android.app.ProgressDialog.show;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class newfragment extends Fragment {

    EditText signupEmail, sginupUserN, signupPasword;
    Button signupButton;

    TextView signUpName;
    FirebaseDatabase database;
    DatabaseReference reference;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_newfragment, container, false);

        signupButton = view.findViewById(R.id.signup_button);
        signUpName = view.findViewById(R.id.signupnamett);
        signupEmail = view.findViewById(R.id.signupEmail);
        signupPasword = view.findViewById(R.id.signup_password);
        sginupUserN = view.findViewById(R.id.signup_username);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");

                String name = signUpName.getText().toString();
                String email = signupEmail.getText().toString();
                String username = sginupUserN.getText().toString();
                String password = signupPasword.getText().toString();

                HelperClass helperClass = new HelperClass(name,email,username,password);
                reference.child(name).setValue(helperClass);

//                requireActivity().getSupportFragmentManager().beginTransaction()
//                        .addToBackStack(null)
//                        .commit();


                Toast.makeText(getContext(), "Switching to Login", Toast.LENGTH_SHORT).show();
                ((ViewPager2) getActivity().findViewById(R.id.view_pager)).setCurrentItem(0);

            }
        });

        return view;
    }
}
