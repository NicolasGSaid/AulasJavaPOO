public class CanetaEX {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.modelo = "Felca";

        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println(); //Place Holder

        c2.destampar();
        c2.status();
        c2.rabiscar();

    }      
}
