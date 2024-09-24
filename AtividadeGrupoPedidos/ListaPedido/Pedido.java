import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private Endereco enderecoEntrega;
    private List<ItemPedido> itens;

    public Pedido(int numero, Cliente cliente, Endereco enderecoEntrega) {
        this.numero = numero;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void imprimirComanda() {
        System.out.println("Pedido número: " + numero);
        System.out.println("Cliente: " + cliente.getNome() + ", Endereço: " + cliente.getEndereco());
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
        System.out.println("Itens do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println(item.getProduto().getNome() + " - R$ " + item.getProduto().getPreco() +
                    ", Quantidade: " + item.getQuantidade() +
                    ", Subtotal: R$ " + item.calcularSubtotal());
        }
        System.out.println("Total: R$ " + calcularValorTotal());
    }
}