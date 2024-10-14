/* Exercício 16: Conversor de Temperatura
 * Desenvolva um programa que converta temperaturas entre Celsius e Fahrenheit.
 * O usuário deve escolher qual conversão deseja realizar e inserir o valor da temperatura a ser convertida.
 */

package Ex16;

import java.util.Scanner;

public class Conversor_de_Temperatura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Digite sua escolha (1 ou 2): ");
        int escolha = scanner.nextInt();

        switch(escolha){
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusParaFahrenheit(celsius);
                System.out.printf("%.2f Celsius é igual a %.2f Fahrenheit.%n", celsius, fahrenheit);
                break;

            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheitTemp = scanner.nextDouble();
                double celsiusTemp = fahrenheitParaCelsius(fahrenheitTemp);
                System.out.printf("%.2f Fahrenheit é igual a %.2f Celsius.%n", fahrenheitTemp, celsiusTemp);
                break;

            default:
                System.out.println("Escolha inválida.");
                break;
        }
        scanner.close();
    }
    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    public static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}
