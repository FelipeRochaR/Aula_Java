/* Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento.
 * Adicione métodos para ligar e desligar o computador.
 */

package ex6;

public class Computador {
    public static void main(String[] args) {
        Computador meuComputador = new Computador("i7 9 Geração", "16gb RAM", "1TB");

        System.out.println("Processador: " + meuComputador.getProcessador());
        System.out.println("Memória: " + meuComputador.getMemoria());
        System.out.println("Armazenamento: " + meuComputador.getArmazenamento());

        meuComputador.ligar();
        meuComputador.desligar();
    }

    private String processador;
    private String memoria;
    private String armazenamento;

    public Computador(String processador, String memoria, String armazenamento){
        this.processador = processador;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
    }

    public void ligar(){
        System.out.println("O computador está ligando...");
    }

    public void desligar(){
        System.out.println("O computador está desligando...");
    }

    public String getProcessador(){
        return processador;
    }

    public String getMemoria(){
        return memoria;
    }

    public String getArmazenamento(){
        return armazenamento;
    }
}
