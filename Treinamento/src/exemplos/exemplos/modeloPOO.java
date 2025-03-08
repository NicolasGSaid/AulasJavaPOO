package exemplos;


import java.util.Scanner;


 //1 PASSO - DECLARAR A CLASSE
public class modeloPOO {

    //SEGUNDO PASSO - DECLARAR OS ATRIBUTOS

    String nome;

    //TERCEIRO PASSO - IMPLEMENTAR O METODO ENTRAR()

    public void entrar(){
        try (Scanner leia = new Scanner(System.in)) {
            System.out.printf("Nome....: ");
            nome = leia.nextLine();
        }


    }

    //QUARTO PASSO - IMPLEMENTAR O METODO CALCULAR() (PROCESSAR)

    public void calculcular(){


    }

    //QUINTO PASSO - IMPLEMENTAR O METODO IMPRIMIR()

    public void imprimir(){
        System.out.println("Nome....: "+nome);

    }

    //SEXTO PASSO - IMPLEMENTAR O METODO MAIN()


    public static void main(String[] args) {

        //6.1 instanciar objeto da classe

        modeloPOO obj = new modeloPOO();

        //6.2 excutar metodo entrar 

        obj.entrar();

        //6.3 executar metodo calcular

        obj.calculcular();

        //6.4 executar metodo imprimir 

        obj.imprimir(); 
    }  
}
