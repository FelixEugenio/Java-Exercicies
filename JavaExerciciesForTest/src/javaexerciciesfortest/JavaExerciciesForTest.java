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

    public static float CalcularMediaPonderada(float valor1, float valor2){
        
        float peso1 = 0.4f;
        float peso2 = 0.79f;
        
        float mediaPonderada = valor1  * peso1  + valor2 * peso2;
        return mediaPonderada;
        
    }
    
     public static void testa_parametro(int[] lista1){
            System.out.println("dentro da funcao");
            
            for (int indice = 0; indice < lista1.length; indice++) {
                System.out.printf("lista1[%d]=%d\n",indice,lista1[indice]);
            }
            
            for (int indice = 0; indice < lista1.length; indice++) {
                lista1[indice] = 10 + indice;
            }
            
             for (int indice = 0; indice < lista1.length; indice++) {
                System.out.printf("lista1[%d]=%d\n",indice,lista1[indice]);
            }
        }
     
     public static float calcularPerimetroDeUmCirculo(float raio){
         float perimetro;
         float pi = (float) Math.PI;
         
         return perimetro = 2 * pi * raio;
     }
     
     public static float calcularAreaDeUmCirculo(float raio){
         float area;
         float pi = (float) Math.PI;
         
         return area =  (float) (pi * Math.pow(raio, 2));
     }
    
    public static void main(String[] args) {
        
        /*
        //Scanner scanner = new Scanner(System.in);
       // int[][] matriz = new int[3][3]; //define a variável matriz como um array de 2 dimensões com 3*3 elementos
        
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
        
        // Pergunta ao usuário o número de linhas, colunas e valor para multiplicar

        System.out.print("Defina o numero de linhas da matriz : ");
        int linhas = scanner.nextInt();
        
        System.out.print("Defina o numero de Colunas da Matriz : ");
        int colunas = scanner.nextInt();
        
        System.out.print("Defina o valor a multiplicar : ");
        int multiplicador = scanner.nextInt();
        
        
         // Cria as matrizes com o número de linhas e colunas fornecido

        int[][] matrizRefeita = new int[linhas][colunas];
        int[][] novaMatrizDuplicada = new int[linhas][colunas];
        
    // Preencher a nova matrizOriginal com os valores fornecidos pelo usuário
        
        for (int i = 0; i < matrizRefeita.length; i++) {
            for (int j = 0; j < novaMatrizDuplicada.length; j++) {
                System.out.print("Digite os Valores para a Posição ["+ i +"]["+ j +"] : ");
                matrizRefeita[i][j] = scanner.nextInt();
            }
        }
        
    // Preencher a matrizDuplicada com os valores multiplicados

        for (int i = 0; i < matrizRefeita.length; i++) {
            for (int j = 0; j < matrizRefeita.length; j++) {
                novaMatrizDuplicada[i][j] = matrizRefeita[i][j] * multiplicador;
            }
        }
        
        // Imprimir a matriz original Refeita
        for (int i = 0; i < matrizRefeita.length; i++) {
            for (int j = 0; j < matrizRefeita.length; j++) {
                System.out.print(matrizRefeita[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Imprimir uma linha em branco entre as matrizes

        System.out.println();
        
                // Imprimir a matriz duplicada

        for (int i = 0; i < novaMatrizDuplicada.length; i++) {
            for (int j = 0; j < novaMatrizDuplicada.length; j++) {
                System.out.print(novaMatrizDuplicada[i][j] + "\t");
            }
            System.out.println();
        }
        
        
        /*
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 1 + i * matriz[0].length + j;
                System.out.print(matriz[i][j] + "\t");
            }
            
            System.out.println("");
        }

        
        
        //dispositivos ate as funcoes 
        
        float nota1 =  (float) (1 + Math.random() * (5 -1));
        float nota2 =  (float) (1 + Math.random() * (5 -1));
        
        float media = CalcularMediaPonderada(nota1, nota2);
        
        System.out.println(media);
        

        
     int[] lista = {1,2,3};
     
        System.out.println("antes de chamar a funcao");
         for (int indice = 0; indice < lista.length; indice++) {
                System.out.printf("lista[%d]=%d\n",indice,lista[indice]);
        }
         
         testa_parametro(lista);
         
         System.out.println("depois de chamar a funcao");
         System.out.println("antes de chamar a funcao");
         for (int indice = 0; indice < lista.length; indice++) {
                System.out.printf("lista[%d]=%d\n",indice,lista[indice]);
        }
      
        
        float raio =  (float) (1 + Math.random() * (5 -1));
        
        System.out.println("o perimetro de um circulo é " + calcularPerimetroDeUmCirculo(raio));
        
  */
     float raio =  (float) (1 + Math.random() * (5 -1));
        
        System.out.println("a area de um circulo é " + calcularAreaDeUmCirculo(raio));   
        
        
    }
}
