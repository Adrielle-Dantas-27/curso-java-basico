package nelio_aulas.arraysList.exResolvidoArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exArrayList {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler um número inteiro n e depois os dados(id, nome e salario) 
         * de N funcionario. Não deve haver repetição de id;
         * 
         * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
         * Para isso, o programa deve ler um id e o valor X. Se o id informado nao existir, mostrar uma
         * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionarios,
         * 
         * Lembre- se de aplicar a técnica de encapsulamento para nao permitir que o salário possa ser 
         * mudado livremente. Um salário so pode ser amentado com base em uma operação de aumento por % dada.
         * 
         * -------------------------------------------
         *                  Employee
         * -------------------------------------------
         * - id: integer
         * - name: String
         * - salary: Double
         * -------------------------------------------
         * + increaseSalary(percentage: double) void
         * -------------------------------------------
         */

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         // especifica qual o tipo especifico dos objetos da lista <Employee>
         List <Employee> list = new ArrayList<>();

         System.out.println("How many employees will be registered? ");
         int n = sc.nextInt();

         for(int i = 0; i < n; i++) {
            System.out.println("employee #" + i);
            System.out.println("id: ");
            Integer id = sc.nextInt();
            while(hasId(list, id)) {
                System.out.println("id alread taken! try again: ");
                id = sc.nextInt();

            }

            System.out.println("name: ");
            sc.nextLine(); // se eu n colocar aq ele faz aquela quebra de linha e fazendo o string name onsumir naa e fic aquele horror dos exs passados
            String name = sc.nextLine();

            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            // inserindo na lista: 
            list.add(emp);
         }

         System.out.println("Enter the employee ID that will have salary increase: ");
         int idSalary = sc.nextInt();

         Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

         if(emp == null) {
            System.out.println("this id doesn't exist!");
         } else {
            System.out.println("Enter the percentage: " );
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
         }

         System.out.println();
         System.out.println("list of employees: ");
         for(Employee e : list) {
            System.out.println(emp);
         }

    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
