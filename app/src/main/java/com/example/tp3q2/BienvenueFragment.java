package com.example.tp3q2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BienvenueFragment extends Fragment {

    public TextView textBienvenue;


    public BienvenueFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bienvenue, container, false);
        textBienvenue = view.findViewById(R.id.textBienvenue);
        textBienvenue.setText("Bienvenue    ");
        return view;
    }

}