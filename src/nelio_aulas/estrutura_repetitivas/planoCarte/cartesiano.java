    package nelio_aulas.estrutura_repetitivas.planoCarte;

    import java.util.Scanner;

    public class cartesiano {
    public static void main(String[] args) {
    /* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de 
    pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
    O algoritmo será encerrado quando pelo menos uma de duas coordenadas for
    NULA (nesta situação sem escrever mensagem alguma) */

    // OBS: da para fazer um if dentro do while
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um valor pra x: ");
        double x = sc.nextDouble();

        System.out.println("digite um valor pra y: ");
        double y = sc.nextDouble();

            char escolha = 0;
           
                while (x != 0 || y != 0 ) {

                    if (x > 0 && y > 0) {
                        System.out.println("primeiro");

                        for (;(escolha != 's') || (escolha == 'n');) {
                            System.out.println("deseja continuar? S/N");
                            escolha = sc.next().charAt(0);  
                        } 

                        System.out.println("digite um valor pra x: ");
                        x = sc.nextDouble();
                
                        System.out.println("digite um valor pra y: ");
                        y = sc.nextDouble();  
                        
                       
                    }    
                    
                    else if (x < 0 && y > 0) {
                        System.out.println("segundo");

                        for (;(escolha == 'n') || (escolha != 's');) {
                            System.out.println("deseja continuar? S/N");
                            escolha = sc.next().charAt(0);  
                        } 

                        System.out.println("digite um valor pra x: ");
                        x = sc.nextDouble();
                
                        System.out.println("digite um valor pra y: ");
                        y = sc.nextDouble();  
                        
                    
                    }     
                    else if (x < 0 && y < 0) {
                        System.out.println("terceiro");
                        for (;(escolha == 'n') || (escolha != 's');) {
                            System.out.println("deseja continuar? S/N");
                            escolha = sc.next().charAt(0);  
                        } 

                        System.out.println("digite um valor pra x: ");
                        x = sc.nextDouble();
                
                        System.out.println("digite um valor pra y: ");
                        y = sc.nextDouble();  

                    }     
                    else {
                        System.out.println("quarto");  
                        for (;(escolha != 's') || (escolha == 'n');) {
                            System.out.println("deseja continuar? S/N");
                            escolha = sc.next().charAt(0);  
                        } 

                        System.out.println("digite um valor pra x: ");
                        x = sc.nextDouble();
                
                        System.out.println("digite um valor pra y: ");
                        y = sc.nextDouble();  
                        
                    
                    }          
                }   
                sc.close();     
            }
    }

    // refazer essa parte do for pq eu acho que o probema esta no else, mas caso nao steja, pode ser porblema de sitaxe do for mesmo
    
