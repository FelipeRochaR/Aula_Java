package ex12_encapsulado;

public class Filme {
    public static void main(String[] args) {
        Filme meufilme = new Filme("Homem Aranha 7", "Marcio", "2 horas");

        System.out.println("Título: " + meufilme.getTitulo());
        System.out.println("Diretor: " + meufilme.getDiretor());
        System.out.println("Duração: " + meufilme.getDuracao());

        meufilme.iniciar();
        meufilme.parar();
    }

    private String titulo;
    private String diretor;
    private String duracao;

    public Filme(String titulo, String diretor, String duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void iniciar() {
        System.out.println("O Filme " + titulo + " começou...");
    }

    public void parar() {
        System.out.println("O Filme " + titulo + " parou restando 45 minutos para o fim...");
    }
}
