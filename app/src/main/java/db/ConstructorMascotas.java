package db;

import android.content.ContentValues;
import android.content.Context;

import com.example.mascotasapp.R;
import com.example.mascotasapp.pojo.Mascota;



import java.util.ArrayList;

public class ConstructorMascotas {
    private Context context;
    public ConstructorMascotas(Context context){
        this.context=context;

    }
    public ArrayList<Mascota>obtenerDatos(){
        BaseDatos db = new BaseDatos(context);
        insertarMascotas(db);
        return  db.obtenerTodosLosContactos();

    }

    private void insertarMascotas(BaseDatos db) {
        insertarMascota(db, "Katia", R.mipmap.perrito,5);
        insertarMascota(db, "Baba", R.mipmap.perrito,4);
        insertarMascota(db, "Arkady",R.mipmap.perrito,6);
        insertarMascota(db, "Gretel", R.mipmap.perrito,4);
        insertarMascota(db, "Hanna", R.mipmap.perrito,3);
        insertarMascota(db, "Kyoshi",R.mipmap.perrito,6);

    }

    private void insertarMascota(BaseDatos db, String nombre, int foto, int likes) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, nombre);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, foto);

        db.insertarContacto(contentValues);

    }
}
