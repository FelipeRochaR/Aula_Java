/* Exercício 11: Palíndromo
 * Crie um programa que verifique se uma palavra fornecida pelo usuário é um palíndromo
 * (palavra que se lê da mesma forma de trás para frente).
 */

package Ex11;

import java.util.Scanner;
public class Palindromo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();
        if (isPalindromo(palavra)) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }
    }
    public static boolean isPalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;
        while (inicio < fim) {
            // Compara os caracteres no início e no fim da palavra
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}


