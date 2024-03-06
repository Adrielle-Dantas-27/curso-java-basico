package nelio_aulas.estrutura_repetitivas.decimal;

import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        /* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
        peso 5 */

        //ler um valor inteiro N q é a qndte de casos de teste
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de casos: ");
        int casos = sc.nextInt();
     
        for ( int i = 0; i < casos; i++) {
            System.out.print("Digite um valor para a: \n");
            int a = sc.nextInt();
            
            System.out.print("Digite um valor para b: \n");
            int b = sc.nextInt();
            
            System.out.print("Digite um valor para c:  \n");
            int c = sc.nextInt();
    
    
            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
            
            System.out.printf("a média de  é:  %.1f \n", media);
         
        }

        sc.close();
    }
}
//quebra de linha em java \n
