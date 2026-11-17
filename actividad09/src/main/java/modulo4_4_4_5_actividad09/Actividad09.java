package modulo4_4_4_5_actividad09;

import java.util.Random;

public class Actividad09 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int opcion = rnd.nextInt(3);

        if (opcion == 0) {
            System.out.println("piedra");
        } else if (opcion == 1) {
            System.out.println("papel");
        } else {
            System.out.println("tijera");
        }
    }
}