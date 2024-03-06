package nelio_aulas.estrutura_condicional.valorItens;
import java.util.Scanner;


    public class valorItens {
        public static void main(String[] args) {
        /* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
            seguir, calcule e mostre o valor da conta a pagar.*/

            Scanner sc = new Scanner(System.in);

            // escrever programa que LEIA o CÓDIGO de um item e quantidade
            System.out.println("Digite o código do item que gostaria: ");
            double codigo = sc.nextDouble();

            System.out.println("Quantas quantidades?");
            double qntde = sc.nextDouble();

            // a variável criada tem que estar fora do escopo do if se nao ela nao vai funcionar por conta do booleano
            double total = 0; 
            if (codigo == 1) {
            total = qntde * 4.00;
            }
            else if (codigo == 2) {
            total = qntde * 4.50;
            }
            else if (codigo == 3) {
            total = qntde * 5.00;
            }
            else if (codigo == 4) {
            total = qntde * 2.00;
            }
            else if (codigo == 5) {
            total = qntde * 1.50;
            }
            else {
            System.out.println("não há opção com este código");
        
            }

            System.out.printf("O total deu: R$ %.2f", total);

            sc.close();
        }
        
        }
        // control + D seleciona todas as plavars que voce selecionou (iguais)