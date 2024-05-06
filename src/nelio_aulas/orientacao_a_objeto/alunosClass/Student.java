package nelio_aulas.orientacao_a_objeto.alunosClass;

/**
 * Student
 */
public class Student {
    public String name;
    public double notaUm;
    public double notaDois;
    public double notaTres;

    public double totalNota() {
        return notaUm + notaDois + notaTres;
    }

    public double qntFalta() {
        double total = 0;
        if(totalNota() < 60) {
            total = 60 - totalNota();
        }
    return total;
    } 



    
}