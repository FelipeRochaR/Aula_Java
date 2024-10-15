public class Locacao {
    private int dataInicio;
    private int dataFim;
    private Cliente cliente;
    private Carro carro;

    public Locacao(int dataInicio, int dataFim, Cliente cliente, Carro carro) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cliente = cliente;
        this.carro = carro;
    }

    public int getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(int dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getDataFim() {
        return dataFim;
    }

    public void setDataFim(int dataFim) {
        this.dataFim = dataFim;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public float valorTotal() {
        int diasAluguel = dataFim - dataInicio;
        return diasAluguel * carro.getValorPorDia();
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", cliente=" + cliente +
                ", carro=" + carro +
                '}';
    }
}
