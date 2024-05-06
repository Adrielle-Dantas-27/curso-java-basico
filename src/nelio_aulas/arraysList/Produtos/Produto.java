package nelio_aulas.arraysList.Produtos;

public class Produto {
    private String nominho;
    private double precinho;
    public Produto(String nominho, double precinho) {
        this.nominho = nominho;
        this.precinho = precinho;
    }
    public String getNominho() {
        return nominho;
    }
    public void setNominho(String nominho) {
        this.nominho = nominho;
    }
    public double getPrecinho() {
        return precinho;
    }
    public void setPrecinho(double precinho) {
        this.precinho = precinho;
    }



    
}
