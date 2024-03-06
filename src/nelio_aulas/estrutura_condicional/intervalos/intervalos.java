package nelio_aulas.estrutura_condicional.intervalos;

import java.util.Scanner;
public class intervalos {
  public static void main(String[] args) {
 /*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite um numero qualquer: ");
    double num = sc.nextDouble();

    
    if (num < 0.0 && num >= 25.0) {
      System.out.println("O número digitado está entre 0 e 25");
    }/*
    else if ((num >= 25) && (num =< 49.99)) {
      System.out.println("O número digitado está entre 25 e 50");
    }
    else if ((num >= 50) && (num =< 74.99)) {
      System.out.println("O número digitado está entre 50 e 75");
    }
    else if ((num >= 75) && (num =< 99.99)) {
      System.out.println("O número digitado está entre 75 e 100");
    }
    else {
      System.out.println("fora de intervalo");
    }*/
    sc.close();
  }
}