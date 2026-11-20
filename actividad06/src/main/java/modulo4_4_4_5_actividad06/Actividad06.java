package modulo4_4_4_5_actividad06;

import java.util.Random;

public class Actividad06 {
    public static void main(String[] args) {
        /* TODO  Usa nextDouble() y decide entre heads y tails (por ejemplo, heads si el valor 
         * es menor que 0.5).
    	Imprime heads o tails.
    	*/
    	
    	Random rd = new Random();
    	double nro = rd.nextDouble();
    	System.out.println("nro Random:" + nro);
    	System.out.println(nro <= 0.5 ? "Heads" : "Tails");
    }
}
