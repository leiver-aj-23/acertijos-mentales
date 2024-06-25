package com.leiver.logica;

public class casoDos {

    boolean respuestaCorrecta;

    public boolean casoDos(String respuestaUsuario) {

        if (respuestaUsuario.equalsIgnoreCase("todos")) {
            System.out.println("¡Correcto! Puedes avanzar al siguiente nivel.");
            respuestaCorrecta = true;
        } else {
            System.out.println("Incorrecto. Inténtalo de nuevo.");
            respuestaCorrecta = false;
        }

        return respuestaCorrecta;
    }
}