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
