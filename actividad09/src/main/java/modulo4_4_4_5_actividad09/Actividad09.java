package modulo4_4_4_5_actividad09;

import java.util.Random;

public class Actividad09 {

    public static void main(String[] args) {

        Random rnd = new Random();

        int opcion = rnd.nextInt(3);

        String resultado;

        if (opcion == 0) {
            resultado = "piedra";
        } else if (opcion == 1) {
            resultado = "papel";
        } else {
            resultado = "tijera";
        }

        System.out.println(resultado);

    }

}