package com.example.reto2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Fragment_Productos extends Fragment {


    Drawable drawable1,drawable2,drawable3, drawable4;
    ImageView imagenProducto1, imagenProducto2, imagenProducto3, imagenProducto4;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__productos, container, false);

        //------------------------------------------------------------------------------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.p1,v.getContext().getTheme());

        imagenProducto1 = (ImageView) v.findViewById(R.id.imagenProducto1);
        imagenProducto1.setImageDrawable(drawable1);

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.p2,v.getContext().getTheme());

        imagenProducto2 = (ImageView) v.findViewById(R.id.imagenProducto2);
        imagenProducto2.setImageDrawable(drawable2);

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.p3,v.getContext().getTheme());

        imagenProducto3 = (ImageView) v.findViewById(R.id.imagenProducto3);
        imagenProducto3.setImageDrawable(drawable3);

        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.p4,v.getContext().getTheme());

        imagenProducto4 = (ImageView) v.findViewById(R.id.imagenProducto4);
        imagenProducto4.setImageDrawable(drawable4);



        //------------------------------------------------------------------------------------------
        return v;
    }
}