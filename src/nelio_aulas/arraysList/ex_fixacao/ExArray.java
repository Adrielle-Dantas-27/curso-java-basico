package nelio_aulas.arraysList.ex_fixacao;

import java.util.Scanner;

public class ExArray {
    public static void main(String[] args) {
        /* criar um cadastro de nomes onde o usurio deverá iformar quantos nomes tem nesse cadastro
         * em seguida infomrar cada um dos nomes que deverá ser armzenado em arrays e por fim imprimir um por um
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("quantos nomes têm no cadastro?  ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int val = 0;
       
        
        for(int i = 0; i < n; i++ ) { // nao pode por .length no omeço pq ele n tem nada ainda
             val = val + 1;
            System.out.println("cadastro numero" + val);

            Scanner nomeSc = new Scanner(System.in);
            System.out.println("digite seu nome: ");
            nome[i] = nomeSc.nextLine();
            nomeSc.close();
          
        }

        System.out.println(" nomes: ");
        String nomesConcat= new String();
        for(int i = 0; i < nome.length; i++) { // aq pode or .length pq ja tem coisa dentro do array
            nomesConcat = nomesConcat.concat(nome[i]+ ", ");
        }
        
        System.out.println(nomesConcat.substring(0,nomesConcat.length()-2));




        sc.close();
        
    }
}
