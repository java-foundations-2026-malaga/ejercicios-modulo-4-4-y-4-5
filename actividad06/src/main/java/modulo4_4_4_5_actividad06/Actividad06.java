package modulo4_4_4_5_actividad06;

import java.util.Random;

public class Actividad06 {
	

	    public static void main(String[] args) {

	        Random rnd = new Random();

	        double valor = rnd.nextDouble();

	        String resultado = valor < 0.5 ? "heads" : "tails";

	        System.out.println(resultado);

	    }

	}
