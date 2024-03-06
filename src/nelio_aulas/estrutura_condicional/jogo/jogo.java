package nelio_aulas.estrutura_condicional.jogo;

import java.util.Scanner;
public class jogo {
  public static void main(String[] args) {
 /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a hora inicial do jogo: ");
    int inicial = sc.nextInt();

    System.out.println("Digite a hora final do jogo: ");
    int fim = sc.nextInt();

    int duracao;
    // o < é pq o inicio n pode começar maior q o final!
    if(inicial < fim) {
      duracao = inicial - fim;
     
    }
    else {
      duracao = 24 - inicial + fim;
    }
     System.out.println("O jogo durou: " + duracao);

     sc.close();
  }
}