/* Exercício 13: Jogo de Adivinhação
 * Desenvolva um jogo de adivinhação onde o computador escolhe um número aleatório entre 1 e 100,
 * e o usuário deve adivinhar qual é o número. O programa deve fornecer dicas ao usuário se o palpite for
 * muito alto ou muito baixo e contar o número de tentativas até o acerto.
 */

package Ex13;

import java.util.Random;
import java.util.Scanner;

public class Jogo_de_Adivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativa;
        int numeroDeTentativas = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando entre 1 e 100.");

        do {
            System.out.print("Digite o seu palpite: ");
            tentativa = scanner.nextInt();
            numeroDeTentativas++;

            if (tentativa < numeroAleatorio) {
                System.out.println("Estou pensando em um número maior! Tente novamente.");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("Estou pensando em um número menor! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + numeroDeTentativas + " tentativas.");
            }
        } while (tentativa != numeroAleatorio);

        scanner.close();
    }
}
