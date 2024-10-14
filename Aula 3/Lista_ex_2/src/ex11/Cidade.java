/* Crie uma classe Cidade com atributos nome, populacao, e estado.
 * Adicione métodos para aumentar e diminuir a população.
 */

package ex11;

import java.util.Scanner;

public class Cidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Palotina", 40000, "Paraná");

        System.out.println("Nome da Cidade: " + cidade.getNome());
        System.out.println("População: " + cidade.getPopulacao());
        System.out.println("Estado: " + cidade.getEstado());

        cidade.aumentar();
        cidade.diminuir();
    }

    public String nome;
    public int populacao;
    public String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void aumentar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor para aumentar a população: ");
        int valor = scanner.nextInt();
        this.populacao += valor;
        System.out.println("População aumentada em " + valor + ". Nova população: " + this.populacao);
    }

    public void diminuir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor para diminuir a população: ");
        int valor = scanner.nextInt();
        this.populacao -= valor;
        System.out.println("População diminuido em " + valor + ". Nova população: " + this.populacao);
    }
}
