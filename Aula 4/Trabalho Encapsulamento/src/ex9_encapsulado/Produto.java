package ex9_encapsulado;

public class Produto {
    public static void main(String[] args) {
        Produto produto = new Produto("Feijão", 19.50, 100);

        produto.exibirInformacoes();

        produto.aumentarEstoque(50);
        System.out.println("Estoque após aumento: " + produto.getQuantidadeEstoque());

        produto.diminuirEstoque(30);
        System.out.println("Estoque após diminuição: " + produto.getQuantidadeEstoque());
    }

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        } else {
            System.out.println("Quantidade inválida para aumentar o estoque.");
        }
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Quantidade inválida para diminuir o estoque.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em Estoque: " + this.quantidadeEstoque);
    }
}
