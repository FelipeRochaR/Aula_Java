/* Exercício 6: Arrays
 * Crie um programa que declare um array de inteiros com 5 elementos, inicialize-o com valores
 * e imprima todos os valores do array no console.
*/

package Ex6;

public class Arrays {
    public static void main(String[] args){
        int[] intArray = {10, 20, 30, 40, 50};

        for(int i = 0; i < intArray.length; i++){
            System.out.println("Elemento na posicao " + i + ": " +intArray[i]);
        }
    }
}

// .length é usado para obter o tamanho (número de elementos) de um array.