package com.example.mascotasapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mascotasapp.R;
import com.example.mascotasapp.adapter.MascotasAdapter;
import com.example.mascotasapp.pojo.Mascota;

import java.util.ArrayList;
import java.util.List;

import presentador.IRecyclerViewFragmentPresenter;
import presentador.RecyclerViewFragmentPresenter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentRecyclerView#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentRecyclerView extends Fragment implements IRecyclerViewFragmentView {

    private List<Mascota> mascotas;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView rvMascotas;
    private IRecyclerViewFragmentPresenter presenter;

    public FragmentRecyclerView() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentRecyclerView.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentRecyclerView newInstance(String param1, String param2) {
        FragmentRecyclerView fragment = new FragmentRecyclerView();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);


        rvMascotas = v.findViewById(R.id.rvMascotas);
        presenter =new RecyclerViewFragmentPresenter(this, getContext());
        presenter.mostrarMascotasRV();
        return v;
    }


    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);

    }

    @Override
    public void inicializarAdaptadorRV(MascotasAdapter adaptador) {
        rvMascotas.setAdapter(adaptador);


    }

    @Override
    public MascotasAdapter crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotasAdapter adaptador = new MascotasAdapter(mascotas);
        return adaptador;
    }
}