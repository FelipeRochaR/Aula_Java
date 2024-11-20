package ex18_encapsulado;

public class Bicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Totem", "100", "X");
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Tamanho da Roda: " + bicicleta.getTamanhoRoda());
        System.out.println("Modelo: " + bicicleta.getModelo());

        bicicleta.pedalar();
        bicicleta.freiar();
    }

    private String marca;
    private String modelo;
    private String tamanhoRoda;

    public Bicicleta(String marca, String tamanhoRoda, String modelo) {
        this.marca = marca;
        this.tamanhoRoda = tamanhoRoda;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Pedalando a bicicleta...");
    }

    public void freiar() {
        System.out.println("Freiou a bicicleta...");
    }
}
