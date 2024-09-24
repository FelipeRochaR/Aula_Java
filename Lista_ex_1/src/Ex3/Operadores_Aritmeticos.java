/* Exercício 3: Operadores Aritméticos
 * Escreva um programa que leia dois números do usuário e exiba a soma, subtração,
 * multiplicação e divisão desses números.
*/

package Ex3;

import java.util.Scanner;

public class Operadores_Aritmeticos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  //Cria Scanner para ler do teclado.

        System.out.println("Digite um numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite um segundo numero: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("A soma dos numeros eh igual a: " + soma);
        System.out.println("A subtracao dos numeros eh igual a: " + subtracao);
        System.out.println("A multiplicacao dos numeros eh igual a: " + multiplicacao);
        System.out.println("A divisao dos numero eh igual a: " + divisao);
    }
}
