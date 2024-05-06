package nelio_aulas.orientacao_a_objeto.dadosClass;

import java.util.Locale;
import java.util.Scanner;


public class Dados {
    public static void main(String[] args) {
        /* fazer um programa para ler os dados de um produto em estoque(nome, preço e qntd de estoque) em seguida:
         * 
         * - mostrar os dados do produto (nome, preço, qntd de estoque, valor total no estoque)
         * - relizar uma entrada no estoque e mostrar novamente os dados do produto
         * - realizar uma aída no estoque e mostrar novamente os dados do produto
         * 
        */

        Locale.setDefault(Locale.US);

        // ler os dados do produto:

        Scanner sc = new Scanner(System.in);

        // precisa instanciar a classe (NUNCA ESQUECER)

        Product product = new Product(null, 0);

        System.out.println("Enter product data: ");
        
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print(" Quantity in stock: ");
        product.quantity = sc.nextInt();

        
        // toString() serve para converter objetos em string

        System.out.println();
        // mostrar dados do produto em estoque

        System.out.println("Product data: " + (product));

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: " );
        int quantity = sc.nextInt(); 
        product.addProducts(quantity); // parametro quantity pq qnd digitar o num ele vai atualizar a quantidadedentro do objeto product

        System.out.println();
        System.out.println("Product data: " + (product));

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: " );
        quantity = sc.nextInt();
        product.removeProducts(quantity);// chamou o metodo

        System.out.println();
        System.out.println("Product data: " + (product));
    
        sc.close();







    }
}
