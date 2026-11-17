package modulo4_4_4_5_actividad06;

import java.util.Random;

public class Actividad06 {
    public static void main(String[] args) {
        // TODO Imprime heads o tails según un valor double.
    	Random rnd = new Random(4096);
        double salida = rnd.nextDouble();
    	System.out.println(salida >=5 ? "Debe imprimirse heads o tails. Salida obtenida: head": "Debe imprimirse heads o tails. Salida obtenida: tails");
    }
}
