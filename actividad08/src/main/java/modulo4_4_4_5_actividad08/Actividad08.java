package modulo4_4_4_5_actividad08;


// Genera una edad entre 18 y 65 inclusive e imprímela con el formato `Edad: X`.
public class Actividad08 {
    public static void main(String[] args) {
        // TODO
        java.util.Random rnd = new java.util.Random();
        int edad = rnd.nextInt(48) + 18;
        System.out.println("Edad: " + edad);
    }
}
