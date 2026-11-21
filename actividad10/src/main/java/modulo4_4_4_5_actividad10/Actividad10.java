package modulo4_4_4_5_actividad10;

import java.util.Random;

public class Actividad10 {
    public static void main(String[] args) {
        Random random1 = new Random(2026);
        Random random2 = new Random(2026);

        int valor1 = random1.nextInt(100);
        int valor2 = random1.nextInt(100);
        int valor3 = random1.nextInt(100);

        int valor4 = random2.nextInt(100);
        int valor5 = random2.nextInt(100);
        int valor6 = random2.nextInt(100);

        boolean iguales = valor1 == valor4
                && valor2 == valor5
                && valor3 == valor6;

        System.out.println("Secuencias iguales: " + iguales);
    }
}
