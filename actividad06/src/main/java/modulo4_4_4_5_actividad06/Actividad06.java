package modulo4_4_4_5_actividad06;

import java.util.Random;

public class Actividad06 {
    public static void main(String[] args) {
        Random rnd = new Random();
        double lanzamiento = rnd.nextDouble();
        System.out.println(lanzamiento < 0.5 ? "heads" : "tails");
    }
}
