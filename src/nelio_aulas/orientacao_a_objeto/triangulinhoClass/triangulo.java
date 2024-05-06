package nelio_aulas.orientacao_a_objeto.triangulinhoClass;

public class triangulo {
    public double a;
    public double b;
    public double c;


    //função

    public double area() {

        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
