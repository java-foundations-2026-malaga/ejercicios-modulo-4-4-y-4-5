package modulo4_4_4_5_actividad10;

import java.util.Random;

public class Actividad10 {

    public static void main(String[] args) {

        Random rnd1 = new Random(2026);
        Random rnd2 = new Random(2026);

        int n1 = rnd1.nextInt(100);
        int n2 = rnd1.nextInt(100);
        int n3 = rnd1.nextInt(100);

        int m1 = rnd2.nextInt(100);
        int m2 = rnd2.nextInt(100);
        int m3 = rnd2.nextInt(100);

        boolean iguales = n1 == m1 && n2 == m2 && n3 == m3;

        System.out.println("Secuencias iguales: " + iguales);

    }

}