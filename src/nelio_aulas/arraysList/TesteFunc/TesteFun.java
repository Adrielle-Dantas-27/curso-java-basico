package nelio_aulas.arraysList.TesteFunc;

public class TesteFun {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Adrielle");
    
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Victor");
    
        //                                   TUDO NO JAVA EXTEND DE OBJETO, LOGO TUDO E OBJETO

        // funciona, pois funcionario extende de objeto (classe mae do java é um object)
        Object outroFuncionario = new Funcionario();

        // Funcionario[] funcionarios = new Funcionario[] {funcionario1, funcionario2};
       // criou um array de objetos
       // inicializou um array com esses objetos entre {}
        Object[] objetos = new Object[] {funcionario1, funcionario2,  1, true, "Abacaxi"}; // armazenar todo tipo
        int[] num = new int[]{1,2,3,4};// aceita dado especifico daquele tipo
        double[] notas = new double [] {10, 9.26, 6.5}; // aceita dado especifico daquele tipo
        boolean[] status = {true, false};// aceita dado especifico daquele tipo

       /*  for (Funcionario funcionario : funcionarios) { // foreach, sem indice
        
            System.out.println("Funcionario " + funcionario.getNome());
        }*/

        // para cada Object em arrays de funcionarios, coloca um por um dentro da variavel object.
        // dentro do for vc consegue pegar o valor que está na lista
        for (Object object : objetos) {
            if (object instanceof Funcionario) { 
                Funcionario funcionario = (Funcionario) object;
                System.out.println("Funcionario " + funcionario.getNome());
            } else if(object instanceof String) {
                String abacaxi = object.toString();
                System.out.println("elemento string: " + abacaxi);

            } else {
                System.out.println("demais valores: " + object.toString());
            }
        }
    }
    // criar um tipo novo, a classe. tipo é tudo ue voce cria e ele vai se transformar em um obj
    //geralment vai em outro arquivo .class, mas pode ir dentro do mesmo arquivo. n usa mt
    //classe filha é funcionario
    static class Funcionario extends Pessoa {
        
    
    
    }

    /**
     * InnerTesteFun
     */
    /* herança é herdar os atributos e métodos de um classe mae,
     passando pra classe filha*/
    // classe mae genérica || classe base
    static class Pessoa {
        private String nome;
        
        // void Funcionario(String nome) {
        //     this.nome = nome;
        // }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getNome() {
            return this.nome;
        }

        
    }
}
    // cast explicito professor professor2 = (Professor)professor;