public class Cliente {
    private String nome;
    private int cpf;
    private int carteiraHabilitacao;

    public Cliente(String nome, int cpf, int carteiraHabilitacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(int carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", carteiraHabilitacao=" + carteiraHabilitacao +
                '}';
    }
}
