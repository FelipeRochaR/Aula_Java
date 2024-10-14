/* Crie uma classe Loja com atributos nome, endereco, e telefone.
 * Adicione métodos para abrir e fechar a loja.
 */

package ex15;

public class Loja {
    public static void main(String[] args) {
        Loja loja = new Loja("Nike", "Rua 1 de Junho", 44998877);

        System.out.println("Nome: " + loja.getNome());
        System.out.println("Endereço: " + loja.getEndereco());
        System.out.println("Telefone: " + loja.getTelefone());

        loja.abrir();
        loja.fechar();
    }

    public String nome;
    public String endereco;
    public int telefone;

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

    public void abrir(){
        System.out.println("A " + getNome() + " está aberta...");
    }

    public void fechar(){
        System.out.println("A " + getNome() + " está fechada...");
    }
}
