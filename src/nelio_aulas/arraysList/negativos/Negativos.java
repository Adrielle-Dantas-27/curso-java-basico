package nelio_aulas.arraysList.negativos;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        /* Faça um programa que leia um numero inteiro positivo n(max 10) e depois 
         * n numeros inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os num negativos lidos.
        */
        int n;
        Scanner sc = new Scanner(System.in);    
        
        //ler um numero inteiro de no maximo 10
        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        
        // o vetor precisa estar fora de um loop, e eu preciso criar ele para que eu possa usar no decorrer do programa, pode haver + de 1
        int [] vect = new int [n];
        
        // armazenar os n no vetor
            for(int i = 0; i < n; i++) {
                // esse vetor vai armazenar a qnde de num q eu escolher || vai ordenar no vetor
                System.out.println("Digite um numero: ");
                vect[i] = sc.nextInt(); // aqui eu vou ja armazenando os nums q eu digitar no vetor
            }

            System.out.println("Numeros negativos: ");

            /* aqui eu vou usar a condição if dentro do for, pq ele vai usar como base a contagem em ordem e ai
                a condição é que se no vetor tiver algum numero que seja menor que 0, ele vai mostrar o print*/
            for(int i= 0; i <= n; i++) {
                if(vect[i] < 0) {
                    System.out.println(vect[i]);
                }

            }
        sc.close();
    }
}
