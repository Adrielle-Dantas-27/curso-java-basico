package nelio_aulas.arraysList.alturas_class;

public class Pessoa {
    // atributo
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa() {
        
    }
 // get e set : encapsulamento 
    public String getNome() {
        return nome;
    }

    // obtem o parametro de qm chamou
    public void setNome(String nome) {
        /*obtem o parametro enviado de qm chamou 
        e atribui o valor no aributo nome da class pessoa*/
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


   
    
    
    
    
  


    
   

    
}
