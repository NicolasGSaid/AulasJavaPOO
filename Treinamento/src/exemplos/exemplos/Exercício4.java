//Sistema de cadastro de funcionário e calculo de INSS e IRRF

package exemplos;

import java.util.Scanner;

// Criando classe para funcionário
class Funcionario {
    
    // Pensando variaveis
    int id, quantDependentes;
    String nome, nomePai, nomeMae, telefone;
    double salarioBase, irrf, inss, salarioFamilia, valeTransporte, assitMedica = 300.50;
    
    // Construindo as variaveis     
    public Funcionario(String nome, String nomePai, String nomeMae, String telefone,        
                   int quantDependentes, double salarioBase, double irrf, int id,
                   double salarioFamilia, double inss, double valeTransporte, double assitMedica){
    
        this.nome = nome;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.id = id;
        this.telefone = telefone;
        this.quantDependentes = quantDependentes;
        this.salarioBase = salarioBase;
        this.irrf = irrf;
        this.salarioFamilia = salarioFamilia;
        this.inss = inss;
        this.valeTransporte = valeTransporte;
        this.assitMedica = assitMedica;
    }
    
    public double calcularINSS() {
          
        if (salarioBase < 1412.00) 
            {inss = salarioBase * 0.0; } // sem descontos de INSS
        
         else if (salarioBase >= 1412.01 && salarioBase <= 2666.68) 
            {inss = salarioBase * 0.09;} // 9% de INSS
         
         else if (salarioBase >= 2666.69 && salarioBase <= 4000.00) 
            {inss = salarioBase * 0.12;} // 12% de INSS
         
         else 
            {inss = salarioBase * 0.14;} // 14% de INSS
        
        return inss; 
    }
    
    public double calcularIRRF() {
               
         if (salarioBase >= 2259.21 && salarioBase <= 2826.65) 
            {irrf = salarioBase * 0.075;} // 7,5% IRRF
         
         else if (salarioBase >= 2826.66 && salarioBase <= 3751.05) 
            {irrf = salarioBase * 0.15;} // 12% de IRRF
         
         else if (salarioBase >= 3751.06 && salarioBase <= 4664.68) 
            {irrf = salarioBase * 0.225;} // 22,5% de IRRF
         
         else 
            {irrf = salarioBase * 0.275;} // 27,5% de INSS
        
        return irrf; 
    }
    
    public double calcularFamilia() {
        double valorDependente = 127.90;
        double valorDepTot = quantDependentes * valorDependente;
        return valorDepTot;          
    }
}

public class Exercício4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Tipo String
            System.out.printf("Digite seu nome:");
            String nome = input.next();
            System.out.printf("Digite o nome da sua mãe: ");
            String nomeMae = input.next();
            System.out.printf("Digite o nome do seu pai: ");
            String nomePai = input.next();
            input.nextLine(); // Consome o espaço de linha
            System.out.printf("Informe o número do seu telefone: ");
            String telefone = input.nextLine();

            // Tipo int
            System.out.printf("Digite o seu ID: ");
            int id = input.nextInt();
            System.out.printf("Informe a quantidade de seus dependentes: ");
            int quantDependentes = input.nextInt();

            // Tipo Double
            System.out.printf("Informe seu salário base: ");
            double salarioBase = input.nextDouble();

            // Cria um objeto para o funcionário
            Funcionario funcionario1 = new Funcionario(nome, nomePai, nomeMae, telefone, quantDependentes, salarioBase, 0.0, id, 0.0, 0.0, 0.0, 300.50);
            System.out.println();      

            // Chama o método calcularINSS e imprime o resultado
            double inss = funcionario1.calcularINSS();
            System.out.printf("O valor do INSS a ser descontado é: %.2f\n", inss);

            // Chama o método calcularIRRF e imprime o resultado
            double irrf = funcionario1.calcularIRRF();
            System.out.printf("O valor do IRRF a ser declarado é: %.2f\n", irrf);

            // Chama o método Calcular Familia e imprime o resultado
            double valorFamilia = funcionario1.calcularFamilia();
            System.out.printf("O valor a ser adicionado pelo Salário família é: %.2f\n", valorFamilia);

            // Agora imprime o salário bruto corretamente
            System.out.printf("Funcionário ID: " + id +"\nNome: " + nome +"\nSeu salario base é: "+ salarioBase + 
            "\nSeu salário bruto é: R$ %.2f\n", salarioBase + valorFamilia);

            // Calculando o salário líquido
            double salarioLiquido = salarioBase + valorFamilia - inss;
            System.out.printf("Deduzindo os descontos, fica: R$ %.2f\n", salarioLiquido);
        }
    }
}