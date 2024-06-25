package com.leiver.logica;

public class CasoUno {

    boolean respuestaCorrecta;

    public boolean casoUno(String respuestaUsuario){

        if (respuestaUsuario.equalsIgnoreCase("sello")) {
            System.out.println("¡Correcto! Puedes avanzar al siguiente nivel.");
            respuestaCorrecta = true;
        } else {
            System.out.println("Incorrecto. Inténtalo de nuevo.");
            respuestaCorrecta = false;
        }

        return respuestaCorrecta;
    }



}
