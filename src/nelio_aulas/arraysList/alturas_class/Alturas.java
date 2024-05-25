package nelio_aulas.arraysList.alturas_class;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        /* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver. 
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n]; // n de pessoas dentro do array

        double totAltura = 0; // vai somar com todas as alturas
        int totIdade = 0;
        int valor = 0;
        double media = 0;
        double percentIdade = 0;
        for(int i = 0; i < n; i++) {
            valor = valor + 1;
            System.out.println("dados da " + valor + "a pessoa: ");
            Scanner scNome = new Scanner(System.in);
            System.out.println("nome: ");
            String nome = scNome.nextLine();
            // precisou criar um scanner pra cada tipo pq ele ta crachando meu programa
            Scanner scIdade = new Scanner(System.in);
            System.out.println("idade: ");
            int idade = scIdade.nextInt();
            Scanner scAltura = new Scanner(System.in);
            System.out.println("altura: ");
            double altura = scAltura.nextDouble();
            scNome.close();
            scIdade.close();
            scAltura.close();


            // inicializou a instancia da classe pessoa com parametros
            //Pessoa pessoa = new Pessoa(nome, idade, altura);
            /* inicializando pelo construtor padrao default */
            Pessoa p = new Pessoa();
            p.setNome(nome);
            p.setIdade(idade);
            p.setAltura(altura);
            /*armazena a pessoa criada nas linhas do for e inclui essa instancia
             da pessoa no array pessoas*/ //control k c cometa linha
            pessoas[i] = p;

            // += incrementa
            totAltura += altura; // em ordem, somando
          
            if(pessoas[i].getIdade() < 16) {
                totIdade++;
            }

        }

        media = totAltura / n;
        //media é igual o incremento da altura X100 dividido pelo total de elementos

        //percentIdade = (totIdade/ 100);
        // esse double serve pra forçar conversao
        percentIdade = ((double)totIdade / n) * 100.0;

        System.out.println("Altura média: " + media);
        System.out.println("Pessoas com menos de 16 anos: " + percentIdade + "%");
        

        //length att do array q contem qntte de itens do array
        for(int i = 0; i < pessoas.length; i++) {
            // capturando a instancia do objeto pessoa do idice atual do array de pessoas
            Pessoa pessoa = (Pessoa)pessoas[i];
            if(pessoa.getIdade() < 16) {
            // pessoas[i].getIdade() < 16) {

                // System.out.println(pessoas[i].getNome());
                System.out.println(pessoa.getNome());
            }
        }
        sc.close();
    }   
}
