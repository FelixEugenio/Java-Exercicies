/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexerciciesfortest;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
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
     
     public static int calcularOMaiorValorDoArray(int[] array){
         
         
         int maior = array[0];
         
          // Percorre o array a partir do segundo elemento
         for (int i = 0; i < array.length; i++) {
             if (array[i] > maior) {
                 maior = array[i];
             }
         }
         
         return maior;
     }
     
     public static int calcularAPosicaoDoMaiorValorDoArray(int[] array){
         
         
         int posicao = 0;
         
          // Percorre o array a partir do segundo elemento
         for (int i = 0; i < array.length; i++) {
             if (array[i] > array[posicao]) {
                 posicao = i;
             }
         }
         
         return posicao;
     }
     
     public static void OrdenarArrayDeManeiraCrescente(int[] array){
          // Percorre todo array 
         for (int i = 0; i < array.length - 1; i++) {
              // Percorre o array até o elemento não ordenado
             for (int j = 0; j < array.length -1 - i; j++) {
                 if (array[j] > array[j + 1]) {
                     int temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                 }
             }
         }
     }
     
     public static int PesquisaBinaria(int[] array, int numero){
         int inicio = 0;
         int fim = array.length - 1;
         
         while(inicio <= fim ){
             int meio = inicio + (fim - inicio) / 2;
             
          // Se o número for encontrado no meio
            if (array[meio] == numero) {
                return meio;
            }
            
            // Se o número for maior, ignore a metade esquerda
            if (array[meio] < numero) {
                inicio = meio + 1;
            }
            
            // Se o número for menor, ignore a metade direita
            else {
                fim = meio - 1;
            }
            
            
         }
         // Se o número não for encontrado, retorne -1
        return -1;
       
     }
     
     public static int PesquisaBinaria2(int[] array , int numero){
         int inicio = 0;
         int fim = array.length -1;
         
         while(inicio <= fim){
             int meio = inicio + (fim - inicio) /2;
             
             if(array[meio] == numero){
                 return meio;
             }
             
             if(array[meio] < numero){
                 inicio = meio + 1;
             }
             
             else{
                 fim = meio - 1;
             }
         }
         
         return -1;
     }
     
     public static void imprimirArray(int[][] array){
         // Percorre cada linha do array
        for (int i = 0; i < array.length; i++) {
            // Percorre cada elemento da linha
            for (int j = 0; j < array[i].length; j++) {
                // Imprime o elemento, seguido de um tab
                System.out.print(array[i][j]);
                
                // Se não for o último elemento da linha, imprime um tab
                if (j < array[i].length - 1) {
                    System.out.print("\t");
                }
            }
            // Após imprimir todos os elementos da linha, pula uma linha
            System.out.println();
     }
     }
     
     public static float[] resolverEquacaoSegundoGrau(float a, float b, float c) {
        // Calculando o discriminante (delta)
        float delta = b * b - 4 * a * c;
        
        // Verificando as possíveis condições com base no valor de delta
        if (delta > 0) {
            // Duas soluções reais e distintas
            float solucao1 = (-b + (float)Math.sqrt(delta)) / (2 * a);
            float solucao2 = (-b - (float)Math.sqrt(delta)) / (2 * a);
            return new float[] { solucao1, solucao2 };
        } else if (delta == 0) {
            // Uma solução real (raízes iguais)
            float solucao = -b / (2 * a);
            return new float[] { solucao };
        } else {
            // Não há soluções reais (raízes complexas)
            return new float[0];  // Retorna um array vazio
        }
    }
     
     public static void grava_Inteiros(String nome_ficheiro,int[] inteiros){
         
         int indice;
         
         try(PrintWriter writer = new PrintWriter(new FileWriter(nome_ficheiro))){
             writer.println("isto é uma lista em ASCII");
             
             for(indice = 0;indice < inteiros.length;indice++){
                 writer.println(inteiros[indice]);
             }
             
                      System.out.printf("\nForam escritos no ficheiro %s %d inteiros", nome_ficheiro,indice);        

         }catch(IOException e){
             System.out.println(e.getMessage());
         }
         
     }
     
     
    
    @SuppressWarnings("empty-statement")
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
        

     float raio =  (float) (1 + Math.random() * (5 -1));
        
        System.out.println("a area de um circulo é " + calcularAreaDeUmCirculo(raio));   
        
        
        int[] array = {1,2,3,45,56,7,9};
        
        System.out.println("o maior valor do array é " + calcularOMaiorValorDoArray(array));
        
        int[] array = {1,2,3,45,56,7,9};
        int posicao = calcularAPosicaoDoMaiorValorDoArray(array);
        
        System.out.println("a posicao do maior valor do array é " + posicao);
        
        
        int[] numeros = {9, 2, 5, 1, 7, 3, 4};
        System.out.println("mostrar o array desordenado");
        System.out.println(Arrays.toString(numeros));
        
        
        OrdenarArrayDeManeiraCrescente(numeros);
        
        System.out.println("mostrar o array ordenado");
        System.out.println(Arrays.toString(numeros));
      
        
        
        
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int numero = 7;

        int resultado = PesquisaBinaria(array, numero);

        if (resultado != -1) {
            System.out.println("Número " + numero + " encontrado na posição: " + resultado);
        } else {
            System.out.println("Número " + numero + " não encontrado.");
        }

  
        
        // Exemplo de array bidimensional
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Chama a função para imprimir o array
        imprimirArray(array);
        
       
        
        // Exemplo de coeficientes
        
        
        float a = 1;
        float b = -3;
        float c = 2;

        // Chama a função para resolver a equação
        float[] soluções = resolverEquacaoSegundoGrau(a, b, c);

        // Imprime as soluções
        if (soluções.length == 2) {
            System.out.println("As soluções são: " + soluções[0] + " e " + soluções[1]);
        } else if (soluções.length == 1) {
            System.out.println("A solução única é: " + soluções[0]);
        } else {
            System.out.println("Não há soluções reais.");
        }

        
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int numero = 89;

        int resultado = PesquisaBinaria2(array, numero);

        if (resultado != -1) {
            System.out.println("Número " + numero + " encontrado na posição: " + resultado);
        } else {
            System.out.println("Número " + numero + " não encontrado.");
        }

*/
        
        int[] valores = {0,1,2,3,4,5,6,7,8,9,10};
        
        grava_Inteiros("teste.txt", valores);
        grava_Inteiros("teste.txt", valores);
        
    }
}
