package nelio_aulas.estrutura_condicional.impaPar;

import java.util.Scanner;
public class imparPar {
  public static void main(String[] args) {

    /*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número: ");
    double num = sc.nextDouble();

    // essa condição serve para pegar o resto da divisão
    if (num % 2 == 0) {
       System.out.println("Este numero é par!");
    }
    else {
      System.out.println("Este numero é impar!");
    }
     sc.close();
  }
}