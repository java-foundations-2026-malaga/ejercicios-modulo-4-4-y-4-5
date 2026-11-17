package modulo4_4_4_5_actividad08;

import java.util.Random;

public class Actividad08 {
    public static void main(String[] args) {
        // TODO Genera una edad entre 18 y 65 inclusive e imprímela con el formato Edad: X.
    	Random rnd = new Random();
        int salida = rnd.nextInt(48)+18;
        System.out.println("Edad: " + salida);
    }
}
