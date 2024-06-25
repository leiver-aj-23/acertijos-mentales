package com.leiver.logica;

public class casoSeis {


    boolean respuestaCorrecta;

    public boolean casoSeis(String respuestaUsuario){

        if (respuestaUsuario.equalsIgnoreCase("delfin")) {
            System.out.println("¡Correcto! Puedes avanzar al siguiente nivel.");
            respuestaCorrecta = true;
        } else {
            System.out.println("Incorrecto. Inténtalo de nuevo.");
            respuestaCorrecta = false;
        }

        return respuestaCorrecta;
    }
}
