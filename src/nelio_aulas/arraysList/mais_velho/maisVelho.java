package nelio_aulas.arraysList.mais_velho;

import java.util.Scanner;

public class maisVelho {
    public static void main(String[] args) {
        /* Faer um programa para ler um conjunto de nomes de pessoas e suas
         * respectivas idades. Os nomes devem ser armazenados em um vetor, e as idades 
         * em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha.
         */


         Scanner sc = new Scanner(System.in);

         System.out.println("quantas pessoas voce vai digitar?");
         int n = sc.nextInt();

         int[] vectIdade = new int[n];
         String[] vectNome = new String[n];

         int val = 0;
         for(int i = 0; i < n; i++) {
            val = val + 1;
            System.out.println("Dados da " + val + "a pessoa");
            
            Scanner scNome = new Scanner(System.in);
            System.out.println("nome: ");
            vectNome[i] = sc.nextLine();

            Scanner ScIdade = new Scanner(System.in);
            System.out.println("idade: ");
            vectIdade[i] = sc.nextInt();
         }

         int maiorIdade = vectIdade[0];
         int posicaoMaior = 0;

         for(int i = 0; i < vectIdade.length ; i++) {
            if(vectIdade[i] > maiorIdade) {
                maiorIdade = vectIdade[i];
                posicaoMaior = i;
            }
         }

         System.out.println("pessoa mais velha: " + vectIdade[posicaoMaior]);

    }
}
