package nelio_aulas.orientacao_a_objeto.estaticosClass;

public class Calculator {


    // se esses metodos n tiver statics eles precisam ser instanciados no main
    public /*static*/ static double PI = 3.14159; // as constante sao sempre em maiusculo

    public static double circumference(double radius) {
        return 2.0 * PI * radius;

    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3;

    }
    
}
