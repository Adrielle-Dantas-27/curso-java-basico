package nelio_aulas.arraysList.soma_de_vetores_;

import java.util.Scanner;

public class somaVect {
    public static void main(String[] args) {
        /* Faça um programa para ler vetores A e B, contendo N elementos cada.
        Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
        elementos correspondentes de A e B. Imprima o vetor C gerado.
         * 
         */


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter em cada vetor? ");
        int qntdeValVect = sc.nextInt();

        int[] vectA = new int[qntdeValVect]; 
        int[] vectB = new int[qntdeValVect]; 
        int[] vectC = new int[qntdeValVect];

        for(int i = 0; i < qntdeValVect; i++) {

            System.out.println("Digite os valores do vetor A: ");
            vectA[i] = sc.nextInt();
        }
       
        for(int i = 0; i < qntdeValVect; i++) {
            System.out.println("Digite os valores do vetor B: ");
            vectB[i] = sc.nextInt();
        }

        System.out.println("Soma de A + B: ");
        for(int i = 0; i < qntdeValVect; i++) {
        vectC[i] = vectA[i] + vectB[i];
        System.out.println(vectC[i]);
        }



        sc.close();
         
    }
}
