package nelio_aulas.orientacao_a_objeto.dollarClass;

public class Converter {
    public double dollar;
    public double comp;



    public double vaiPagar(){
        return dollar * comp;
    }

    public double taxaTotal() {
        return vaiPagar() * 0.06;
    
    }


}
