package modulo4_4_4_5_actividad09;

import java.util.Random;

public class Actividad09 {
    public static void main(String[] args) {
        // TODO Usa nextInt(3) y muestra piedra, papel o tijera.
    	
    	Random rd = new Random();
    	int nro = rd.nextInt(3)+1;
    	String name ="";
    	if (nro ==1) {
			name = "Piedra";
		}
    	if (nro ==2) {
			name = "Papel";
		}
    	if (nro ==3) {
			name = "Tijera";
		}
    	System.out.println("Resultado: "+ name);
    	
    }
}
