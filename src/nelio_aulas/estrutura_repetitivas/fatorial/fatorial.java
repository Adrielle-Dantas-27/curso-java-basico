package nelio_aulas.estrutura_repetitivas.fatorial;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        
        /* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1. */



        Scanner sc = new Scanner(System.in);

        System.out.println("digite um valor qualquer: ");
        double n = sc.nextDouble();


        double fat = 1;
        for(double i = n; i <=n; i++) {
            
         fat = fat * 1;

            if (n == 0) {
        
                System.out.println("O valor fatorial de 0 é 1");

            } else {
            
                System.out.println("o fatorial do numero é: " + fat);
            }
        }

        sc.close();
    }
    
}
