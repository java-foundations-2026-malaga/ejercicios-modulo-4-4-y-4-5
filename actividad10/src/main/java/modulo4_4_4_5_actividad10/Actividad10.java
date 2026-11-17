package modulo4_4_4_5_actividad10;

import java.util.Random;

public class Actividad10 {
    public static void main(String[] args) {
        Random rnd1 = new Random(2026);
        Random rnd2 = new Random(2026);

        boolean iguales = true;
        for (int i = 0; i < 5; i++) {
            if (rnd1.nextInt(100) != rnd2.nextInt(100)) {
                iguales = false;
                break;
            }
        }

        System.out.println("Secuencias iguales: " + iguales);
    }
}
