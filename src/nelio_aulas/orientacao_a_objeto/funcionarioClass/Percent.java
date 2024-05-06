package nelio_aulas.orientacao_a_objeto.funcionarioClass;

import java.util.Locale;
import java.util.Scanner;

public class Percent {
    public static void main(String[] args) {
        
    /* Fazer um programa para ler os dados de um funcionário(nome, salário bruto e imposto.)
     * Em segida, mostrar os dados do funcionario (noome e salario bruto). Em seguida,
     * aumentar o salario do funcionario com base em uma porcentafem dada 
     * (somente o salario bruto é fetado pela porcentagem) e mostrar novamen os dados do
     *  funcionario. Use uma classe projetada abaixo
     * 
     * 
     * --------------------------------------------
     *                  Employee
     * --------------------------------------------
     * + Name: String
     * + GrossSalary: double
     * + Tax: double
     * --------------------------------------------
     * + NetSalary(): double
     * + increaseSalary(percentage: double): void
     * --------------------------------------------
     */

     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

     //instaciando a classe
     Employee employee = new Employee();


     // lendo os dados do funcionário
     System.out.println("digite o nome do funcionário: ");
     employee.name = sc.nextLine();

     System.out.println("digite o salário bruto do funcionário: ");
     employee.salario = sc.nextDouble();

     System.out.println("digite o valor imposto do salário dele(a): ");
     employee.imposto = sc.nextDouble();

     //imprimindo os dados sugeridos
     System.out.println ("imprimindo dados:      ");
     System.out.println ("------------------------------");
     System.out.println ("nome: " + employee.name);
     System.out.println ("salario bruto: " + employee.salario);
     System.out.println ("imposto: " + employee.imposto);

     // imprimir desconto no salario
     System.out.println("desconto do salario: "+ employee.descontoSalario());

     //imprimir quanto por cento aumentou os alario do funcionario (varios valores)
     //imprimir valor atualizado (puxar o valor do da porcentagem)
     System.out.println(" ");
     System.out.println("quantos % deseja aumentar o salario? ");
     double percent = sc.nextDouble();
     employee.impostoSalario(percent);

    System.out.println ("---------------------------------");
     System.out.println("atualização do salario" + employee); 
     sc.close();






    }
}
