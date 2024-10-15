public class ItemPedido {
    private Prato prato;
    private int quantidade;

    public ItemPedido(Prato prato, int quantidade) {
        this.prato = prato;
        this.quantidade = quantidade;
    }

    public Prato getPrato() {
        return prato;
    }

    public void setPrato(Prato prato) {
        this.prato = prato;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int valorTotal() {
        return prato.getPreco() * quantidade;
    }

    public String relatorio() {
        return "Prato: " + prato.getNome() + ", Quantidade: " + quantidade + ", Valor Total: " + valorTotal();
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "prato=" + prato +
                ", quantidade=" + quantidade +
                '}';
    }
}
