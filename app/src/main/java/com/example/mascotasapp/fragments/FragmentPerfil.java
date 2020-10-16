package com.example.mascotasapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mascotasapp.R;
import com.example.mascotasapp.adapter.FotosAdapter;
import com.example.mascotasapp.adapter.MascotasAdapter;
import com.example.mascotasapp.pojo.Foto;
import com.example.mascotasapp.pojo.Mascota;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentPerfil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentPerfil extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private List<Foto> fotos;

    public FragmentPerfil() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentPerfil.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentPerfil newInstance(String param1, String param2) {
        FragmentPerfil fragment = new FragmentPerfil();
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
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        inicializarListaFoto();
        RecyclerView rvfoto = v.findViewById(R.id.rvPerfil);
        rvfoto.setAdapter(new FotosAdapter(fotos));

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        //glm.setOrientation(LinearLayoutManager.VERTICAL);
        rvfoto.setLayoutManager(glm);
        return v;
    }
        public void inicializarListaFoto(){
        fotos =new ArrayList<Foto>();
        fotos.add(new Foto(R.mipmap.perrito,5));
        fotos.add(new Foto(R.mipmap.perrito,1));
        fotos.add(new Foto(R.mipmap.perrito,5));
        fotos.add(new Foto(R.mipmap.perrito,4));
        fotos.add(new Foto(R.mipmap.perrito,5));
        fotos.add(new Foto(R.mipmap.perrito,3));
        fotos.add(new Foto(R.mipmap.perrito,7));
        fotos.add(new Foto(R.mipmap.perrito,2));
        fotos.add(new Foto(R.mipmap.perrito,5));
}}