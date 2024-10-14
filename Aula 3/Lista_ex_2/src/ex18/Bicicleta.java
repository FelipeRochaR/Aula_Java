/* Crie uma classe Bicicleta com atributos marca, modelo, e tamanhoRoda.
 * Adicione métodos para pedalar e frear.
 */

package ex18;

public class Bicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Totem", "100", "X");
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Tamanho da Roda: " + bicicleta.getTamanhoRoda());
        System.out.println("Modelo: " + bicicleta.getModelo());

        bicicleta.pedalar();
        bicicleta.freiar();
    }

    public String marca;
    public String modelo;
    public String tamanhoRoda;

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

    public void pedalar(){
        System.out.println("Pedalando a bicileta...");
    }

    public void freiar(){
        System.out.println("Freiou a bicicleta...");
    }
}
