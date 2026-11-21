package modulo4_4_4_5_actividad08;

import java.util.Random;

public class Actividad08 {
    public static void main(String[] args) {
        Random random = new Random();

        int edad = random.nextInt(48) + 18;

        System.out.println("Edad: " + edad);
    }
}
