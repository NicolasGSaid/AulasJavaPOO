// Exemplo de média aritmética usando switch/case

package exemplos;

import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Digite o código do aluno: ");
            String id = input.next();

            System.out.printf("Digite o nome do aluno: ");
            String nome = input.next();

            System.out.printf("Digite a primeira nota ");
            float n1 = input.nextFloat();
            while (n1 < 0 || n1 > 5) {
                System.out.println("Valor inválido, redigite a nota(0 - 5): ");
                n1 = input.nextFloat();
                }

            System.out.printf("Digite a segunda nota: ");
            float n2 = input.nextFloat();
            while (n2 < 0 || n2 > 5) {
                System.out.println("Valor inválido, redigite a nota(0 - 5): ");
                n2 = input.nextFloat();
                }
                
                System.out.printf("Digite a terceira nota: ");
                float n3 = input.nextFloat();
                while (n3 < 0 || n3 > 5) {
                    System.out.println("Valor inválido, redigite a nota(0 - 5): ");
                    n3 = input.nextFloat();
                }
                
                System.out.printf("Digite a quarta nota: ");
                float n4 = input.nextFloat();
                while (n4 < 0 || n4 > 5) {
                    System.out.println("Valor inválido, redigite a nota(0 - 5): ");
                    n4 = input.nextFloat();
                }

                float media = (n1 + n2 + n3 + n4) / 4;

                int mediaInteira = Math.round(media);

                switch (mediaInteira) {

                    case 0:
                        System.out.println("Aluno ID: " + id + ("\nNome: " + nome + "\nMédia 0 - PÉSSIMO"));
                        break;

                    case 1:
                        System.out.println("Aluno ID: " + id + ("\nNome: " + nome + "\nMédia 1 - RUIM"));

                        break;

                    case 2:
                        System.out.println("Aluno ID: " + id + ("\nNome: " + nome + "\nMédia 2 - REGULAR"));

                        break;

                    case 3:
                        System.out.println("Aluno ID: " + id + ("\nNome: " + nome + "\nMédia 3 - BOM"));

                        break;

                    case 4:
                        System.out.println("Aluno ID: " + id + ("\nNome: " + nome + "\nMédia 4 - ÓTIMO"));

                        break;

                    case 5:
                        System.out.println("Aluno ID: " + id + ("\nNome: " + nome + "\nMédia 5 - EXCELENTE"));

                        break;

                }
            }
        }
    }

