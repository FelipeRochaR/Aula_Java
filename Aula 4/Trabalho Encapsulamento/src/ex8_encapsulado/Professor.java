package ex8_encapsulado;

public class Professor {
    public static void main(String[] args) {
        Professor prof = new Professor("Jhoni", "POO e UML", 500000.00);

        System.out.println("Nome: " + prof.getNome());
        System.out.println("Disciplina: " + prof.getDisciplina());
        System.out.println("Salário: R$ " + prof.getSalario());

        prof.darAula();
        prof.corrigirProvas();
    }

    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario){
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula(){
        System.out.println("O " + nome + " está dando aula...");
    }

    public void corrigirProvas(){
        System.out.println("O " + nome + " está corrigindo provas...");
    }

    public String getNome(){
        return nome;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public double getSalario(){
        return salario;
    }
}
