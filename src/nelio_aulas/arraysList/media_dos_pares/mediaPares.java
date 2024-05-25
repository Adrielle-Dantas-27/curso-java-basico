package nelio_aulas.arraysList.media_dos_pares;

import java.util.Scanner;

public class mediaPares {
    public static void main(String[] args) {
        
        /* Fazer um programa para ler um vetor de N numeros inteiros. Em seguida.,
         * mostrar na tela a média aritmeica somente dos numeros pares lidos, com
         * uma casa decimal. Se nenhum numero par for digitado, mostrar somente msg: 
         * NENHUM NUM PAR
         */

        
         Scanner sc = new Scanner(System.in);

         System.out.println("Quantos elementos vao ter o vetor? ");
         int n = sc.nextInt();

         int[] vect = new int[n];

         int val = 0;
         for (int i = 0; i < n; i++) {
            val = val + 1;
            System.out.println("Digite o " + val + " numero: ");
            vect[i] = sc.nextInt();
         }

         int totPar = 0; 
         for(int i = 0; i < vect.length; i++) {
            totPar = totPar + vect[i];
         }

         double media = totPar / n;

         System.out.println("media dos pares: ");
        
         if(vect.length % 2 == 0) {
            System.out.println(media);
         } else {
            System.out.println("NENHUM NUMERO PAR");
         }  
         sc.close();
    }
}
