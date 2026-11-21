package modulo4_4_4_5_actividad07;

import java.util.Random;

public class Actividad07 {
    public static void main(String[] args) {
        Random random = new Random();

        int dado = random.nextInt(6) + 1;

        System.out.println("Dado: " + dado);
    }
}

