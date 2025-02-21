package exemplos;

import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ra, nome, curso, disciplina;
        int nFaltas1, nFaltas2, nFaltas3, nFaltas4, FaltasTotal;

        System.out.printf("Digite seu RA: ");
        ra = input.nextLine();
        System.out.printf("Digite seu nome: ");
        nome = input.nextLine();
        System.out.printf("Digite seu curso: ");
        curso = input.nextLine();
        System.out.printf("Digite a disciplina: ");
        disciplina = input.nextLine();

        System.out.printf("Digite o número de faltas no Primeiro bimestre: ");
        nFaltas1 = input.nextInt();
        while (nFaltas1 < 0 || nFaltas1 > 8){
            System.out.printf("Número de faltas inválido, Redigite (0 - 8): ");
            nFaltas1 =input.nextInt();
        }
        System.out.printf("Digite o número de faltas no Segundo bimestre: ");
        nFaltas2 = input.nextInt();
        while (nFaltas2 < 0 || nFaltas2 > 8){
            System.out.printf("Número de faltas inválido, Redigite (0 - 8): ");
            nFaltas2 =input.nextInt();
        }
        System.out.printf("Digite o número de faltas no Terceiro bimestre: ");
        nFaltas3 = input.nextInt();
        while (nFaltas3 < 0 || nFaltas3 > 8){
            System.out.printf("Número de faltas inválido, Redigite (0 - 8): ");
            nFaltas3 =input.nextInt();
        }
        System.out.printf("Digite o número de faltas no Quarto bimestre: ");
        nFaltas4 = input.nextInt();
        while (nFaltas4 < 0 || nFaltas4 > 8){
            System.out.printf("Número de faltas inválido, Redigite (0 - 8): ");
            nFaltas4 =input.nextInt();
        }

        FaltasTotal = nFaltas1 + nFaltas2 + nFaltas3 + nFaltas4;

        if (FaltasTotal == 0)
        {System.out.println("Aluno com frenquencia maxima, "+FaltasTotal+" Faltas");}
        if (FaltasTotal > 0 && FaltasTotal <= 4)
        {System.out.println("Aluno com frequencia boa, "+FaltasTotal+" Faltas");}
        if (FaltasTotal > 4 && FaltasTotal <= 8)
        {System.out.println("Aluno com frequencia regular,"+FaltasTotal+" Faltas");}
        if (FaltasTotal > 8 && FaltasTotal <=12)
        {System.out.println("Aluno com frequencia média,"+FaltasTotal+" Faltas");}
        if (FaltasTotal > 12 && FaltasTotal <=16)
        {System.out.println("Aluno com frequencia ruim,"+FaltasTotal+" Faltas");}
        if (FaltasTotal > 16 && FaltasTotal <=20)
        {System.out.println("Aluno com frequencia péssima,"+FaltasTotal+" Faltas");}
        if (FaltasTotal > 20)
        {System.out.println("Aluno sem presença,"+FaltasTotal+" Faltas");}
    }    
}
