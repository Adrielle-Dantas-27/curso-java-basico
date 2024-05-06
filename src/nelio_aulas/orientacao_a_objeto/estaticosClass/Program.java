package nelio_aulas.orientacao_a_objeto.estaticosClass;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /* Fazer um programa para ler um valore numerico qualquer, e daí mostrar quano eria o valorde uma circunferencia
         * e do volume de uma esfera para um raio daquele valor. Informar ambém o valor de PI com duas casa decimais
         */

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

        // Calculator calc = new Calculator();

        System.out.println("enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius); // chama metodo e coloca parametro

        double v = Calculator.volume(radius); // chamando pela classe estatica

        System.out.printf("circumf: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
        sc.close();
    }
}
