package ex5_encapsulado;

public class Cachorro {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Fofinho", "Pitbull", 12);

        System.out.println("Nome: " + meuCachorro.getNome());
        System.out.println("Raca: " + meuCachorro.getRaca());
        System.out.println("Idade: " + meuCachorro.getIdade());

        meuCachorro.latir();
        meuCachorro.correr();
    }

    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void latir(){
        System.out.println("Au Au AUu");
    }

    public void correr(){
        System.out.println("O " + nome + " está correndo...");
    }

    public String getNome(){
        return nome;
    }

    public String getRaca(){
        return raca;
    }

    public int getIdade(){
        return idade;
    }
}
