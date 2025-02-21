// Tabuadas utilizando "While" e "for" 

package exemplos;

import java.util.Scanner;

public class Exercício7 {

    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Digite um número para receber sua taboada: ");
        int numero = input.nextInt();
        int multiplicador = 0;
        System.out.println("Exemplo utilizando (While)");
       

        while (true){
            multiplicador ++;
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));

            if (multiplicador == 10)
            { break; }
        }

        System.out.println("Exemplo utilizando (For)");
      
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
