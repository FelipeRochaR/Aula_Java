/* Defina uma classe Empresa com atributos como nome, CNPJ, e numeroFuncionarios.
 * Adicione métodos para contratar e demitir funcionários.
 */

package ex20;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("BagriLTDA", "01050908", 5000);

        System.out.println("Nome da Empresa: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Número de funcionários: " + empresa.getNumFuncionarios());

        empresa.contratar();
        empresa.demitir();
    }

    public String nome;
    public String cnpj;
    public int numFuncionarios;

    public Empresa(String nome, String cnpj, int numFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void contratar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos funcionários quer contratar: ");
        int valor = scanner.nextInt();
        if(valor <= numFuncionarios || valor >= numFuncionarios){
            numFuncionarios += valor;
            System.out.println(valor + " novos funcionários contratados. Novo número de funcionários: " + this.getNumFuncionarios());
        }else{
            System.out.println("Número inválido...");
        }
    }

    public void demitir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos funcionários quer demitir: ");
        int valor = scanner.nextInt();
        if(valor < numFuncionarios){
            numFuncionarios -= valor;
            System.out.println(valor + " funcionários demitidos. Novo número de funcionários: " + this.getNumFuncionarios());
        }else {
            System.out.println("Número inválido...");
        }
    }
}
