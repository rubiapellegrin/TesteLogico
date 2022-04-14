/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testelogico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author rubia
 */
public class Principal {

    public static void main(String args[]) {

        Metodo01(3, 'a');  /// metodo do exercicio 1
        System.out.println(); ///divisão
        System.out.println("---------------------------");

        int[] arrayInt = new int[]{1, 2, 3, 4}; ///atribuição de array para aplicar no metodo do execicio 2
        Metodo02(arrayInt); //metodo do exercicio 2
        System.out.println();   ///divisão
        System.out.println("---------------------------");

        String[] arrayMetodo03 = new String[]{"1", "2", " ", null};///atribuição de array para  usar no exercicio 3
        Metodo03(arrayMetodo03); //metodo do exercicio 3
        System.out.println(); ///divisão
        System.out.println("---------------------------");

        ArrayList<Objeto> objetos = new ArrayList<Objeto>(); //atribuição de uma arrays de objetos com varios tipos de atribuitos
        Objeto obj1 = new Objeto('c', 2); //atribuição de uma chave e um numero a um objeto
        Objeto obj2 = new Objeto('d', 4); //atribuição de uma chave e um numero a um objeto
        objetos.add(obj1);   //adicionar o objeto a lista de objetos
        objetos.add(obj2);   //adicionar o objeto a lista de objetos

        Metodo04(objetos);  //metodo do exercicio 4 que usa a lista de objetos que foi declarada
        System.out.println(); //divisão
        System.out.println("---------------------------");

        int[] arrayMetodo5 = new int[]{5, 4, 3, 2, 5}; // array de inteiros que será usado no exercicio 5

        Metodo05(arrayMetodo5, 5, 3); //metodo do exercicio 5
        System.out.println(); //divisão
        System.out.println("---------------------------");

        int[] arrayMetodo6 = new int[]{1, 2, 3, 3, 4, 5, 6, 6, 8, 9}; //array que sera usado no metodo do exercicio 6
        Metodo06(arrayMetodo6); //metodo do exercicio 6
        System.out.println(); //divisão
        System.out.println("---------------------------");

        int[] arrayMetodo70 = new int[]{1, 2, 3, 3, 4, 5, 6, 6, 8, 9};//array que será usado no metodo do exercicio 7
        int[] arrayMetodo71 = new int[]{1, 2, 3, 3, 4, 5, 6, 6, 8, 9};//array que será usado no metodo do exercicio 7
        Metodo07(arrayMetodo70, arrayMetodo70); //metodo do exercicio 7
        System.out.println(); //divisão
        System.out.println("---------------------------");

        int[] arrayMetodo9 = new int[]{1, 2, 3, 4, 5};//array que é usado no metodo do exercicio 9

        Metodo09(arrayMetodo9, 2); //o metodo do exercicio 9
        System.out.println();  //divisão
        System.out.println("---------------------------");

        int[] arrayMetodo10 = new int[]{1, 2, 3, 4, 5}; //array que será usado no metodo do exercicio 10
        int[] arrayMetodo11 = new int[]{7, 2, 3, 8, 9}; //array que será usado no metodo no exercicio 10

        Metodo10(arrayMetodo10, arrayMetodo11); // o metodo do exercicio 10
        System.out.println(); //divisão
        System.out.println("---------------------------");
    }

    public static void Metodo01(int numero, char letra) {
        //metodo 1 recebe a quantidade de repetições de uma letra
        char[] arrayChar = new char[numero]; //atribuição de um vetor de char

        for (int i = 0; i < numero; i++) {  //percorrer o vetor 
            arrayChar[i] = letra;   // e atribuir a letra a cada posição
            System.out.print(arrayChar[i] + " "); // imprime cada componente do vetor
        }
    }

    private static void Metodo02(int[] arrayInt) {
        //o metodo 2 inverte a ordem do vetor
        int tamanho = arrayInt.length; // guardar o tamanho do vetor
        int[] vetorAux = new int[tamanho]; //criar um vetor auxiliar para guardar a nova ordem

        for (int i = 0; i < arrayInt.length; i++) { //percorre o vetor
            tamanho--;      ///subtrai um do tamanho para ir pegando a posição decrescente
            vetorAux[i] = arrayInt[tamanho]; //atribui a ultima posição do vetor a primeiro posição do auxiliar
        }
        for (int i = 0; i < arrayInt.length; i++) {  //percorre o vetor noavemnte 
            arrayInt[i] = vetorAux[i];    // e atribui cada valor do vetor auxiliar a o vetor proprio
            System.out.print(arrayInt[i] + " "); // imprime cada posição do vetor
        }
    }

    private static void Metodo03(String[] arrayMetodo03) {
        //o metodo 3 recebe um array com espaço e campo nullo e os remove
        List lista = new ArrayList(arrayMetodo03.length); //declara uma lista do tamanho do array

        for (int i = 0; i < arrayMetodo03.length; i++) { //percorre o array
            lista.add(arrayMetodo03[i]); ///atribui os valores do array a lista
            if (arrayMetodo03[i] == null) {  //se o valor da posição for nulo, remove ele da lista

                lista.remove(arrayMetodo03[i]);
            }
            if (arrayMetodo03[i] == " ") {   //se o valor da posição for um espaço, remove ele da lista

                lista.remove(arrayMetodo03[i]);
            }

        }
        System.out.println(lista); //imprime a lista sem os valores nulos e espaços

    }

