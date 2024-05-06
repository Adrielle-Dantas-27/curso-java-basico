package nelio_aulas.orientacao_a_objeto.dadosClass;

public class Product {
    public String name;
    public double price;
    public int quantity;


    public Product(String name2, double price2) {
        //TODO Auto-generated constructor stub
    }


    // multiplicar o preço com a qntde no estoque
    public double totalValueInStock() {
        return price * quantity;
    }


    // alterar o valor de quantity
    public void addProducts(int quantity){ // quantity ta ambiguo, logo vai usar o this
        // o this é uma auto referencia para o objeto
        this.quantity += quantity; //(atributo da classe) || o segundo quntity é o argumento da classe
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() { // meu toSring personalizado
        return name
        + ", $"
        + String.format("%2.f", price)// para deixar o price com 2 casas dps da virgula
        + ", "
        + quantity
        + " units, Totral: $"
        + String.format("%2.f", totalValueInStock());

    }

}