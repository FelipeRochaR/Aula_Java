/* Exercício 8: Entrada de Dados
 * Escreva um programa que leia o nome e a idade de uma pessoa a partir do teclado e
 * imprima uma mensagem no console com essas informações.
 */

package Ex8;

import java.util.Scanner;

public class Entrada_de_Dados {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome");
        String nome = scanner.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
