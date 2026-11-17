package modulo4_4_4_5_actividad07;

import java.util.Random;

public class Actividad07 {
    public static void main(String[] args) {
        // TODO Genera un entero de 1 a 6 e imprime Dado: X.
    	Random rnd = new Random();
        int salida = rnd.nextInt(6) + 1;
        System.out.println("Dado: " + salida);
    }
}
