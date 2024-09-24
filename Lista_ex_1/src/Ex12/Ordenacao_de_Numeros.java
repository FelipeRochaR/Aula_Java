/* Exercício 12: Ordenação de Números
 * Implemente um programa que leia 5 números inteiros do usuário, armazene-os em um array
 * e os imprima em ordem crescente.
*/

package Ex12;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao_de_Numeros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

