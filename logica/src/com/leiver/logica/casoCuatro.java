package com.leiver.logica;

public class casoCuatro {


    boolean respuestaCorrecta;

    public boolean casoCuatro(String respuestaUsuario){

        if (respuestaUsuario.equalsIgnoreCase("gato")) {
            System.out.println("¡Correcto! Puedes avanzar al siguiente nivel.");
            respuestaCorrecta = true;
        } else {
            System.out.println("Incorrecto. Inténtalo de nuevo.");
            respuestaCorrecta = false;
        }

        return respuestaCorrecta;
    }
}
