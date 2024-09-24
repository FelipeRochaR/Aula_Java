/* Exercício 4: Estruturas Condicionais
 * Crie um programa que leia um número inteiro do usuário e verifique se ele é par ou ímpar.
 * Exiba uma mensagem correspondente no console.
*/

package Ex4;

import java.util.Scanner;

public class Estruturas_Condicionais {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos verificar se o numero é Par ou Impar.");
        System.out.println("Digite um numero: ");
        double number = scanner.nextDouble();

        if (number % 2 == 0) {
            System.out.println("O numero informado eh Par.");
        }else{
            System.out.println("O numero informado eh Impar.");
        }
    }
}
