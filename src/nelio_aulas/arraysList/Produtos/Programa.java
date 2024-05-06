package nelio_aulas.arraysList.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
     
        /* Fazer um programa para ler um numero inteiro N e os dados (nome e preço) de n 
        produtos. Armazene o n pordutos em um vetor. Em seguida, mostre o preço médio do produtos
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade do produto? ");
        int n = sc.nextInt();
        //indica que é um vetor (o meu n precisou importar)
        Produto[] vector = new Produto[n];

        //precisa instanciar o produto para que ele fique na posição correta do vetor
       
            //for do num de vetor
            /*  vector.length eh a quantidade de elementos do vetor, por isso da pra usar
            tanto ele quanto o n (o nome da variavel q armazena a quantidade de produtos)*/
            for(int i = 0; i < vector.length; i++) {
                sc.nextLine();
                System.out.println("Digite o nome do produto: ");
                String nominho = sc.nextLine();
                System.out.println("Digite o valor do produto: ");
                double precinho = sc.nextDouble(); 

                /*instancar um novo produto com os nomes acima e fazer com que a posição i do vetor
                esse novo produto*/
                // instanciar um new produto e vect na posiçao i vai apontar para o objeto:
                vector[i] = new Produto(nominho, precinho);
            }
       

        // média dos preços
        double soma = 0.0;
        for(int i = 0; i < vector.length; i++) {
            /* está acessando o vetor na posição i, querendo pegar somente o precinho, 
            usando get.precinho|| fazendo a soma de todo mundo*/
            soma += vector[i].getPrecinho();    
        }

        // média
        double mediazinha = soma / n;
        System.out.printf("AVG PRICE = %.2f%n", mediazinha);
       
            
        sc.close();
    }
}
