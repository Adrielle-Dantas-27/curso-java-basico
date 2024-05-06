package nelio_aulas.orientacao_a_objeto.dollarClass;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        /* Faça um programa para ler a cotação do dolar, e depois um valor em dolares
         a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dolares, 
         considerando ainda que a pessoa terá que 6% de IOF sobre o valor em dolar. 
         Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
         */


         // ler cotação em dollar (vou escrever o valor do dollar)
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
        // criar instancia
         Converter converter = new Converter();

         System.out.println("Quanto custa o dollar? ");
         converter.dollar = sc.nextDouble();

        
        

         // quanto vou comprar em dolares
         System.out.println("Quantos dolares voce vai comprar? ");
         converter.comp = sc.nextDouble();

         System.out.println(" ");
         System.out.println("O valor a ser pago em reais será de: " + converter.vaiPagar() );
        

         // informar quanto a pessoa vai pagar pelos dolares + taxa de IOF de 6%
        System.out.println(" O valor a ser pago em reais + taxa de IOF é: " + converter.taxaTotal());













    }
}
