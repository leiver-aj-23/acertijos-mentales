package com.leiver.main;

import com.leiver.logica.*;

public class Main {
    public static void main(String[] args) {
        int nivel = 1;
        boolean respuestaCorrecta = false;

        CasoUno casouno = new CasoUno();
        casoDos casodos = new casoDos();
        casoTres casotres = new casoTres();
        casoCuatro casocuatro = new casoCuatro();
        casoCinco casocinco = new casoCinco();
        casoSeis casoseis = new casoSeis();
        casoSiete casosiete = new casoSiete();
        casoOcho casoocho = new casoOcho();



        while (nivel <= 8) {
            System.out.println("¡Bienvenido al Nivel " + nivel + "!");

            switch (nivel) {
                case 1:
                    System.out.println("¿Qué objeto se puede pegar en un sobre, pero no se puede pegar en un sobre?");
                    break;
                case 2:
                    System.out.println("¿Cuántos meses tienen 28 días?");
                    break;
                case 3:
                    System.out.println("¿Qué palabra se escribe incorrectamente en todos los diccionarios?");
                    break;
                case 4:
                    System.out.println("Cuál es el animal que esta en el medio del purgatorio");
                    break;
                case 5:
                    System.out.println("Qué es lo que anda todo el dia y nunca sale de us sitio");
                    break;
                case 6:
                    System.out.println("Dios, durante la creacion dejo uno para el final. ¿ Cuál es?");
                    break;
                case 7:
                    System.out.println("¿Qué animal muere entre aplausos?");
                    break;
                case 8:
                    System.out.println("Qué cosa silva sin labios, corre sin pies,te pega en la espalda y aun no lo vez?");
            }

            System.out.print(" respuesta: ");
            String respuestaUsuario = System.console().readLine();

            switch (nivel) {
                case 1:

                    respuestaCorrecta = casouno.casoUno(respuestaUsuario);

                    break;
                case 2:

                    respuestaCorrecta = casodos.casoDos(respuestaUsuario);

                    break;
                case 3:

                    respuestaCorrecta = casotres.casoTres(respuestaUsuario);

                    break;
                case 4:

                    respuestaCorrecta = casocuatro.casoCuatro(respuestaUsuario);

                    break;
                case 5:

                    respuestaCorrecta = casocinco.casoCinco(respuestaUsuario);

                    break;
                case 6:

                    respuestaCorrecta = casoseis.casoSeis(respuestaUsuario);

                    break;
                case 7:

                    respuestaCorrecta = casosiete.casoSiete(respuestaUsuario);

                    break;
                case 8:

                    respuestaCorrecta = casoocho.casoOcho(respuestaUsuario);

                    break;
            }

            if (respuestaCorrecta) {
                nivel++;
                respuestaCorrecta = false;
            }
        }

        System.out.println("¡Felicidades! Has resuelto todos los acertijos.");
    }
}
