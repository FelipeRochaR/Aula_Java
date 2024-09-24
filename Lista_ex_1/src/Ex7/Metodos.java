/* Exercício 7: Métodos
 * Escreva um programa que contenha um método chamado soma que receba dois números inteiros como parâmetros
 * e retorne a soma deles. Chame esse método a partir do método main e exiba o resultado.
*/

package Ex7;

public class Metodos {
    public static void main(String[] args){
        int result = Soma(10, 5);
        System.out.println("O resultado da soma de 10 e 5 eh: " + result);
    }

    public static int Soma(int a, int b){
        return a + b;
    }
}
