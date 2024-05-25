package nelio_aulas.arraysList.exMatriz;

import java.util.Scanner;

public class exMatriz {
    public static void main(String[] args) {
        /* Fazer um programa para ler um num inteiro n e uma matriz de ordem n contendo num inteiros. 
        Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz */
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //matriz sendo instanciada na memoria
        int[][] matrix = new int[n][n];

        //for que serve para percorrer a matriz inteira:
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                //matrix na linha i e coluna j vai receber o nextInt.
                matrix[i][j] = sc.nextInt();
            }
        }

        //mostrar a diagonal principal, basicamente eh a mesma posicao tanto linha qnt coluna, por isso o [i][i]
        System.out.println("main diagonal:");
        for(int i = 0; i< matrix.length; i++) {
            System.out.println(matrix[i][i] + " ");
        }

        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]< 0) {
                    count++;

                }
            }
        }

        System.out.println("negative numbers: " + count);
    }
}

