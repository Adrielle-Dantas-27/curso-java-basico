package nelio_aulas.orientacao_a_objeto.triangulinhoClass;

import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        /* Faça um programa para ler as medidas dos lados d dois triangulos X e Y (suponha medidas válidas). Em seguida,
         * mostrar o valor das áreas dos dois triângulos e dize qual os dois triângulos e dizer qual do dois possui a maior area
         * 
         * smA forma para calcular a are de um tringulo a partr das medidas de seus lados a, b e c é:
         * area = (raiz quadrada)de p(p-a)(p-b)(p-c) onde p = a + b + c / 2
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.printf("digite o valor para 3 valores pra X:%n");
         x.a = sc.nextDouble();
         x.b = sc.nextDouble();
         x.c = sc.nextDouble();
     

        System.out.printf("digite o valor para 3 valores pra y:%n");
         y.a = sc.nextDouble();
         y.b = sc.nextDouble();
         y.c = sc.nextDouble();

        // vai mostrar o valor de y e de x
         double areaX, areaY;

        /* Quais são os benefícios de se calcular a area de um triangulo por meio de um MÉTODO dentro da CLASSE Triangel?
         * 
         * resposta 1): REAPROVEITAMENTO DO CÓDIGO: nós eliminamos o codigo repetido (areas do triangulo x e y)
         *  no programa principal (main)
         * 
         * resposta 2): DELEGAÇÃO DE RESPONSABILIDADES: quem deve ser responsavel por saber como calcular a area de um triangulo
         * é o próprio triangulo. A lo=ógica o cálculo da área não deve estar em outro lugar.
         */

         double px = x.area();
         areaX = Math.sqrt(px* (px-x.a)*(px-x.b)*(px-x.b));
        
         // chamando a função de area pra ca
         double py = y.area();
         areaY = Math.sqrt(py* (py-y.a)*(py-y.b)*(py-y.c));

         System.out.printf("o valor de X é: %.4f%n", px);
         System.out.printf("o valor de y é: %.4f%n", py);



        // vai mostrar qual deles é maior
        if (areaX > areaY) {
            System.out.println("A area x eh maior:" + areaX);

        } else {
            System.out.println("area y é maior:" + areaY);
        }

      sc.close();
    }
}