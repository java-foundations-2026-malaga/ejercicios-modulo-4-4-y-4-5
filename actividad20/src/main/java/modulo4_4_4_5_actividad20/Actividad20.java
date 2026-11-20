package modulo4_4_4_5_actividad20;

public class Actividad20 {
    public static void main(String[] args) {
        double libras = 150, pulgadas = 69;
        // TODO   Calcula el IMC desde libras y pulgadas (IMC = 703 × libras / pulgadas²) y redondéalo con Math.round.
        
        double imc = 703 * libras / Math.pow(pulgadas, 2);
        long imcRedondeado = Math.round(imc);

        System.out.println("IMC redondeado: " + imcRedondeado); // IMC: 22
       

    }
}
