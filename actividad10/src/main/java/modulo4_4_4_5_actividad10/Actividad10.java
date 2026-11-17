package modulo4_4_4_5_actividad10;

import java.util.Random;

public class Actividad10 {
    public static void main(String[] args) {
        // TODO Crea dos objetos Random con la misma semilla (2026), genera tres valores con nextInt(100) 
    	//en cada uno y comprueba si coinciden.
    	Random rnd = new Random(2026);
    	Random rnd2 = new Random(2026);
        int valor1 = rnd.nextInt(100);
        int valor2 = rnd.nextInt(100);
        int valor3 = rnd.nextInt(100);
        int valor21 = rnd2.nextInt(100);
        int valor22 = rnd2.nextInt(100);
        int valor23 = rnd2.nextInt(100);
        System.out.println(valor1 == valor21 && valor2 == valor22 && valor3 == valor23 ? "Secuencias iguales: true" : "Secuencias iguales: false" );
    }
}
