package com.example.jashid.tarjetero;

import android.widget.ImageView;
import android.widget.TextView;

public class Tarjeta {
    private int edad;
    private String nombre;
    private int imagen;
    private String descripcion;

    public Tarjeta(){
        edad = 0;
        nombre = null;
        descripcion = null;
        imagen = 0;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public int getImagen() {return imagen;}
    public void setImagen(int imagen) {this.imagen = imagen;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
}
