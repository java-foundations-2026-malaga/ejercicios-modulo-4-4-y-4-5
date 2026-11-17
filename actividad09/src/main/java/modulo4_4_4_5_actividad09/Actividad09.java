package modulo4_4_4_5_actividad09;
import java.util.Random;

public class Actividad09 {
    public static void main(String[] args) {
        // TODO
    	Random r = new Random();
    	
    	int result = r.nextInt(3); //numero aleatorio entre 0-2
        if (result == 0) {
        	System.out.println("El resultado es piedra");
		}else if (result == 1) {
			System.out.println("El resultado es papel");
		}else {
			System.out.println("El resultado es tijera");
		}
    }
}
