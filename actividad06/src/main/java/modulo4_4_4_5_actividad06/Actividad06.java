package modulo4_4_4_5_actividad06;
import java.util.Random;

public class Actividad06 {
    public static void main(String[] args) {
        // TODO
    	Random r = new Random();
    	
    	double n = r.nextDouble();
    	System.out.println(n);
    	//System.out.println("heads");
    	if (n <= 0.5) {
			System.out.println("heads");
		}else {
			System.out.println("tails");
		}
    	
    }
}
