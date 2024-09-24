/* Exercício 15: Fatorial
 * Crie um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Utilize tanto a versão iterativa quanto a versão recursiva.
 */
package Ex15;

import java.util.Scanner;

public class Fatorial {
    public static long fatorialIterativo(int n){
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static long fatorialRecursivo(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * fatorialRecursivo(n - 1);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("Número inválido! O número deve ser não-negativo.");
        }else{
            long fatorialIterativo = fatorialIterativo(numero);
            System.out.println("Fatorial (iterativo) de " + numero + " é: " + fatorialIterativo);

            long fatorialRecursivo = fatorialRecursivo(numero);
            System.out.println("Fatorial (recursivo) de " + numero + " é: " + fatorialRecursivo);
        }
    }
}
