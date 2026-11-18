package modulo4_4_4_5_actividad17;

public class Actividad17 {
    public static void main(String[] args) {
        double n = 16;
        /*Combinar dos métodos de la clase Math:
- Math.sqrt(n): calcula la raíz cuadrada.
- Math.pow(n, 2): calcula el número elevado al cuadrado. */
        double raiz = Math.sqrt(n);
        double cuadrado = Math.pow(n, 2);
        System.out.println("Raíz: " + raiz);
        System.out.println("Cuadrado: " + cuadrado);
    }
}
