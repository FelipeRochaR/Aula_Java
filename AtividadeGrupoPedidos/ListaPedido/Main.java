public class Main {
    public static void main(String[] args) {

        Produto cafe = new Produto("Café", 5.5);
        Produto paoQueijo = new Produto("Pão de queijo", 3.0);
        Produto suco = new Produto("Suco de laranja", 6.0);

        ItemPedido item1 = new ItemPedido(cafe, 2);
        ItemPedido item2 = new ItemPedido(paoQueijo, 5);
        ItemPedido item3 = new ItemPedido(suco, 3);

        Endereco endereco = new Endereco("Rua ABC", "456", "Parana", "12345-678");
        Cliente cliente = new Cliente("Marcos", endereco);

        Pedido pedido = new Pedido(1, cliente, endereco);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        pedido.imprimirComanda();
    }
}