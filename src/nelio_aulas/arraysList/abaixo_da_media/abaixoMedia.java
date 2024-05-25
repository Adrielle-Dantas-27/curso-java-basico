package nelio_aulas.arraysList.abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class abaixoMedia {
    public static void main(String[] args) {
        /* Fazer um programa para ler um número n e depois um vetor de numeros reais
         * Em seguida. mostrar na tela a média aritmética de todos os elementos com tres decimais. 
         * Depois mostrar todos os elementos do vetor que estejam abaixo da média, cpm uma casa decimal  
         *
         */

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         System.out.println("quantos elementos vao ter o vetor? ");
         int n = sc.nextInt();

         double[] qntde = new double[n];

         int val = 0;
         for(int i = 0; i < n; i++) {
            val = val + 1;
            System.out.println("Digite o " + val + " numero: ");
            qntde[i] = sc.nextDouble();
         }

         double totSum = 0;
         for(int i = 0; i < qntde.length; i++) {
            totSum += qntde[i];
         }

         double mediaAritmetica = totSum / n;

         System.out.println("a média é: " + mediaAritmetica);

         System.out.println("Elementos fora da média: ");
         for(int i = 0; i < qntde.length; i++) {
            if(qntde[i] < mediaAritmetica) {
                System.out.println(qntde[i]);
            } 
         }  
         
         sc.close();
     }
}
