/* Implemente uma classe Cozinha com atributos tipo, quantidadePessoas, e cor.
 * Adicione métodos para cozinhar e limpar.
 */

package ex19;

public class Cozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Restaurante", 100, "Rosa");

        System.out.println("Tipo: " + cozinha.getTipo());
        System.out.println("Quantidade de pessoas: " + cozinha.getQntdPessoas());
        System.out.println("Cor: " + cozinha.getCor());

        cozinha.cozinhar();
        cozinha.limpar();
    }

    public String tipo;
    public int qntdPessoas;
    public String cor;

    public Cozinha(String tipo, int qntdPessoas, String cor) {
        this.tipo = tipo;
        this.qntdPessoas = qntdPessoas;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQntdPessoas() {
        return qntdPessoas;
    }

    public String getCor() {
        return cor;
    }

    public void cozinhar(){
        System.out.println("Estão cozinhando...");
    }

    public void limpar(){
        System.out.println("Estão limpando a cozinha...");
    }
}
