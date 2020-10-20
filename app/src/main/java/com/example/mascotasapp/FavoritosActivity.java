package com.example.mascotasapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.mascotasapp.adapter.MascotasAdapter;
import com.example.mascotasapp.pojo.Mascota;

import java.util.ArrayList;
import java.util.List;

import db.BaseDatos;

public class FavoritosActivity extends AppCompatActivity {

    private List<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);


        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.pet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        inicializarListaMascotas();
        RecyclerView rvMascotas = findViewById(R.id.rvMascotas);
        rvMascotas.setAdapter(new MascotasAdapter(mascotas));

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);
    }
    public void inicializarListaMascotas(){
        BaseDatos db = new BaseDatos(this);
        mascotas = db.obtenerFavoritos();
    }
}