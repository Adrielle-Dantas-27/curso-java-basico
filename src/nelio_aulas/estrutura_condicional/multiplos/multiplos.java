package nelio_aulas.estrutura_condicional.multiplos;

import java.util.Scanner;
public class multiplos {
  public static void main(String[] args) {
    /*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    ordem crescente ou decrescente.*/

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro numero: ");
    int num1 = sc.nextInt();

    System.out.println("Digite o segundo numero: ");
    int num2 = sc.nextInt();

    // vai dividir o 1 e o 2 e se der resto 0 são multiplos e vise versa
    if (num1 % num2 == 0 || num2 % num1 == 0) {
      System.out.println("São multiplos");
    }
    else {
      System.out.println("Não são multiplos");
    }
    sc.close();
  }
}