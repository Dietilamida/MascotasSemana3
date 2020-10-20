package com.example.mascotasapp.fragments;

import com.example.mascotasapp.adapter.MascotasAdapter;
import com.example.mascotasapp.pojo.Mascota;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public MascotasAdapter crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(MascotasAdapter adaptador);
}
