package nelio_aulas.arraysList.array_vetor;

import java.util.Scanner;

public class ParOtimizado {
    public static void main(String[] args) {
        /* Faça um programa que leia N números inteiros e armazene-os em um vetor. 
           Em seguida, mostre na tela todos os números pares. e tambem a quantidade de
           números pares. 
         */

// aqui vai diminuir a qntde de for

         Scanner sc = new Scanner(System.in);
         
         System.out.println("quantos numero vai digitar?");
         int n = sc.nextInt();

         int[] vect = new int[n];
         int[] arrNumerosPares = new int[vect.length];// inicializar o array com a qntde de elementod no vect
         int totalNumerosPares = 0;

         for(int i = 0; i < vect.length; i++) {
            System.out.println("digite um numero: ");
            vect[i] = sc.nextInt(); // pq o vetor eh int
            if(vect[i] % 2 == 0) {
                totalNumerosPares++;
                arrNumerosPares[i] = vect[i];
            
            }
         }

        System.out.println("numeros pares: ");
        for(int i = 0; i < arrNumerosPares.length; i++) {
            if(arrNumerosPares[i] != 0) {
                System.out.print(" " + arrNumerosPares[i]);

            }

        }

        System.out.println("\nValores Pares: " + totalNumerosPares);
 

         sc.close();
    }
}
