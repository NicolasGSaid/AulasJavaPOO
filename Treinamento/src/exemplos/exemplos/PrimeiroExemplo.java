package exemplos;

public class PrimeiroExemplo {
    public static void main(String[] args){
        
        /** Declaração de variáveis **/
        double salario = 678;
        int diastrabalhados =18;
        int horasmensais = 160;
        int horasdiarias = 8;
        double liquido;
        
        /** Cálculo do salário líquido **/
        liquido = (salario / horasmensais) * (diastrabalhados * horasdiarias);
        
        /** Impressão das variáveis **/
        System.out.println("Salário mensal....: " + salario);
        System.out.println("Dias trabalhados....: " + diastrabalhados);
        System.out.println("Horas mensais....: " + horasmensais);
        System.out.println("Horas diárias....: " + horasdiarias);
        System.out.println("Salário líquido....: " + liquido);
        
    }
}
