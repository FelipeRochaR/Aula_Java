/* Crie uma classe Jogo com atributos nome, genero, e preco.
 * Adicione métodos para iniciar e pausar o jogo.
 */

package ex14;

public class Jogo {
    public static void main(String[] args) {
        Jogo meujogo = new Jogo("GTA", "ação", 100);

        System.out.println("Nome do jogo: " + meujogo.getNome());
        System.out.println("Gênero do jogo: " + meujogo.getGenero());
        System.out.println("Preço do jogo: " + meujogo.getPreco());

        meujogo.iniciar();
        meujogo.pausar();
    }

    public String nome;
    public String genero;
    public double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public void iniciar(){
        System.out.println("O " + getNome() + " iniciou...");
    }

    public void pausar(){
        System.out.println("O " + getNome() + " está pausado...");
    }
}
