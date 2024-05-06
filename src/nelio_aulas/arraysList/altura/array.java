import java.util.Locale;
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        /* fazer um programa para ler um nuero inteiro N e a altura de N pessoas. 
        Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas alturas precisa para calcular a média?");
        int qntde = sc.nextInt();
        // recebe a instanciação do vetor
        double[] vect = new double[qntde];

        //digitar os numeros e guardá-los dentro do vetor
        for(int i = 0; i < qntde; i++) {
            vect[i] = sc.nextDouble();
            // o vect vai começar valendo zero, ent o vect vai passar pelo zero, recebendo o que o usuario digitar

        }

        double sum = 0.00;
        for(int i = 0; i < qntde; i++) {
            // via percorrer o vetor e pegar a soma de todo mundo da variavel sum
            sum  += vect[i];
        }
        
        // vai guardar a media nessa variável
        double avg = sum / qntde;

        System.out.println(" A média das alturas é: " + avg);

        sc.close();
    }

}
