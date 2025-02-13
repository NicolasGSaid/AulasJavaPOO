
package exemplos;

import java.util.Scanner;

public class Exercício3 {
    
    public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);
    
    //Solicitando dados do usuário
    System.out.printf("Digite seu nome:");
    String nome = input.next();
    
    System.out.printf("Digite sua idade: ");
    int idade = input.nextInt();
    
    //Criando Objeto da classe Aluno
    Aluno aluno1 = new Aluno(nome, idade);
    
    //Exibindo os dados
    aluno1.exibirInformacoes();
    
    input.close();
    
    }   
}

//Definindo classe Aluno

class Aluno {
    
    String nome;
    int idade;
    
    //Construtor que inicializa os atributos
    public Aluno(String nome, int idade){
    
        this.nome = nome;
        this.idade = idade;
        
    }
    
    //Metodo para exibir informaçoes
    public void exibirInformacoes() {
    
    System.out.println("Nome: " + nome + " Idade: " + idade);
 
    }
}