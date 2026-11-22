package modulo4_4_4_5_actividad09;


// Genera 0..2 y muestra la opción correspondiente.
// Debe imprimirse piedra, papel o tijera.
public class Actividad09 {
    public static void main(String[] args) {
        // TODO
        java.util.Random rnd = new java.util.Random();
        int opcion = rnd.nextInt(3);
        switch (opcion) {
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Tijera");
                break;
        }
    }
}
