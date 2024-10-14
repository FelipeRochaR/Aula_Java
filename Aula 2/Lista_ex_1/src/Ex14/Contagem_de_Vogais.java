/* Exercício 14: Contagem de Vogais
 * Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.
 */

package Ex14;

import java.util.Scanner;

public class Contagem_de_Vogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();

        int contadorVogais = 0;

        for (char c : input.toCharArray()) {
            // Verifica se o caractere é uma vogal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVogais++;
            }
        }
        System.out.println("Número de vogais: " + contadorVogais);
    }
}
