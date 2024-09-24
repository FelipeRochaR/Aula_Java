/*
 * Exercício 10: Número Primo
 * Escreva um programa que determine se um número fornecido pelo usuário é primo.
 * Um número primo é aquele que só é divisível por 1 e por ele mesmo.
 */

package Ex10;

import java.util.Scanner;

public class Numero_Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
