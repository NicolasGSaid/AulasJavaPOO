// Exemplo de média aritmética usando switch/case

package exemplos;

import java.util.Scanner;

public class Exercício6 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in); 

        System.out.printf("Digite o código do aluno: ");
        String id = input.next();
        
        System.out.printf("Digite o nome do aluno: ");
        String nome = input.next();

        System.out.printf("Digite a primeira nota ");
        float n1 = input.nextFloat();

        System.out.printf("Digite a segunda nota: ");
        float n2 =input.nextFloat();

        System.out.printf("Digite a terceira nota: ");
        float n3 = input.nextFloat();

        System.out.printf("Digite a quarta nota: ");
        float n4 = input.nextFloat();

        float media = (n1 + n2 + n3 + n4) / 4;

        int mediaInteira = Math.round(media);

        switch (mediaInteira) {

            case 0:
                System.out.println("Aluno ID: "+id+("\nNome: "+nome+"\nNota 0 - PÉSSIMO"));
                break;
            
            case 1:
                System.out.println("Aluno ID: "+id+("\nNome: "+nome+"\nNota 1 - RUIM"));

                break;
            
            case 2:
                System.out.println("Aluno ID: "+id+("\nNome: "+nome+"\nNota 2 - REGULAR"));

                break;

            case 3:
                System.out.println("Aluno ID: "+id+("\nNome: "+nome+"\nNota 3 - BOM"));

                break;

            case 4: 
                System.out.println("Aluno ID: "+id+("\nNome: "+nome+"\nNota 4 - ÓTIMO"));

                break;

            case 5:
                System.out.println("Aluno ID: "+id+("\nNome: "+nome+"\nNota 5 - EXCELENTE"));

                break;
        
            default:
            
                System.out.println("Não adianta tentar roubar amigo, a nota máxima era 5 em todos os testes, e mesmo que voce mereça, eu não dou notas negativas...");
                break;
        }
    }
}
