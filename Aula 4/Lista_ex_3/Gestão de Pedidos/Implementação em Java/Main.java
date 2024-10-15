public class Main {
    public static void main(String[] args) {
        Prato prato1 = new Prato("Feijoada", "Feijão preto com carne", 30);
        Prato prato2 = new Prato("Lasanha", "Lasanha de queijo", 25);

        Cliente cliente1 = new Cliente("João Silva");

        Pedido pedido1 = new Pedido(cliente1, 20241015);

        pedido1.addItens(new ItemPedido(prato1, 2));
        pedido1.addItens(new ItemPedido(prato2, 1));

        System.out.println(pedido1.gerarRelatorio());
    }
}
