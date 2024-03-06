package nelio_aulas.estrutura_repetitivas.divisao;

import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        
        /* Fazer um programa para ler um número N. Depois leia N pares de números e 
        mostre a divisão do primeiro pelo segundo. Se o denominador 
        for igual a zero, mostrar a mensagem "divisao impossivel" */

        Scanner sc = new Scanner(System.in);


        System.out.println("digite um numero qualquer: ");
        int n = sc.nextInt();
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if(b == 0) {
                System.out.println("Divisao impossivel");

            }else {
                double divisao = (double)  a / b; // esse segundo doubke é para especificar que o valor dividindo a e b serão double e nao mais int (para facilitar da prpa por tudo int)
                System.out.println("divisao:"  + divisao);
            }

            sc.close();

        }









    }
}
