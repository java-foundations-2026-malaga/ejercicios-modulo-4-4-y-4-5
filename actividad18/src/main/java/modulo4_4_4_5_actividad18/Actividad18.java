package modulo4_4_4_5_actividad18;

public class Actividad18 {
    public static void main(String[] args) {
        double a = 7, b = 8, c = 7.5;
        /* 
        Math.round(): redondea al entero más cercano.
		Math.ceil(): redondea hacia arriba.
		Math.floor(): redondea hacia abajo.
		*/
        double media = (a + b + c) / 3;
        long redondeo = Math.round(media);
        double techo = Math.ceil(media);
        double suelo = Math.floor(media);
        System.out.println("Media: " + media);
        System.out.println("Round: " + redondeo);
        System.out.println("Ceil: " + techo);
        System.out.println("Floor: " + suelo);
        
    }
}
