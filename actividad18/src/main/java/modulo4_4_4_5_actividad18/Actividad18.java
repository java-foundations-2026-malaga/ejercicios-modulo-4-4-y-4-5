package modulo4_4_4_5_actividad18;

import javax.print.attribute.standard.Media;

public class Actividad18 {
    public static void main(String[] args) {
        double a = 7, b = 8, c = 7.5;
        /* TODO  Muestra media, round, ceil y floor.
  
         * Media: 7.5
        Round: 8
        Ceil: 8.0
        Floor: 7.0
        */
      
        double media = (a + b) / 2;
        System.out.println("Media: "+ media);
        System.out.println("Round: "+ Math.round(media));
        System.out.println("Ceil: "+ Math.ceil(media));
        System.out.println("Floor: "+ Math.floor(media));
        
    }
}
