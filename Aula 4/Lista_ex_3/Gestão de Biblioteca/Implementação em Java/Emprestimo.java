public class Emprestimo {
    private Livro livro;
    private Leitor leitor;
    private int dataEmprestimo;
    private int dataDevolucao;

    public Emprestimo(Livro livro, Leitor leitor, int dataEmprestimo, int dataDevolucao) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public int getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(int dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void realizarEmprestimo() {
        if (livro.verificarDisponibilidade()) {
            livro.setQuantidadeEstoque(livro.getQuantidadeEstoque() - 1);
            System.out.println("Empréstimo realizado com sucesso para o livro: " + livro.getTitulo());
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void realizarDevolucao() {
        livro.setQuantidadeEstoque(livro.getQuantidadeEstoque() + 1);
        System.out.println("Devolução realizada com sucesso para o livro: " + livro.getTitulo());
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", leitor=" + leitor +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}