package nelio_aulas.estrutura_repetitivas.impares;

import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        
        /* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
X, se for o caso.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um valor para x: ");
        int x = sc.nextInt();

        for (x = 0; x <= 10; x++) {
          if ( x % 2 != 0) {
            System.out.println("o impar é:" + x);
          }  
        }

        sc.close();
    }
    
}
