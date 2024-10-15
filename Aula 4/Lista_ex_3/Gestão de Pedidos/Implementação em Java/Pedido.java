import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private int data;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente, int data) {
        this.cliente = cliente;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void addItens(ItemPedido item) {
        itens.add(item);
    }

    public int calcularValorTotal() {
        int total = 0;
        for (ItemPedido item : itens) {
            total += item.valorTotal();
        }
        return total;
    }

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório do Pedido\n");
        relatorio.append("Cliente: ").append(cliente.getNome()).append("\n");
        relatorio.append("Data: ").append(data).append("\n");
        relatorio.append("Itens:\n");
        for (ItemPedido item : itens) {
            relatorio.append(item.relatorio()).append("\n");
        }
        relatorio.append("Valor Total do Pedido: ").append(calcularValorTotal()).append("\n");
        return relatorio.toString();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", data=" + data +
                ", itens=" + itens +
                '}';
    }
}