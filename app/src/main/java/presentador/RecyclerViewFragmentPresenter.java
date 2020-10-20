package presentador;

import android.content.Context;

import com.example.mascotasapp.adapter.MascotasAdapter;
import com.example.mascotasapp.fragments.IRecyclerViewFragmentView;
import com.example.mascotasapp.pojo.Mascota;

import java.util.ArrayList;

import db.ConstructorMascotas;

public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter {
    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context){
        this.iRecyclerViewFragmentView=iRecyclerViewFragmentView;
        this.context=context;
        obtenerMascotasBase();

    }

    @Override
    public void obtenerMascotasBase() {
        constructorMascotas =new ConstructorMascotas(context);
        mascotas =constructorMascotas.obtenerDatos();


    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador((mascotas)));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();

    }
}
