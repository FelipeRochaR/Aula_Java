/* Exercício 9: Calculadora Simples
 * Crie um programa que funcione como uma calculadora simples. Ele deve oferecer ao usuário opções para somar,
 * subtrair, multiplicar ou dividir dois números.
 * Use uma estrutura switch para selecionar a operação.
 */

package Ex9;

import java.util.Scanner;

public class Calculadora_Simples
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora Simples ===");
        System.out.println("\n");
        System.out.println("Informe a operacao que deseja fazer:");
        System.out.println("1- Soma.");
        System.out.println("1- Subtracao.");
        System.out.println("1- Multiplicacao.");
        System.out.println("1- Divisao.");
        int op = scanner.nextInt();

        System.out.println("Informe o primeiro numero:");
        double number1 = scanner.nextDouble();

        System.out.println("Informe o segundo numero:");
        double number2 = scanner.nextDouble();

        double result;

        switch(op)
        {
            case 1:
                result = number1 + number2;
                System.out.println("A soma " + number1 + " + " + number2 + " eh igual a: " + result);
                break;

            case 2:
                result = number1 - number2;
                System.out.println("A Subtracao " + number1 + " - " + number2 + " eh igual a: " + result);
                break;

            case 3:
                result = number1 * number2;
                System.out.println("A Multiplicacao " + number1 + " * " + number2 + " eh igual a: " + result);
                break;

            case 4:
                if (number2 != 0)
                {
                    result = number1 / number2;
                    System.out.println("A Divisao " + number1 + " / " + number2 + " eh igual a: " + result);
                }
                else
                {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
