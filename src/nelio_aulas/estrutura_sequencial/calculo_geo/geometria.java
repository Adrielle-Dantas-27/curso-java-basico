package nelio_aulas.estrutura_sequencial.calculo_geo;

import java.util.Scanner;
public class geometria {
  public static void main(String[] args) {
    /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor para a letra A: ");
    double a = sc.nextDouble();
    System.out.println("Digite um valor para a letra B: ");
    double b = sc.nextDouble();
    System.out.println("Digite um valor para a letra C: ");
    double c = sc.nextDouble();

    // A) a área do triângulo retângulo que tem A por base e C por altura. 

    double areaTriangulo = (a * c) / 2;
    System.out.printf("A area do triangulo é: %.3f %n", areaTriangulo);

    // B) a área do círculo de raio C. (pi = 3.14159) 

    double pi = 3.14159;
    double areaCirculo = pi * (c * c);
    System.out.printf("A area do circulo é: %.3f %n", areaCirculo);

    // C) a área do trapézio que tem A e B por bases e C por altura. 

    double areaTrapezio  = ((a + b) / 2) * c ;
    System.out.printf("A area do trapézio é: %.3f %n", areaTrapezio);

    // D) a área do quadrado que tem lado B. 

    double areaQuadrado = b * b;
    System.out.printf("A area do quadrado é: %.3f %n", areaQuadrado);

    // D) a área do retângulo que tem lados A e B

    double areaRetangulo = a * b;
    System.out.printf("A area do retangulo é: %.3f %n", areaRetangulo);

    sc.close();

  }

 
}