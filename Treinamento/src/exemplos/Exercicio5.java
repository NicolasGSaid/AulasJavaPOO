//Calculadora de média aritmética sob o contexto de notas de alunos

package exemplos;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a primeira Nota: ");
        float nota1 = input.nextFloat();

        System.out.printf("Digite a segunda nota: ");
        float nota2 = input.nextFloat();

        System.out.printf("Digite a terceira nota: ");
        float nota3 = input.nextFloat();

        System.out.printf("Digite a quarta nota: ");
        float nota4 = input.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if  (media >= 28) 
            
            {System.out.println("Sua média foi "+ media + " Aprovado!");}
        else
            {System.out.println("Sua média foi "+ media +" Reprovado...");}


        }
    }

