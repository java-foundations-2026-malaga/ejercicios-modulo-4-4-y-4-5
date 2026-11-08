package modulo4_4_4_5_actividad03;

import java.util.Random;

public class Actividad03 {
    public static void main(String[] args) {
        Random rnd = new Random(42);
        int dado = rnd.nextInt(6);
        System.out.println(dado >= 1 && dado <= 6 ? "Dado válido" : "Dado inválido");
    }
}
