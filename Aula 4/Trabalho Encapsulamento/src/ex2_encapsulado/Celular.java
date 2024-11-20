package ex2_encapsulado;
/* Defina uma classe Celular com atributos como marca, modelo, e capacidadeBateria.
 * Adicione métodos para ligar e desligar o celular.
 */

public class Celular {
    public static void main(String[] args) {
        Celular meuCelular = new Celular("Iphone", "14 Pro Max", 80);

        System.out.println("Marca: " + meuCelular.getMarca());
        System.out.println("Modelo: " + meuCelular.getModelo());
        System.out.println("Capacidade da Bateria: " + meuCelular.getCapacidadeBateria());

        meuCelular.ligar();
        meuCelular.desligar();
    }

    private String marca;
    private String modelo;
    private int capacidadeBateria;

    // Construtor
    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    // Método para ligar o celular
    public void ligar() {
        System.out.println("O celular ligou...");
    }

    // Método para desligar o celular
    public void desligar() {
        System.out.println("O celular desligou...");
    }

    // Métodos getter para acessar os atributos privados
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    // Métodos setter, caso seja necessário modificar os atributos no futuro
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }
}
