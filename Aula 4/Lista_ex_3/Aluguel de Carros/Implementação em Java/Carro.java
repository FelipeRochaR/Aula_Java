public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float valorPorDia;

    public Carro(String marca, String modelo, int ano, float valorPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorPorDia = valorPorDia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValorPorDia() {
        return valorPorDia;
    }

    public void setValorPorDia(float valorPorDia) {
        this.valorPorDia = valorPorDia;
    }

    public boolean disponibilidade() {
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", valorPorDia=" + valorPorDia +
                '}';
    }
}
