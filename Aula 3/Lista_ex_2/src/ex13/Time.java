/* Defina uma classe Time com atributos como nome, tecnico, e numeroDeJogadores.
 * Adicione métodos para adicionar e remover jogadores.
 */

package ex13;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Time meutime = new Time("São Paulo Futebol Clube", "Rogério Ceni", 24);

        System.out.println("Nome do time: " + meutime.getNome());
        System.out.println("Técnico do time: " + meutime.getTecnico());
        System.out.println("Número de Jogadores: " + meutime.getNumJogadores());

        meutime.remove();
        meutime.adicionar();
    }

    public String nome;
    public String tecnico;
    public int numJogadores;

    public Time(String nome, String tecnico, int numJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numJogadores = numJogadores;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getNumJogadores() {
        return numJogadores;
    }

    public void remove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de jogadores para remover do time: ");
        int valor = scanner.nextInt();
        numJogadores -= valor;
        System.out.println(valor + " Jogadores foram removidos. Nova quantidade de jogadores: " + this.numJogadores);
    }

    public void adicionar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos jogadores quer adicionar no time: ");
        int valor = scanner.nextInt();
        numJogadores += valor;
        System.out.println(valor + " Jogadores foram adicionados. Nova quantidade de jogadores: " + this.numJogadores);
    }
}
