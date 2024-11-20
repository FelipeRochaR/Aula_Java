package ex1_encapsulado;

public class main {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("Harry Potter e a pedra filosofal", "J K Rowling", 208);

        System.out.println("Título: " + meuLivro.getTitulo());
        System.out.println("Autor: " + meuLivro.getAutor());
        System.out.println("Número de Páginas: " + meuLivro.getNumeroDePaginas());

        meuLivro.abrir();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
    }
}