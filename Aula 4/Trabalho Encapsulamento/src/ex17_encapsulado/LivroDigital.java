package ex17_encapsulado;

public class LivroDigital {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Diário de um Banana", "Jeff Kinney", "125Gb");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Tamanho Arquivo: " + livro.getTamanhoArquivo());

        livro.abrir();
        livro.fechar();
    }

    private String titulo;
    private String autor;
    private String tamanhoArquivo;

    public LivroDigital(String titulo, String autor, String tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void abrir() {
        System.out.println("O livro " + getTitulo() + " está aberto...");
    }

    public void fechar() {
        System.out.println("O livro " + getTitulo() + " está fechado...");
    }
}
