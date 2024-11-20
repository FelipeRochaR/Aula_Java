package ex15_encapsulado;

public class Loja {
    public static void main(String[] args) {
        Loja loja = new Loja("Nike", "Rua 1 de Junho", 44998877);

        System.out.println("Nome: " + loja.getNome());
        System.out.println("Endereço: " + loja.getEndereco());
        System.out.println("Telefone: " + loja.getTelefone());

        loja.abrir();
        loja.fechar();
    }

    private String nome;
    private String endereco;
    private int telefone;

    public Loja(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void abrir() {
        System.out.println("A loja " + getNome() + " está aberta...");
    }

    public void fechar() {
        System.out.println("A loja " + getNome() + " está fechada...");
    }
}
