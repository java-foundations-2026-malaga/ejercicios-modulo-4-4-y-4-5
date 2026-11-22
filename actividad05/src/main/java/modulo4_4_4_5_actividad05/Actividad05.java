package modulo4_4_4_5_actividad05;


import java.util.Random;
// Instancia Random, usa nextInt() e imprime el valor.

public class Actividad05 {
    public static void main(String[] args) {
        java.util.Random rnd = new java.util.Random();

        int salida = rnd.nextInt(100);
        System.out.println("Debe imprimirse el número generado. Salida obtenida:" + salida);

    }
}
