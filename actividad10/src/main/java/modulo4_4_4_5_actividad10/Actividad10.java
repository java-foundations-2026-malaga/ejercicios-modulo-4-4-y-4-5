package modulo4_4_4_5_actividad10;

import java.util.Random;

public class Actividad10 {
    public static void main(String[] args) {
        // TODO Usa new Random(2026) dos veces y nextInt(100).
    	//ERROR    org.opentest4j.AssertionFailedError: expected: <Secuencias iguales: true> but was: <Resultado: 100>
    	

    	
    	Random rd = new Random(2026);
 
    	int nro = rd.nextInt(100);
       	Random rd1 = new Random(2026);
    	int nro1 = rd1.nextInt(100);
    	
    	System.out.println("Secuencias iguales: "+ (nro == nro1));
    }
}
