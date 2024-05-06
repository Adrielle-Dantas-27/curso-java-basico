package nelio_aulas.orientacao_a_objeto.retanguloClass;

public class Rectangle {
    //acessibilidade + dado primitivo + nome
    public double height; // n podem ser estaticos
    public double width;

    //método de calcular area
    public double area() {
        return  width * height;
    }


    //método de calcular o perimetro
    public double perimetro(){
        return 2 * (width + height);
    }

    //método de calcular o diagonal
   public double diagonal () {
     return Math.sqrt(width * width + height * height);
    // o de baixo era o jeito q estava dando errado
    //return diagonal = Math.sqrt(width) + Math.sqrt(height);
   }
    

   
}
