package com.example.reto2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Fragment_Servicios extends Fragment {

    Drawable drawable1,drawable2,drawable3, drawable4;
    ImageView imagenServicio1, imagenServicio2, imagenServicio3, imagenServicio4;
    View v;

    public Fragment_Servicios() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__servicios, container, false);
        //------------------------------------------------------------------------------------------



        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.s1,v.getContext().getTheme());

        imagenServicio1 = (ImageView) v.findViewById(R.id.imagenServicio1);
        imagenServicio1.setImageDrawable(drawable1);

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.s2,v.getContext().getTheme());

        imagenServicio2 = (ImageView) v.findViewById(R.id.imagenServicio2);
        imagenServicio2.setImageDrawable(drawable2);

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.s3,v.getContext().getTheme());

        imagenServicio3 = (ImageView) v.findViewById(R.id.imagenServicio3);
        imagenServicio3.setImageDrawable(drawable3);

        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.s4,v.getContext().getTheme());

        imagenServicio4 = (ImageView) v.findViewById(R.id.imagenServicio4);
        imagenServicio4.setImageDrawable(drawable4);


        //------------------------------------------------------------------------------------------
        return v;
    }
}