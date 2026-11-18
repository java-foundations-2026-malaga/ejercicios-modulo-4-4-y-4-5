package modulo4_4_4_5_actividad16;

public class Actividad16 {
    public static void main(String[] args) {
        int a = 12, b = 5;
        /* dos métodos estáticos de Math:
- Math.max(a, b): devuelve el número mayor.
- Math.min(a, b): devuelve el número menor.*/
        int mayor = Math.max(a, b);
        int menor = Math.min(a, b);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
