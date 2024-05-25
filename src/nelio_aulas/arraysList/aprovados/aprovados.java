package nelio_aulas.arraysList.aprovados;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        /* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
        igual a 6.0 (seis).  --> ese ex deu a entender que era para armazenar tudo num unico vetor, nao ficou claro, 
        testei por desencargo so.  */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        int valor = 0;
        double media = 0;

        System.out.println("quantos alunos sarao digitados? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        
        for(int i = 0; i < n; i++) {
            valor = valor + 1;
            Scanner scNome = new Scanner(System.in);
            System.out.println("digite o nome, primeira e segunda nota do(a)" + valor + " aluno(a):");
            nome[i] = scNome.nextLine();
            nota1[i] = scNome.nextDouble();
            nota2[i] = scNome.nextDouble();
        }

         
            
         System.out.println("alunos aprovados: ");
         for(int i = 0; i < n; i++) {
            media = nota1[n] + nota2[n] / n;
            if(media >= 6.0) {
                System.out.println(nome[i]);
            }
         }

    
         
         
    }
}
