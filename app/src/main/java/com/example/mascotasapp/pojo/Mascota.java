package com.example.mascotasapp.pojo;

public class Mascota {
    String nombre;

    public int getFoto() {
        return foto;
    }

    public int getId() {
        return id;
    }

    int id;
    int foto;
    int numlikes;

    public String getNombre() {
        return nombre;
    }

    public int getNumlikes() {
        return numlikes;
    }

    public Mascota (int id, String nombre, int foto, int numlikes){
        this.id=id;
        this.nombre=nombre;
        this.foto=foto;
        this.numlikes=numlikes;
    }


}
