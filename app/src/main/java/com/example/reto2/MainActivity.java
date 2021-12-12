package com.example.reto2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Fragment_Inicio subPantallaInicio;
    Fragment_Productos subPantallaProductos;
    Fragment_Servicios subPantallaServicios;
    Fragment_Sucursales subPantallaSucursales;
    Fragment_Favoritos subPantallaFavoritos;
    FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subPantallaInicio = new Fragment_Inicio();
        subPantallaProductos = new Fragment_Productos();
        subPantallaServicios = new Fragment_Servicios();
        subPantallaSucursales = new Fragment_Sucursales();
        subPantallaFavoritos = new Fragment_Favoritos();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor_fragment,subPantallaInicio).commit();


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        transaction = getSupportFragmentManager().beginTransaction();
        int id = item.getItemId();
        if (id == R.id.productos) {
            transaction.replace(R.id.contenedor_fragment,subPantallaProductos).commit();
        }
        if (id == R.id.servicios) {
            transaction.replace(R.id.contenedor_fragment,subPantallaServicios).commit();
        }
        if (id == R.id.sucursales) {
            transaction.replace(R.id.contenedor_fragment,subPantallaSucursales).commit();
        }
        if (id == R.id.favoritos) {
            transaction.replace(R.id.contenedor_fragment,subPantallaFavoritos).commit();
        }
        return super.onOptionsItemSelected(item);
    }

}