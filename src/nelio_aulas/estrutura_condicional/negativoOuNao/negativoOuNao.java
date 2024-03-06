package nelio_aulas.estrutura_condicional.negativoOuNao;

import java.util.Scanner;
public class negativoOuNao {
  public static void main(String[] args) {
  /*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
    Scanner sc = new Scanner(System.in);
    
    System.out.println("digite um valor:");
    double num = sc.nextDouble();

    if (num < 0) {
       System.out.println("O valor: " + num + " é negativo");   
    }
    else {
      System.out.println("o valor: " + num + " não é negativo");
    }
    sc.close();
  }

}