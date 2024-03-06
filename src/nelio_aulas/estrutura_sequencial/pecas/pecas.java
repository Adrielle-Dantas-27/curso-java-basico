package nelio_aulas.estrutura_sequencial.pecas;

import java.util.Scanner;
public class pecas {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o código da 1º peça: ");
    int pecaUm = sc.nextInt();

    System.out.println("Digite a quantidade de peças que há:");
    int qntdUm = sc.nextInt();

    System.out.println("Digite o valor unitário de cada peça:");
    double unitUm = sc.nextDouble();

    System.out.println("Digite o código da 2º peça: ");
    int pecaDois = sc.nextInt();

    System.out.println("Digite a quantidade de peças que há: ");
    int qntdDois = sc.nextInt();

    System.out.println("Digite o valor unitário de cada peça: ");
    double unitDois = sc.nextDouble();

    double qntdTot1 = qntdUm * unitUm;
    double qntdTot2 = qntdDois * unitDois;
      
    double valorPagar = qntdTot1 + qntdTot2;
    System.out.println("As peças escolhidas foram: " + pecaUm + ", " + pecaDois); 
    System.out.printf("O valor a ser pago das peças será: R$ %.2f", valorPagar);

    sc.close();
  }

}