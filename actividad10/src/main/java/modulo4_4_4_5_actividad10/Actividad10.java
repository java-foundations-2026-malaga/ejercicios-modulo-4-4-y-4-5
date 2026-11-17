package modulo4_4_4_5_actividad10;
import java.util.Random;

public class Actividad10 {
    public static void main(String[] args) {
        // TODO
    	Random r1 = new Random(2026);
    	
    	int v1 = r1.nextInt(100);
    	int v2 = r1.nextInt(100);
    	int v3 = r1.nextInt(100);
    	
    	
    	
    	Random r2 = new Random(2026);
    	
    	int d1 = r2.nextInt(100);
    	int d2 = r2.nextInt(100);
    	int d3 = r2.nextInt(100);
    	
    	
    	
    	boolean result;
    	
    	if(v1 == d1 && v2 == d2 && v3 == d3) {
    		result = true;
    		System.out.println("Secuencias iguales: " + result);
    	}else {
    		result = false;
    		System.out.println("Secuencias iguales: " + result);
    	}
    	
    	
    }
}
