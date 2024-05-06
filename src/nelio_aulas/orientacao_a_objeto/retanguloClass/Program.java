package nelio_aulas.orientacao_a_objeto.retanguloClass;

import java.util.Locale;
import java.util.Scanner;


/**
 * areaTri
 */
public class Program {

    public static void main(String[] args) {
        /* Fazer um programa para ler os valores da largura e altura de um retângulo. 
        Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
        
        Usar uma classe:
        
               Rectangle
        ----------------------
        - Width: ouble
        - height: double
        ----------------------
        + Area(): double
        + Perimeter(): double
        + Diagonal(): double
        
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
      
         // instanciar a classe Rectangle 
         /*o motivo do erro abençoado por deus foi 
         que eu instanciei antes do scanner e 
         na vdd é depois do scanner*/
        Rectangle rectangle = new Rectangle();

        System.out.println("digite a altura do retangulo: ");
        rectangle.height = sc.nextDouble();

        System.out.println("digite a largura do retangulo: ");
        rectangle.width = sc.nextDouble();


        
        // aqui vai ficar a chamada do método area, perimetro e diagonal
        System.out.printf("area: %.2f%n", rectangle.area());
        System.out.printf("perimeter: %.2f%n", rectangle.perimetro());
        System.out.printf("diagonal: %.2f%n", rectangle.diagonal());

        sc.close();
    }
}