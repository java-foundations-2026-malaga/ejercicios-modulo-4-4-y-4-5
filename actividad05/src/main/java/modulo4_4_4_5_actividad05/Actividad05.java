package modulo4_4_4_5_actividad05;

import java.util.Random;

public class Actividad05 {
    public static void main(String[] args) {
        // TODO Ajusta nextInt(10) al intervalo 1..10.
    	Random rnd = new Random(4096);
        int salida = rnd.nextInt(10) + 1;
        System.out.println("Debe imprimirse el número generado. Salida obtenida: " + salida);
    }
}
