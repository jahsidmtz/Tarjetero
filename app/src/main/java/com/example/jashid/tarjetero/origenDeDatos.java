package com.example.jashid.tarjetero;

import java.util.ArrayList;

public class origenDeDatos {
    origenDeDatos(){}
    public ArrayList<String> getImagenes(){
        ArrayList <String> Imagenes = new ArrayList<String>();
        Imagenes.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOX_DfBw3mTQ1qldZmrgPTvZXPLVREesX3FFkBtmzS2ZtaoGfslA");
        Imagenes.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzEhx-DOP5wgUbFMmRkhwDzhdeEXLtrwbrRp9CQ_fsv0lyFvbKWQ");
        Imagenes.add("https://image.flaticon.com/icons/png/128/181/181515.png");
        Imagenes.add("https://image.freepik.com/iconos-gratis/simbolo-de-copyright_318-121400.jpg");
        Imagenes.add("https://pbs.twimg.com/profile_images/687031967737614336/qKoM6mtp_400x400.png");
        Imagenes.add("https://i.ytimg.com/vi/NGmp6ysX1B8/maxresdefault.jpg");
        Imagenes.add("https://lh3.googleusercontent.com/oa2eXigZEhnwyQaNcHCrGOWXlk9nXvWZEDgI41OwGFOHK5ASRdft8001FpWjctbzx8E=s128");
        Imagenes.add("https://cdn6.aptoide.com/imgs/4/d/a/4da67e7bbead59db19f76e767b0a5b9e_icon.png?w=256");
        Imagenes.add("https://pbs.twimg.com/profile_images/2989964327/bac008f02946b71ea6b14d8b38e1b102.jpeg");
        Imagenes.add("https://image.freepik.com/iconos-gratis/signo-de-interrogacion_318-139902.jpg");


        return Imagenes;
    }

    public ArrayList<Tarjeta> getDatos(){
        ArrayList <Tarjeta> resultado = new ArrayList<Tarjeta>();

        Tarjeta uno = new Tarjeta();
        uno.setDescripcion("Reggae");
        uno.setNombre("Alfonso");
        uno.setEdad(19);
        resultado.add(uno);

        Tarjeta dos = new Tarjeta();
        dos.setDescripcion("Gym");
        dos.setNombre("Kevin");
        dos.setEdad(19);
        resultado.add(dos);

        Tarjeta tres = new Tarjeta();
        tres.setDescripcion("Tecnosystem 2000");
        tres.setNombre("Talí");
        tres.setEdad(19);
        resultado.add(tres);

        Tarjeta cuatro = new Tarjeta();
        cuatro.setDescripcion("CheloHolmes");
        cuatro.setNombre("Chelo");
        cuatro.setEdad(19);
        resultado.add(cuatro);

        Tarjeta cinco = new Tarjeta();
        cinco.setDescripcion("Corredor");
        cinco.setNombre("Danny");
        cinco.setEdad(19);
        resultado.add(cinco);

        Tarjeta seis = new Tarjeta();
        seis.setDescripcion("Novio de Frida");
        seis.setNombre("Lupillo");
        seis.setEdad(18);
        resultado.add(seis);

        Tarjeta siete = new Tarjeta();
        siete.setDescripcion("Novia de Lupillo");
        siete.setNombre("Frida");
        siete.setEdad(18);
        resultado.add(siete);

        Tarjeta ocho = new Tarjeta();
        ocho.setDescripcion("Stark");
        ocho.setNombre("Jorge");
        ocho.setEdad(19);
        resultado.add(ocho);

        Tarjeta nueve = new Tarjeta();
        nueve.setDescripcion("Te la catafixio, cuate");
        nueve.setNombre("Chabelo");
        nueve.setEdad(100000000);
        resultado.add(nueve);

        Tarjeta diez = new Tarjeta();
        diez.setDescripcion("Ya no sé qué poner");
        diez.setNombre("Persona");
        diez.setEdad(0);
        resultado.add(diez);

        return resultado;
    }
}
