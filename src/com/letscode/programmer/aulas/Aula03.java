//package com.letscode.programmer.bkp;
//
//
//import java.math.BigDecimal;
//
//public class Aula03 {
//
//    /*
//
//        Array é um objeto que guarda, armazena sequencialmente um conjunto de variáveis de um determinado tipo.
//
//        Declarar
//        Inicializar
//        Acessar
//        Percorrer
//
//     */
//
//
//    public static void main(String[] args) {
//        System.out.println("Olá pessoal.... Arrays uni-dimensionais");
//
//        Integer idades1[] = new Integer[2];
//        idades1[0] = 1;
//        idades1[1] = 2;
//
//        Integer idades2[] = new Integer[2];
//        idades2[0] = 99;
//        idades2[1] = 98;
//
//        Object[] arraysObjetos = new Object[2];
//        arraysObjetos[0] = idades1;
//        arraysObjetos[1] = idades2;
//
//        for (int i = 0; i < arraysObjetos.length; i++) {
//            for (int j = 0; j < ((Integer[]) arraysObjetos[i]).length ; j++) {
//                System.out.println(((Integer[]) arraysObjetos[i])[j]);
//            }
//        }
//
//
//
//
////        for (int i = 0; i < idades.length; i++) {
////            idades[i] = i * 5;
////            //System.out.println("Posição : " + i + " valor: " + idades[i]);
////        }
////
////        for(int valor : idades) {
////            System.out.println(valor);
////        }
//
//    }
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    public static void declarar() {
//
//        //DECLARAÇÃO DE ARRAYS
//
//        String[] palavras;
//
//        long[] numeros;   // Declaração de um array para guardar variáveis do tipo boleano.
//
//        int[] idades;       // Declaração de um array para guardar variáveis do tipo int.
//
//        double pesos[];     // Declaração de um array para guardar variáveis do tipo double.
//
//        long[]tamanhos;     // Declaração de um array para guardar variáveis do tipo long.
//
//    }
//
//    public static void inicializar(){
//
//        boolean[] status;
//        int[] idades;
//        double pesos[];
//        long[] tamanhos;
//
//        char c;
//
//        status = new boolean[5];
//        idades = new int[10];           // Inicialização do array “idades”.
//        pesos = new double[50];         // Inicialização do array “pesos”.
//        tamanhos = new long[0];         // Inicialização do array “tamanhos”.
//
//        int[] numeros;
//        numeros = new int[]{1, 2, 5, 7, 5};
//        int[] numeros2 = {1, 2, 5, 7, 5};
//
//        numeros2 = new int[] {1, 2, 5, 7, 5};
//
//
////        int[] numeros3;
////        numeros3 = {1, 2, 5, 7, 5}        // Não compila
//
//        //todo array começa na posição 0
//        //todo array de tipo primtivo tem suas posicoes inicidadas o valor default do tipo em uso
//
//        //toda variavel declarada hipoteticamente estou criando uma caixinha pra colocar algo la dentro
//        //quando declaro um array com 5 posicóes, hipoteticamente estou criando 5 caixinhas juntas para guardar algo em cada uma
//
//    }
//
//    public static void acessar(){
//
//        // Coloca o valor 10 na primeira posicao do array idades.
//        int idades[] = new int[10]; //{ 10, 0, 0, 0, 0, 99, 0, 0, 0, 0}
//        idades[0] = 10;              // 0   1  2  3  4  5   6  7  8  9
//        idades[5] = 99;
//
//        System.out.println(idades[8] + " " + idades[0]);
//
//        // Coloca o valor 73.14 na última posicao do array pesos.
//        double pesos[] = new double[50];
//        pesos[49] = 73.14;
//
//        //todo array começa na posição 0
//        //todo array de tipo primtivo tem suas posicóes inicidadas o valor default do tipo em uso
//
//        // Erro de execução ao tentar acessar um posição que não existe. // ArrayIndexOutOfBoundsException
//        pesos[50] = 88.4;
//
//        //Consigo ver o tamanho do array
//        System.out.println(pesos.length);  // imprime 50
//
//    }
//
//    public static void percorrerLoopFor(){
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i);
//        }
//
//
//        int idades[] = new int[10];
//        for (int i = 0; i < idades.length; i++) {
//            if (idades[i] == 100){
//                System.out.println("Index do valor 100 é  : " + i);
//            }
//            System.out.println("Posição : " + i + " valor: " + idades[i]);
//        }
//
//        //Enhanced for
//        int index = 0;
//        for(int idade : idades) {
//            idade = idade + 5;
//            System.out.println(idade);
//        }
//
//    }
//
//
//    public static void loopWhile(){
//
////        while (CONDICAO) {
////            // CODIGO
////        }
//
//        int i = 1;
//        String dia = "segunda";
//
//        while (dia.equals("segunda")) {
//            i++;
//            if (i == 3){
//                dia = "terça";
//            }
//        }
//
//        int j = 1;
//        //Quando fica false?
//        while(true){
//            System.out.println(j);
//        }
//
//    }
//
//    public static void loopDoWhile(){
//
//        int i = 1;
//        do { //executa ao menos 1 vez
//            System.out.println(i);
//            i++;
//        } while (i < 10); // se der true, volta e executa novamente.COPIAR CÓDIGO
//
//    }
//
//    public static void breakAndContinue(){
//
//        int index = 1;
//        while (index < 10) {
//
//            index++;
//            if (index == 5) {
//              continue;
//            }
//            System.out.println(index);
//        }
//        System.out.println("Fim");
//
//        for (int i = 1; i < 10; i++) {
//            if (i == 8) {
//                break; // sai do for sem executar mais nada do laço.
//            }
//            if (i == 5) {
//                // pula para o proximo ciclo sem executar o resto do corpo.
//                continue;
//            }
//            System.out.println(i);
//        }
//
//    }
//
//}
