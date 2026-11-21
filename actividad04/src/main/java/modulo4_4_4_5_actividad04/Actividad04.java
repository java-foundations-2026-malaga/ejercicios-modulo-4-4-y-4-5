package modulo4_4_4_5_actividad04;

import java.util.Random;

public class Actividad04 {
    public static void main(String[] args) {
        Random random = new Random();

        int numero = random.nextInt(10) + 1;

        System.out.println("Lotería válida");
    }
}