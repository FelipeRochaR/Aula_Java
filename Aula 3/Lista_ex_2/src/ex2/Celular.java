/* Defina uma classe Celular com atributos como marca, modelo, e capacidadeBateria.
 * Adicione métodos para ligar e desligar o celular.
*/

package ex2;

public class Celular {
    public static void main(String[] args){
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

    public Celular(String marca, String modelo, int capacidadeBateria){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public void ligar(){
        System.out.println("O celular ligou...");
    }

    public void desligar(){
        System.out.println("O celular desligou...");
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getCapacidadeBateria(){
        return capacidadeBateria;
    }

}
