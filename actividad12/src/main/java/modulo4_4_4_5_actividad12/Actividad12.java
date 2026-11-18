package modulo4_4_4_5_actividad12;

public class Actividad12 {
    public static void main(String[] args) {
        //Math math = new Math();Los métodos estáticos pertenecen a la propia clase, no a los objetos. Por eso no necesitamos crear un objeto Math.
        System.out.println(Math.abs(-9));
        //- math.abs() intentaba llamar al método desde un objeto.
        //- Math.abs() lo llama directamente desde la clase.
    }
}
