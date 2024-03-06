package nelio_aulas.estrutura_repetitivas.senha;

import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        /* Escreva um programa que repita a leitura de uma senha até que ela seja válida.
         Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
         Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" 
         e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

         Scanner sc = new Scanner(System.in);

         System.out.println("digite seu login: ");
         String login = sc.nextLine();     // o nextLine(); serve para o string

         System.out.println("Digite uma senha de 4 digitos: ");
         int senha = sc.nextInt();

     
         while (senha != 2002) {
            System.out.println("Senha inválida, digite novamente: ");
            senha = sc.nextInt();
         }

         System.out.println("Acesso permitido, bem vindo(a): " + login);

         sc.close();

    }
}
