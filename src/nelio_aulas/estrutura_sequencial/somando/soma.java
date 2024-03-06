package nelio_aulas.estrutura_sequencial.somando;

import java.util.Scanner;
public class soma {
  public static void main(String[] args) {
    /* EX 1:Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */

    int a;
    int b;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor para A: ");
    a = sc.nextInt();

    System.out.println("Digite um valor para B: ");
    b = sc.nextInt();

    int soma = a + b; 

    System.out.println("SOMA = " + soma);
    
    sc.close();
  }
}