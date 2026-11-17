package modulo4_4_4_5_actividad20;
public class Actividad20 {
    public static void main(String[] args) {
        double libras = 150, pulgadas = 69;
        // TODO
        
        double imc = 703 * (libras/Math.pow(pulgadas, 2)); 
        
        System.out.println("IMC redondeado: " + Math.round(imc));
    }
}
