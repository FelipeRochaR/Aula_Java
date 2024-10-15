public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Maurício de Sousa", "Português");

        Livro livro1 = new Livro("Turma da Mônica", "Maurício de Sousa", 123456789, 5);

        Leitor leitor1 = new Leitor("Felipe", 20231001, 20000115);

        Emprestimo emprestimo1 = new Emprestimo(livro1, leitor1, 20231001, 20231015);

        emprestimo1.realizarEmprestimo();

        System.out.println(emprestimo1);

        emprestimo1.realizarDevolucao();
    }
}
