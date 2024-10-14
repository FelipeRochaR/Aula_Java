/* Crie uma classe ContaBancaria com atributos como numeroConta e saldo.
 * Adicione métodos para depositar e sacar dinheiro.
 */

package ex4;

public class ContaBancaria {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("112233", 5000);

        System.out.println("Conta: " + minhaConta.getNumConta());
        System.out.println("Saldo Inicial: " + minhaConta.getSaldo());

        minhaConta.depositar(500.00);
        System.out.println("Saldo após depósito: R$ " + minhaConta.getSaldo());

        minhaConta.sacar(200.00);
        System.out.println("Saldo após saque: R$ " + minhaConta.getSaldo());
    }

    private String numConta;
    private double saldo;

    public ContaBancaria(String numConta, double saldoInicial){
        this.numConta = numConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }else{
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }else{
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public String getNumConta(){
        return numConta;
    }

    public double getSaldo(){
        return saldo;
    }
}
