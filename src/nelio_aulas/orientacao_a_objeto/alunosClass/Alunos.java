package nelio_aulas.orientacao_a_objeto.alunosClass;

import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
     /* fazer um programa para ler o nome de um aluno e as tres notas
   que ele obteve nos tres trimestres do ano (primiero trimestre vale 30, 
   segundo e terceiro valem 35). Ao final, mostrar qual a nota final do aluno 
   no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, 
   em caso negativo, quatos pontos faltam para o aluno obter o mínimo para ser
   aprovado (que é 60% da nota). Voce devve criar uma classe Student
    para resolver este problema.
   */



   // ler nome de um aluno e as 3 notas dele
   Scanner sc = new Scanner(System.in);

   // instanciar uma classe
   Student student = new Student();

   //imprimir dados e armazenar
   System.out.println("Nome do aluno:" );
   student.name = sc.nextLine();

   System.out.println("Nota do primeiro semestre: ");
   student.notaUm = sc.nextDouble();

   System.out.println("Nota do segundo semestre: ");
   student.notaDois = sc.nextDouble();

   System.out.println("Nota do terceiro semestre: ");
   student.notaTres = sc.nextDouble();

   // imprimir nota tota do aluno antes (pra dps chamar na condição if)
   System.out.println("A nota total do aluno(a) " + student.name + " foi: " + student.totalNota());


   // usar a condiçao if se os aluos estiveram a nota mais de 60%, se n, estao reprovados
    if (student.totalNota() >= 60 && student.totalNota() <= 100) {
        System.out.println("O(A) aluno(a): " + student.name + " passou de ano!!");

    } else {
        System.out.println("sinto muito, mas o(a) aluno(a): " + student.name + " não passou de ano :()");
        System.out.println("total de nota: " + student.totalNota());
        System.out.println("nota que falta: " + student.qntFalta());
    }








    sc.close();
        
    }
}
