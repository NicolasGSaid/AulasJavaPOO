import java.lang.reflect.Method;

@SuppressWarnings("all")

public class Caneta {

    public String modelo, cor;
    private float ponta;
    protected int carga;
    protected boolean tampada = true;

    public String getModelo() {
        return modelo;
    }

    public void status() {
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

    public void escrever() {
        if (this.tampada == true) {
            System.out.println("Erro, Caneta tampada");
        } else {
            System.out.println("Escreve, Escreve, Escreve...");
        }
    }

    private void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro, Caneta tampada");
        } else {
            System.out.println("Rabisca, Rabisca, Rabisca...");
        }

    }

    protected void tampar() {
        this.tampada = true;

    }

    protected void destampar() {
        this.tampada = false;
    }
}
