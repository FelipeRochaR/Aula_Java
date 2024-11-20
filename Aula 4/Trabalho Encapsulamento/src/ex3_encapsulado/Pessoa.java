package ex3_encapsulado;

public class Pessoa {
    public static void main(String[] args) {
        Pessoa minhaPessoa = new Pessoa("Felipe", 18, 183);

        System.out.println("Nome: " + minhaPessoa.getNome());
        System.out.println("Idade: " + minhaPessoa.getIdade());
        System.out.println("Altura: " + minhaPessoa.getAltura());

        minhaPessoa.apresentacao();
    }

    private String nome;
    private int idade;
    private int altura;

    public Pessoa(String nome, int idade, int altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentacao(){
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos e " + altura + " de altura");
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public int getAltura(){
        return altura;
    }
}
