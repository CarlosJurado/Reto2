package com.example.reto2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment_Sucursales extends Fragment {


    public Fragment_Sucursales() {
        // Required empty public constructor
    }

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_sucursales, container, false);
        //------------------------------------------------------------------------------------------

        //------------------------------------------------------------------------------------------
        return v;
    }
}