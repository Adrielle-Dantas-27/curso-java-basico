package nelio_aulas.estrutura_sequencial.diferenca;

import java.util.Scanner;
public class diferenca {
  public static void main(String[] args) {
   /* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor para A: ");
    double a = sc.nextDouble();
    System.out.println("Digite um valor para B: ");
    double b = sc.nextDouble();
    System.out.println("Digite um valor para C: ");
    double c = sc.nextDouble();
    System.out.println("Digite um valor para D: ");
    double d = sc.nextDouble();

    double dif = (a * b - c * d);

    System.out.printf("A diferença entre esses numeros, é: %.0f", dif);
    sc.close();

  }
}