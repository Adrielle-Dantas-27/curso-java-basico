package nelio_aulas.arraysList.ex_fixacao;

public class Arrays {
    public static void main(String[] args) {

        // String[] nomes = new String[] {"adrielle", "adriano", "victor"};

        // System.out.println(nomes[2]);

        String[] nomes; // aqui estou declarando um array de string, mas nao o inicializei
        nomes = new String[3]; // aqui estou inicializando o array declarado na linha acima que deverá conter 3 Strings
        nomes[0] = "adrielle";
        nomes[1] = "adriano";
        nomes[2] = "victor";

        int[] num = new int[] {3, 9, 5};

        System.out.println(num[1]);
    }
}
