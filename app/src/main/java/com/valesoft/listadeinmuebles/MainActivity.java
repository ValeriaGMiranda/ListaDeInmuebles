package com.valesoft.listadeinmuebles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.valesoft.listadeinmuebles.modelo.Inmueble;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble>lista = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }
    public void generarListView(){
        ArrayAdapter<Inmueble>adapter = new ListaAdapter(this, R.layout.item,lista,getLayoutInflater());
        ListView lv = findViewById(R.id.miLista);
        lv.setAdapter(adapter);
    }
    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa1,"Merlo", 88750.50));
        lista.add(new Inmueble(R.drawable.casa2,"El Volcán", 75220.40));
        lista.add(new Inmueble(R.drawable.casa3,"La Carolina", 89999.50));
    }
}