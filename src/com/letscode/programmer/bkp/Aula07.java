package com.letscode.programmer.bkp;

public class Aula07 {



//        • Uma tabela bi-dimensional representa uma matriz, com linhas e colunas.
//
//        • Cada elemento de uma tabela bi-dimensional é  referenciado usando dois índices: um para as linhas e
//                outro para as colunas.
//
//        • Na realidade, uma tabela bi-dimensional é uma tabela de tabelas, ou seja é uma tabela uni-dimensional em
//                que cada elemento é uma referência para um objecto tabela.
//
//        • Exemplo:
//        int[ ][ ] twoD = new int[3][5];



    public static void main(String[] args) {

        // Um array de duas dimensões.
        int[][] tabela;

        // Um array de três dimensões.
        int[][][] cubo;

        // Um array de quatro dimensões.
        int[][][][] hipercubo;

        // Perceba que as dimensões podem ser definidas do lado
        // esquerdo ou direito da variável.

        // Inicializando a primeira dimensão com 10 e a segunda com 4
        tabela = new int[10][4]; // seria 10 linhas e 4 colunas

        // Acessando a posição (0,1)
        System.out.println(tabela[0][1]);

        // Inicializando a primeira dimensão com 10 e deixando as outras
        // para serem iniciadas depois
        cubo = new int[10][][];

        int[][] estranha = new int[2][];
        estranha[0] = new int[20];
        estranha[1] = new int[10];

        for(int i=0;i<estranha.length;i++) {
            System.out.println(estranha[i].length); // imprime 20 e 10
        }

        int zyx[][][] = new int[3][10][7];

        //esse array tem 3 dimensoes
        //A na primeira dimensão tem 3 posicoes
        //As 3 primeiras posicões tem um array de 10 posicões
        //e todas as 10 posiçoes tem um array de 7 posicoes

        //O tamanho do array que ta na posicao 0, 1 e 2
        System.out.println(zyx[0].length);
        System.out.println(zyx[1].length);
        System.out.println(zyx[2].length);

        //O tamanho do array que ta na posicao 0 da primeia dimensao
        System.out.println(zyx[0][0].length);
        System.out.println(zyx[0][1].length);
        System.out.println(zyx[0][2].length);
        System.out.println(zyx[0][3].length);
        System.out.println(zyx[0][4].length);
        System.out.println(zyx[0][5].length);
        System.out.println(zyx[0][6].length);
        System.out.println(zyx[0][7].length);
        System.out.println(zyx[0][8].length);
        System.out.println(zyx[0][9].length);

        //o valor que ta na posicao 0 da primeira dimensao que ta psicao 0 da segunda dimensão,
        System.out.println(zyx[0][0][0]);
    }



}
