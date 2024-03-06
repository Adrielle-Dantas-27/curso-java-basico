package nelio_aulas.estrutura_repetitivas.intervaloInOut;

import java.util.Scanner;

public class inter {
    public static void main(String[] args) {
        /*Leia um valor inteiro N. Este valor será a quantidade
        de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e
        quantos estão fora do intervalo, mostrando 
        essas informações conforme exemplo (use a palavra 
        "in" para dentro do intervalo, e "out" para fora do intervalo). */

        Scanner sc = new Scanner(System.in);

        //vai ser a qntde de valores que vai ter 
        System.out.println("Digite um valor N: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for(int i = 0; i < n; i++) {

            int x = sc.nextInt();
            if((x >=10) && (x <=20)) {
              in = in + 1;
              System.out.println(in + " in");

            } else {
                out = out + 1;
              System.out.println(out + " out");
            } 

        }

        sc.close();
    }
    // ex n finalizado pq ele  faz sentido

}
