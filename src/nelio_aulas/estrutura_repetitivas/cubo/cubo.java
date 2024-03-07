package nelio_aulas.estrutura_repetitivas.cubo;

import java.util.Scanner;

public class cubo {
    public static void main(String[] args) {
        /* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
        exemplo */

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero:");
        int n = sc.nextInt();


        int quadrado = 1;
        int cubo = 1;
        for(int i = 1; i <= n; i++) {
            quadrado = i * i;
            cubo = i * i * i;
            System.out.println(i +" " + quadrado + " " + " " + cubo);
        }

        sc.close();

    }
}
