package modulo4_4_4_5_actividad10;
import java.util.Random;

public class Actividad10 {
    public static void main(String[] args) {
        // TODO
    	Random rnd1 = new Random(2026);
    	Random rnd2 = new Random(2026);
    	int a1 = rnd1.nextInt(100);
    	int b1 = rnd2.nextInt(100);
    	int a2 = rnd1.nextInt(100);
    	int b2 = rnd2.nextInt(100);
    	int a3 = rnd1.nextInt(100);
    	int b3 = rnd2.nextInt(100);
    	boolean iguales = (a1 == b1) && (a2 == b2) && (a3 == b3);
    	System.out.println("Secuencias iguales: " + iguales);
    	
    }
}