    private static void Metodo04(ArrayList<Objeto> objetos) {
        //metodo 4 é para pegar dois atribuitos de objetos passados e os imprimir com separa de :
        String[] stringAux = new String[objetos.size()]; //declaração de string auxiliar para guardar os valores recebidos dos objetos

        for (int i = 0; i < objetos.size(); i++) {  //percorre a lista de objetos
            stringAux[i] = objetos.get(i).getChave() + ":" + objetos.get(i).getValor(); //atribui a string de posiçao de vetor i os atributos dos objetos concatenados.
            System.out.print(stringAux[i] + " "); //imprime o vetor de string
        }
    }

    private static void Metodo05(int[] arrayIntMetodo3, int num1, int num2) {
        //metodo 5 é o que remove todos os numeros do array que forem iguais a num1 e num2
        Set<Integer> set = new HashSet<>(); //atribuição de uma lista do tipo set pra guardar os valores diferentes de num1 e num2
        for (int i = 0; i < arrayIntMetodo3.length; i++) {//percorre o array 
            if (arrayIntMetodo3[i] != num1 && arrayIntMetodo3[i] != num2) { //cconfere os valores diferentes de num1 e num2
                set.add(arrayIntMetodo3[i]);   //e os atribui a lista set
            }
        }
        System.out.println(set); //imprime lista do tipo set
    }

    private static void Metodo06(int[] arrayIntMetodo3) {
        //o metodo 6 permite remover numero repetido de arrays
        Set<Integer> set = new HashSet<>(); //neste metodo foi usado o set pois não permite adicionar numeros repetidos a lista
        for (int a : arrayIntMetodo3) { //percorre o array principal
            set.add(a); //adiciona os valores a lista do tipo set
        }
        System.out.println(set);//imprime a lista do tipo set
    }

    private static void Metodo07(int[] arrayIntMetodo70, int[] arrayIntMetodo71) {
        //o metodo 7 verifica se os array passados aos metodos são iquais
        boolean tipo = false; //declara uma variavel pra receber o resultado se true ou false, como false e caso sejam iguais recebe true
        if (Arrays.equals(arrayIntMetodo70, arrayIntMetodo71)) { ///verifica a igualdade dos arrays
            tipo = true; //se sim o resultado sera impresso é true
        }
        System.out.println(tipo); //mostra o resultado
    }

    private static void Metodo08(int[] arrayIntMetodo70, int[] arrayIntMetodo71) {
        //metodo 8 não foi realizado
    }

    private static void Metodo09(int[] arrayMetodo9, int num) {
        //no metodo o array passado seria dividido em arrays menores de tamanho num

        int[][] novoArray = new int[arrayMetodo9.length][num]; //neste metodo fou usado matrizes

        int contColuna = 0;//inicializa o numero de colunas
        int contLinha = 0;//inicializa 0 numero de linhas

        for (int i = 0; i < arrayMetodo9.length; i++) { //percorre o array principal

            if (contColuna == 0) { //caso a coluna seja zero 
                novoArray[contLinha][contColuna] = arrayMetodo9[i]; //atribui o valor a primeira coluna da linha
                contColuna++;

            } else if (contColuna == 1) { //caso a coluna seja 1 
                novoArray[contLinha][contColuna] = arrayMetodo9[i];//atribui o valor a segunda coluna e vai pra proxima linha e o numero da coluna volta a ser zero para o proximo entrar na primera coluna.
                contLinha++; //vai para a proxima linha 
                contColuna = 0; //retorna a primeira coluna
            }
        }

        for (int i = 0; i < (arrayMetodo9.length / 2) + 1; i++) { //percorre o array para mostrar as linhas
            System.out.print("["); //caractere para inicio de cada linha
            for (int j = 0; j < num; j++) {//percorre a linha
                if (novoArray[i][j] != 0) { ///mostra os diferentes de zero
                    System.out.print(novoArray[i][j] + " ");
                }
            }
            System.out.print("]");
        }
    }

    private static void Metodo10(int[] arrayMetodo10, int[] arrayMetodo11) {
        //o ultimo metodo mostra os valores em comun entre os arrays
        int[] vetorAux = new int[arrayMetodo10.length]; //declaração de array auxiliar para guardar os valores em comum
        int cont = 0; //um contador para percorrer o vetor auxiliar
        for (int i = 0; i < arrayMetodo10.length; i++) {  //percorre o primeiro array
            for (int j = 0; j < arrayMetodo11.length; j++) { //percorre o segundo array
                if (arrayMetodo10[i] == arrayMetodo11[j]) { //verifica a igualdade de cada item do segundo array com o primeiro
                    vetorAux[cont] = arrayMetodo10[i]; //se possui valores igual atribui a posição do vetor auxiliar
                    System.out.print(vetorAux[cont] + " "); ///imprime o valor em comum que esta o vetor auxiliar
                }
            }
        }
    }

}
