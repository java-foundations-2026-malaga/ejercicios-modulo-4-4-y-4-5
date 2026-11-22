package modulo4_4_4_5_actividad07;

// Genera un entero de 1 a 6 e imprime Dado: X.

public class Actividad07 {
    public static void main(String[] args) {
        // TODO
        java.util.Random rnd = new java.util.Random();
        int dado = rnd.nextInt(6) + 1;
        System.out.println("Dado: " + dado);
    }
}
