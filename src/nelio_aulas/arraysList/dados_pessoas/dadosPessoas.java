package nelio_aulas.arraysList.dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoas {
    public static void main(String[] args) {
        /* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
        de homens. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantas pessoas serão digitadas?");
        int n = sc.nextInt();

        double[] altura = new double[n];
        String[] genero = new String[n];

        for(int i = 0; i < n; i++) {

            System.out.println("altura da " + i+1 + " a pessoa:");
            altura[i] = sc.nextDouble();

            System.out.println("genero da " + i + 1 + " a pessoa");
            genero[i] = sc.nextLine();


        }

        double menorAltura = altura[0];
        double pmaiorAltura = altura[0];

        // continuar daqui

     

       
    }
}
