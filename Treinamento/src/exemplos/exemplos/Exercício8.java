package exemplos;

import java.util.Scanner;

public class Exercício8 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String ra, nome, curso, disciplina;
            double nota1, nota2, nota3, nota4;

            System.out.printf("Digite seu RA: ");
            ra = input.nextLine();
            System.out.printf("Digite seu nome: ");
            nome = input.nextLine();
            System.out.printf("Digite seu curso: ");
            curso = input.nextLine();
            System.out.printf("Digite a disciplina: ");
            disciplina = input.nextLine();

            System.out.printf("Digite a Prieira nota: ");
            nota1 = input.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.printf("Nota inválida, redigite a nota 1 (1 - 10): ");
                nota1 = input.nextDouble();
            }

            System.out.printf("Digite a Segunda nota: ");
            nota2 = input.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.printf("Nota inválida, redigite a nota 2 (1 - 10): ");
                nota2 = input.nextDouble();
            }

            System.out.printf("Digite a Terceira nota: ");
            nota3 = input.nextDouble();
            while (nota3 < 0 || nota3 > 10) {
                System.out.printf("Nota inválida, redigite a nota 3 (1 - 10): ");
                nota3 = input.nextDouble();
            }

            System.out.printf("Digite a Quarta nota: ");
            nota4 = input.nextDouble();
            while (nota4 < 0 || nota4 > 10) {
                System.out.printf("Nota inválida, redigite a nota 4 (1 - 10): ");
                nota4 = input.nextDouble();
            }

            System.out.println("\nDados Cadastrados:");
            System.out.println("RA: " + ra);
            System.out.println("Nome: " + nome);
            System.out.println("Curso: " + curso);
            System.out.println("Disciplina: " + disciplina);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Nota 3: " + nota3);
            System.out.println("Nota 4: " + nota4);

        }
    }
}
