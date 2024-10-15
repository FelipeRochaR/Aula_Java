public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 100.0f);

        Cliente cliente1 = new Cliente("Felipe Rocha", 123456789, 987654321);

        Locacao locacao1 = new Locacao(1, 5, cliente1, carro1);

        System.out.println(locacao1);
        System.out.println("Valor Total: R$ " + locacao1.valorTotal());
    }
}
