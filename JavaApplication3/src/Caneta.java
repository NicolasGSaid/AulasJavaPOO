public class Caneta {

    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada = true;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        if (tampada == true) {
            System.out.println("Está tampada?: Sim!");
        }

        else {
            System.out.println("Está tampada?: Não! ");
        }
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro, Caneta tampada");
        } else {
            System.out.println("Rabisca, Rabisca, Rabisca...");
        }

    }

    void tampar() {
        this.tampada = true;

    }

    void destampar() {
        this.tampada = false;
    }
}
