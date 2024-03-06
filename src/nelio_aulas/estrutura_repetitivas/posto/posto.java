package nelio_aulas.estrutura_repetitivas.posto;

import java.util.Scanner;

public class posto {
    public static void main(String[] args) {
      /* */  
        /* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
            um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
            4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
            que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
            mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
            exemplo. */
            
            /*E screva  ler combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
            4.Fim).*/
            Scanner sc = new Scanner(System.in);

            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Fim");


            int alcool = 0;
            int gasolina = 0;
            int diesel = 0;

            System.out.println("Digite o número de qual desses combustíveis gostaria de abstecer: ");
            int combustivel = sc.nextInt();

            /*anotaçoes: o while vai rodar ate o 4, se eu digitar um numero fora do 4 ele vai mandar a msg pra eu digitar dnv, 
            ai quanto mais vezes eu diitar um numero entre 1 e 3, vai contabilizar os abastecimentos de preferencia, 
            ate que eu digite o num 4 q vai fechar o prog*/
           

			
            while (combustivel != 4) { // ante tinha colocado o > 4, mas tem que ser != pra pegar todos menos o 4

				char resp = sc.next().charAt(0);
                if (combustivel == 1) {
                    
					for (;(resp == 's');); {
						
						System.out.println("deseja continuar? ");
						resp = sc.next().charAt(0);
						
						
						System.out.println("Digite o número de qual desses combustíveis gostaria de abstecer: ");
						combustivel = sc.nextInt();
					

						alcool++;
						// ele so manda a msg de deseja continuar depois de 3 vezes que eu digito o numero (erro)
						// ta pegando todos os valores quando digito. eh para pegar somente ou num ou letra

					}
   
               } 
               
               else if (combustivel == 2) {
			

				   for (;(resp == 's') || (resp != 'n');) {
				
					System.out.println("deseja continuar? ");
					resp = sc.next().charAt(0);

					System.out.println("Digite o número de qual desses combustíveis gostaria de abstecer: ");
					combustivel = sc.nextInt();
				
					gasolina++;

					
				}
               } 
               
               else if (combustivel == 3) {
                   diesel++;

               } else {
                 System.out.println("voce digitou errado, digite novamente: ");
                 combustivel = sc.nextInt();
               }
                 
            }

            // se deixae o sout dentro do loop while, ele fica rodando infinitamente, tem  ser todado fora dele
                 System.out.println("muito obrigado");
                 System.out.println("alcool: " + alcool);
                 System.out.println("gasolina: " + gasolina);
                 System.out.println("diesel" + diesel);

                 sc.close();
      
				// exercicio n finalizado

    }
}
