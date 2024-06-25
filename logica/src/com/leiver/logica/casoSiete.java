package com.leiver.logica;

public class casoSiete {

    boolean respuestaCorrecta;

    public boolean casoSiete(String respuestaUsuario){

        if (respuestaUsuario.equalsIgnoreCase("mosquito")) {
            System.out.println("¡Correcto! Puedes avanzar al siguiente nivel.");
            respuestaCorrecta = true;
        } else {
            System.out.println("Incorrecto. Inténtalo de nuevo.");
            respuestaCorrecta = false;
        }

        return respuestaCorrecta;
    }

}
