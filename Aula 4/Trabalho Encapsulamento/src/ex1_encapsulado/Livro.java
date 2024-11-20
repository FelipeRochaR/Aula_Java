package ex1_encapsulado;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0;
    }

    public void abrir() {
        if (paginaAtual == 0) {
            paginaAtual = 1;
            System.out.println("O livro foi aberto na página 1.");
        } else {
            System.out.println("O livro já está aberto na página " + paginaAtual + ".");
        }
    }

    public void lerPagina() {
        if (paginaAtual > 0 && paginaAtual <= numeroDePaginas) {
            System.out.println("Lendo a página " + paginaAtual + "...");
            paginaAtual++;
        } else if (paginaAtual > numeroDePaginas) {
            System.out.println("Você já leu todas as páginas do livro.");
        } else {
            System.out.println("O livro está fechado. Abra o livro primeiro.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }
}
