package com.example.mascotasapp.pojo;

public class Foto {

    public int getFoto() {
        return foto;
    }

    int foto;
    int numlikes;


    public int getNumlikes() {
        return numlikes;
    }

    public Foto(int foto, int numlikes) {
        this.foto = foto;
        this.numlikes = numlikes;
    }
}
