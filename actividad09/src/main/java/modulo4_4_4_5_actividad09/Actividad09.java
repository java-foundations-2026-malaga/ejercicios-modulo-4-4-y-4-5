package modulo4_4_4_5_actividad09;

import java.util.Random;

public class Actividad09 {
    public static void main(String[] args) {
        // TODO Genera 0..2 y muestra la opción correspondiente.
    	Random rnd = new Random();
        int salida = rnd.nextInt(3)+1;
        System.out.println(salida == 0 ?"Debe imprimirse piedra, papel o tijera. Salida obtenida: piedra" : (salida == 1 ? "Debe imprimirse piedra, papel o tijera. Salida obtenida: papel": "Debe imprimirse piedra, papel o tijera. Salida obtenida: tijera"));

    }
}