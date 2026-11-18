package modulo4_4_4_5_actividad04;

import java.util.Random;

public class Actividad04 {
    public static void main(String[] args) {
        Random rnd = new Random(4096);
        int n = rnd.nextInt(10)+1;//nextInt(10) genera números desde 0 hasta 9, no desde 1 hasta 10.
        System.out.println(n >= 1 && n <= 10 ? "Lotería válida" : "Lotería inválida");
    }
}
