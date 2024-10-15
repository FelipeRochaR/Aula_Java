public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Carlos", "carlos@example.com");
        Usuario usuario2 = new Usuario("Maria", "maria@example.com");

        Tarefa tarefa1 = new Tarefa("Desenvolver Interface", "Criar a interface do usuário", 20241001, 20241015, usuario1);
        Tarefa tarefa2 = new Tarefa("Implementar Backend", "Desenvolver a API", 20241005, 20241020, usuario2);

        Projeto projeto1 = new Projeto("Sistema de Gestão", "Desenvolvimento de um sistema completo de gestão");

        projeto1.addTarefa(tarefa1);
        projeto1.addTarefa(tarefa2);

        projeto1.marcarConcluida(tarefa1);

        System.out.println(projeto1);
    }
}
