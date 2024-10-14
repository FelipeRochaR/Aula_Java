/* Implemente uma classe Aluno com atributos nome, matricula, e curso.
 * Adicione um método para calcular a média de notas.
 */

package ex7;

public class Aluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Felipe", 112233 , "Análise e Desenvolvimento de Sistemas", 7);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());

        System.out.println("Média do Aluno: " + aluno.getMedia());
    }

    private String nome;
    private int matricula;
    private String curso;
    private double media;

    public Aluno(String nome, int matricula, String curso, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.media = media;
    }

    public void calcMedia(){
        media = (5 + 8 + 7) / 3;
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public String getCurso(){
        return curso;
    }

    public double getMedia(){
        return media;
    }
}
