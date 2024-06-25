package com.leiver.logica;

public class casoCinco {

    boolean respuestaCorrecta;

    public boolean casoCinco(String respuestaUsuario){

        if (respuestaUsuario.equalsIgnoreCase("reloj")) {
            System.out.println("¡Correcto! Puedes avanzar al siguiente nivel.");
            respuestaCorrecta = true;
        } else {
            System.out.println("Incorrecto. Inténtalo de nuevo.");
            respuestaCorrecta = false;
        }

        return respuestaCorrecta;
    }
}
