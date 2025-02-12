package exemplos;

public class Exercício2 {
    
    public static void main(String[] args){
        
        /** Declaração de variáveis **/
        double salario = 678;
        double adiantamento = 120.00;
        double inss = 0.11;
        double fgts = 0.08;
        double valfgts;
        double liquido;
        double proporcional;
        int diastrabalhados = 18;
        int horasmensais = 160;
        int horasdiarias = 8;
        
        /** Cálculo do salário proporcional e liquido**/
        proporcional = (salario / horasmensais) * (diastrabalhados * horasdiarias);
        valfgts = proporcional * fgts;
        liquido = proporcional - (proporcional * inss) - adiantamento;
        
        /** Impressão das variáveis **/
        System.out.println("Salário mensal....: " + salario);
        System.out.println("Dias trabalhados....: " + diastrabalhados);
        System.out.println("Horas mensais....: " + horasmensais);
        System.out.println("Horas diárias....: " + horasdiarias);
        System.out.println("Valor do FGTS....: " + String.format("%.2f\n", valfgts));
        System.out.println("Salário sem descontos....: " + String.format("%.2f\n", proporcional));
        System.out.println("Salário líquido....: " + String.format("%.2f\n", liquido));
        
    }
}
