package modulo4_4_4_5_actividad06;


import java.util.Random;

// Imprime heads o tails según un valor double.

public class Actividad06 {
    public static void main(String[] args) {
        Random rnd = new Random();
        double valor = rnd.nextDouble();
        System.out.println(valor < 0.5 ? "Heads" : "Tails");
    }
}
