package ex10_encapsulado;

public class Veiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("SUV", "AAA333", "Prata");

        System.out.println("Tipo: " + veiculo.getTipo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());

        veiculo.abastecer();
        veiculo.lavar();
    }

    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer() {
        System.out.println("O " + tipo + " está abastecendo...");
    }

    public void lavar() {
        System.out.println("O " + tipo + " está lavando...");
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }
}
