package modulo4_4_4_5_actividad06;

import java.util.Random;

public class Actividad06 {
    public static void main(String[] args) {
        Random random = new Random();

        double valor = random.nextDouble();

        if (valor < 0.5) {
            System.out.println("heads");
        } else {
            System.out.println("tails");
        }
    }
}
