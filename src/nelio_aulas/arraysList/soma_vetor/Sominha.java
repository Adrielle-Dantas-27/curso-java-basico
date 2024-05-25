package nelio_aulas.arraysList.soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Sominha {
    public static void main(String[] args) {
        
/* diferença entre array e vetor:  */


        /* Faça um programa que leia N numeros reais e armazene-os em um vetor. Em seguida: 
         * - imprimir todos os elementos do vetor
         * - Mostrar a ssoma e a média dos elelmentos do vetor
         */
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         //ler os numeros e armazenando num vetor
         System.out.println(" Quantos numeros voce vai digitar? ");
         int n = sc.nextInt();

         //criando vetor
/*qual tipo do vetor || nome do vetor || instancia do vetor || tipo primitivo || o q ele armazenará (vairavel q será armazenada)*/
        int[] arr = new int [n];
// esse caso eh primitivo, mass outro tipo pode ter tb se vc criar numa classe : Funcionario[] fun = new Funcionario[10]; (Funcionario eh a classe)

        /* aqui vai funionar da seguinte maneira:
         * - la no next int eu decalrei a var. 
         * - No vetor, eu pedi pra ele armazenar nele os vaalores q eu colocar em n
         * - esse for vai servir para incrementar os valores e armazena-los corretamente nas posiçoes do vetor
         * - esse arr[i] vai basicamente armazenar esse valores que eu digitar de fato no vetor
         */
       
        for(int i = 0; i<n; i++) {
            System.out.println("Digite um numero: ");
            arr[i] = sc.nextInt(); // aqui vai armazenar os dados no vetor
        }

        System.out.println("Valores: ");
        for(int i = 0; i< n; i++){
            System.out.print(" " + arr[i] );
        } // arr eh array

        System.out.println(" ");
        double soma = 0.0;
        for(int i = 0; i < n; i++) {
            soma += arr[i]++;
        }

        System.out.println("soma: " + soma);

        double avg = soma / n;

        System.out.println("media: " + avg);

        

        sc.close();
         
    } // como usar as nomenclturas do java https://tidicas.com.br/?p=2106
}
