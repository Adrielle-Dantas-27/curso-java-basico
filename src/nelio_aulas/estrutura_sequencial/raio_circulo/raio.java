package nelio_aulas.estrutura_sequencial.raio_circulo;

import java.util.Scanner;

public class raio {
  public static void main(String[] args) {

   /* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
    Fórmula da área: area = π . raio2
    Considere o valor de π = 3.14159*/

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor do raio:");
    double raio = sc.nextDouble();
    
    double a = 3.14159 * (raio * raio);

    System.out.printf("O valor da área é: %.4f", a);

    sc.close();

  }
}