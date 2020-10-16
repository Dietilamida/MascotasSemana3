package com.example.mascotasapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mascotasapp.R;
import com.example.mascotasapp.pojo.Foto;
import com.example.mascotasapp.pojo.Mascota;

import java.util.List;

public class FotosAdapter extends RecyclerView.Adapter<FotosAdapter.ViewHolder> {
    private final List<Foto> fotos;

    public FotosAdapter(List<Foto> fotos){
        this.fotos=fotos;
    }
    @NonNull
    @Override
    public FotosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_foto, parent, false);
        return new FotosAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FotosAdapter.ViewHolder holder, int position) {
        Foto foto = fotos.get(position);

        holder.tvLikes.setText(String.valueOf(foto.getNumlikes()));
        holder.imgFoto.setImageResource(foto.getFoto());

    }

    @Override
    public int getItemCount() {
        return this.fotos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imgFoto;
        private final TextView tvLikes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto=(ImageView) itemView.findViewById(R.id.imgFoto);

            tvLikes=(TextView) itemView.findViewById(R.id.tvLikes);
        }
    }
}
