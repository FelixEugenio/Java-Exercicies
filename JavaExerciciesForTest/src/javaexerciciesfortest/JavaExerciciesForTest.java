/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexerciciesfortest;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class JavaExerciciesForTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3]; //define a variável matriz como um array de 2 dimensões com 3*3 elementos
        
        //Podemos preencher e imprimir todos os elementos da matriz com dois ciclos encadeados 
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
                 System.out.println();

        // Imprimir a matriz após preenchimento
        System.out.println("Matriz Preenchida");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
        
        //Defina uma segunda matriz com a mesma dimensão

        int[][] novaMatriz = new int[3][3];
        
         // Preencher a matrizDuplicada com o dobro dos valores da matrizOriginal
         
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 novaMatriz[i][j] = matriz[i][j] * 2;
             }
        }
         System.out.println();
                 // Imprimir a matriz duplicada
                 System.out.println("\nNova Matriz dubplicada");
        for (int i = 0; i < novaMatriz.length; i++) {
            for (int j = 0; j < novaMatriz.length; j++) {
                System.out.print(novaMatriz[i][j] + "\t");
            }
            
            System.out.println();
        }
 
        //Refaça todos estes exercícios perguntando inicialmente ao utilizador o número de linhas, onúmero de colunas e o valor a multiplicar
        
        System.out.print("Defina o numero de linhas da matriz");
        int linhas = scanner.nextInt();
        
        System.out.print("Defina o numero de Colunas da Matriz");
        int colunas = scanner.nextInt();
        
        System.out.print("Defina o valor a multiplicar");
        int multiplicador = scanner.nextInt();
        /*
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 1 + i * matriz[0].length + j;
                System.out.print(matriz[i][j] + "\t");
            }
            
            System.out.println("");
        }
*/
    }
}
