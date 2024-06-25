package com.leiver.logica;

public class casoTres {

    boolean respuestaCorrecta;

    public boolean casoTres(String respuestaUsuario){

        if (respuestaUsuario.equalsIgnoreCase("incorrectamente")) {
            System.out.println("¡Correcto! Puedes avanzar al siguiente nivel.");
            respuestaCorrecta = true;
        } else {
            System.out.println("Incorrecto. Inténtalo de nuevo.");
            respuestaCorrecta = false;
        }

        return respuestaCorrecta;
    }
}
