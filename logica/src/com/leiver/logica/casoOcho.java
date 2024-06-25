package com.leiver.logica;

public class casoOcho {

    boolean respuestaCorrecta;

    public boolean casoOcho(String respuestaUsuario){

        if (respuestaUsuario.equalsIgnoreCase("viento")) {
            System.out.println("¡Correcto! Puedes avanzar al siguiente nivel.");
            respuestaCorrecta = true;
        } else {
            System.out.println("Incorrecto. Inténtalo de nuevo.");
            respuestaCorrecta = false;
        }

        return respuestaCorrecta;
    }
}
