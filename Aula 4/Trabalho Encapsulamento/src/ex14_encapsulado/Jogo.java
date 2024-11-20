package ex14_encapsulado;

public class Jogo {
    public static void main(String[] args) {
        Jogo meujogo = new Jogo("GTA", "Ação", 100);

        System.out.println("Nome do jogo: " + meujogo.getNome());
        System.out.println("Gênero do jogo: " + meujogo.getGenero());
        System.out.println("Preço do jogo: R$ " + meujogo.getPreco());

        meujogo.iniciar();
        meujogo.pausar();
    }

    private String nome;
    private String genero;
    private double preco;

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

    public void iniciar() {
        System.out.println("O jogo " + getNome() + " iniciou...");
    }

    public void pausar() {
        System.out.println("O jogo " + getNome() + " está pausado...");
    }
}
