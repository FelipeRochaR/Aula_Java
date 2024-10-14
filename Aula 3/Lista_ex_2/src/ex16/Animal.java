/* Implemente uma classe Animal com atributos especie, idade, e peso.
 * Adicione métodos para alimentar e dormir.
 */

package ex16;

public class Animal {
    public static void main(String[] args) {
        Animal animal = new Animal("Leão", 15, "25Kg");

        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Peso: " + animal.getPeso());

        animal.alimentar();
        animal.dormir();
    }

    public String especie;
    public int idade;
    public String peso;

    public Animal(String especie, int idade, String peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public String getPeso() {
        return peso;
    }

    public void alimentar(){
        System.out.println("O " + getEspecie() + " está com fome. Alimente-o...");
    }

    public void dormir(){
        System.out.println("O " + getEspecie() + " está com sono. Deixe dormir...");
    }
}
