package nelio_aulas.estrutura_sequencial.salario_func;

import java.util.Scanner;
public class salarioFunc {
  public static void main(String[] args) {
    /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o numero do funcionário:" );
    double funcionario = sc.nextDouble();
    System.out.println("Digite as horas trabalhadas deste funcionário:" );
    double horasTrab = sc.nextDouble();
    System.out.println("Digite o valor que este funcionário recebe por hora:" );
    double salarioHora = sc.nextDouble();

    double salary = horasTrab * salarioHora;
    System.out.printf("Numero do funcionário é: %.0f %n", funcionario);
    System.out.printf("O salário do funcionário é: U$ %.2f %n", salary);

    sc.close();
    
  }

 
}