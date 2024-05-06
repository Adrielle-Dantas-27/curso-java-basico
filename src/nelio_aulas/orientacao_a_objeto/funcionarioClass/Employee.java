package nelio_aulas.orientacao_a_objeto.funcionarioClass;

/**
 * employee
 */
public class Employee {
//atributos da classe employee
    public String name;
    public double salario;
    public double imposto;

public double descontoSalario() {
    return (salario - imposto);
}  

public void impostoSalario(double percent) {
    salario += salario * percent / 100;
}

public String toString() { // personalizado do jeito qeu eu quiser
    return name + ", $" + String.format("%.2f", descontoSalario());
}





    
}