package nelio_aulas.estrutura_condicional.origem;

import java.util.Scanner;

public class origem {
    public static void main(String[] args) {
        /*  Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
            de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
            ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
            Se o ponto estiver na origem, escreva a mensagem “Origem”.
            Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
            situação.
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("Digite um valor para X: ");
         double x = sc.nextDouble();

         System.out.println("Digite um valor para y: ");
         double y = sc.nextDouble();

         if (x == 0 || y == 0) {
            System.out.println("o eixo está na orgiem");
         }
         // esses alores estao como zero pq o plano cartesiano pode ser infinito e o 0 indica a origem 

         else if (x == 0) {
            System.out.println("eixo x");
         }

         else if (y == 0) {
            System.out.println("eixo y");
         }

         else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
         }

         else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
         }
         
         else if (x > 0.0 && y > 0.0) {
            System.out.println("Q3");
         }
         
         else {
            System.out.println("Q4");
         }

         sc.close();
    }
}
