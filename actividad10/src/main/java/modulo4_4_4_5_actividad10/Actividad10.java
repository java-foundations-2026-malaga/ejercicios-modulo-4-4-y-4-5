package modulo4_4_4_5_actividad10;
// Crea dos objetos `Random` con la misma semilla (`2026`), genera tres valores con `nextInt(100)` en cada uno y comprueba si coinciden.

public class Actividad10 {
    public static void main(String[] args) {
        // TODO
        java.util.Random rnd1 = new java.util.Random(2026);
        java.util.Random rnd2 = new java.util.Random(2026);

        for (int i = 0; i < 3; i++) {
            int val1 = rnd1.nextInt(100);
            int val2 = rnd2.nextInt(100);
            System.out.println("Valor " + (i + 1) + ": " + val1 + " - " + val2 + " - " + (val1 == val2 ? "Coinciden" : "No coinciden"));
        }
    }
}
