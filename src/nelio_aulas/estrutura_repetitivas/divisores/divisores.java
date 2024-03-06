package nelio_aulas.estrutura_repetitivas.divisores;

import java.util.Scanner;

public class divisores {
    public static void main(String[] args) {
        
        /* Ler um número inteiro N e calcular todos os seus divisores */

        Scanner sc = new Scanner(System.in);

    System.out.println("digite um numero: " );
    int num = sc.nextInt();

  
    for (int i = 1;i <= num ; i++ ) {
       if(num % i == 0){
        System.out.println(i);

       }

    }

    sc.close();
    
    }
}
