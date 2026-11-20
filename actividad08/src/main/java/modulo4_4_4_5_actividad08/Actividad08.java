package modulo4_4_4_5_actividad08;

import java.util.Random;

public class Actividad08 {
    public static void main(String[] args) {
        /* TODO Usa nextInt(48) + 18.
			Salida de ejemplo (el número cambia en cada ejecución): Edad: 37
         */
    	Random rd = new Random();
    	int nro = rd.nextInt(48)+18;
    	System.out.println("Edad: "+ nro);
    	
    }
}
