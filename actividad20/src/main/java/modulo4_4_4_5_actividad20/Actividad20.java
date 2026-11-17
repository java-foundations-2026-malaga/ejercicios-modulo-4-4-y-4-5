package modulo4_4_4_5_actividad20;

public class Actividad20 {
	public static void main(String[] args) {

        double libras = 150, pulgadas = 69;

        double imc = 703 * libras / (pulgadas * pulgadas);

        long imcRedondeado = Math.round(imc);

        System.out.println("IMC redondeado: " + imcRedondeado);

    }

}