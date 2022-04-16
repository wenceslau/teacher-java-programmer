//package com.letscode.programmer.bkp;
//
//public class Aula02 {
//
//    // Comentario de uma Linha
//
//    /* Comentario de Bloco */
//
//    /**
//     * Comentario de Javadoc
//     */
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    /*
//        Metodo Main,
//        O metodo que inicia a execução de uma aplicação java
//     */
//    public static void main(String[] args) {
//        System.out.println("Olá pessoal. Operadores....");
//
//        int a = 10;
//        int b = a;
//        a += ((++b) + b + (++b));
//            // (11) + 11 + (12);
//
//        System.out.println(b);
//
//    }
//
//        /*
//            Operadores:
//
//            Atribuição
//            Aritmeticos
//            Comparadores
//            Logicos
//            Decrementeos e incrementos
//            Ternario/condicional
//
//         */
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    public static void operadoesAtribuicao() {
//
//        long idade = 0L; // compila
//        System.out.println(idade);
//
////        // não compila, onde está o valor?
////        long idade = ;
////
////        // não compila, onde está o nome da variável?
////        long = 15;
//
//    }
//
//    public static void operadoesAritmeticos() {
//
//        int dois = 2;
//        int dez = 10;
//
//        double res = 10.0/3;
//
//        // Fazendo uma soma com o operador "+".
//        int doze = dois + dez;
//        System.out.println(doze);
//
//        // Fazendo uma subtração com o operador "-".
//        int oito = dez - dois;
//        System.out.println(oito);
//
//        // Fazendo uma multiplicação com o operador "*".
//        int vinte = dois * dez;
//        System.out.println(vinte);
//
//        // Fazendo uma divisão com o operador "/".
//        int cinco = dez / dois;
//        System.out.println(cinco);
//
//    }
//
//    public static void comparadores() {
//
//
////        ==  igual
////        !=  diferente
////        >  maior
////        <  menor
////        >=  maior ou igual
////        <=  menor ou igual
//
//
//        System.out.println(1 == 1.0);        // true.
//        System.out.println(1 != 1);        // false.
//        System.out.println(2 < 1);        // false.
//        System.out.println(2 > 1);        // true.
//        System.out.println(1 >= 1);        // true.
//        System.out.println(2 <= 1);        // false.
//
//        //Comparaçao de objetos se da pelo metodo equals() do objeto
//
//        String nome = "10.0";
//
//
//        System.out.println(nome.equalsIgnoreCase("10"));              // false.
//        System.out.println(nome.equals("Nelson"));          // false.
//
//        // Quando se sua == para comparar string
//        // o compilador irá comparar as duas referências e ver se apontam para o mesmo objeto
//
//        // true.
//        System.out.println(1 == 1.0);
//
//        // true.
//        System.out.println(1 == 1);
//
//        // true. 1.0 float é 1.0 double
//        System.out.println(1.0f == 1.0d);
//
//        // true. 1.0 float é 1 long
//        System.out.println(1.0f == 1l);
//
//        double n1 = 1.1;
//        int n2 = 1;
//        int n3 = (int) n1;
//
//        System.out.println(n1 == n3);
//
//
//
//        // não compila, tipo não primitivo só aceita != e ==
//        //System.out.println("Joao" > "Jonas");
//
//        // não compila, boolean só aceita != e ==
//        //System.out.println(true < false);
//
//        int num = 5;
//        System.out.println(num = 5); // não imprime true, imprime 5
//
//    }
//
//    public static void operadoresLogicos() {
//
//        //And (a=1 && b=b) = verdade
//        //And (a=1 && b=c) = falsa
//        //And (a=1 && c=c) = falsa
//
//        //Or ||
//
//        // &
//        // |
//
//        System.out.println(1 == 1 && 1 > 2);     // false.
//        System.out.println(1 == 1 || 2 > 1);     // true.
//        System.out.println(!(1 == 1));          // true.
//
//        System.out.println(1 != 1 && 1 > 2);
//        // false, o segundo termo não é avaliado. Porque o resultado esperado é que as 2 condiçoes seja satisfatoria
//
//        System.out.println(1 == 1 || 2 > 1);
//        // true, o segundo termo não é avaliado. Porque o resultado esperado é que ao menos uma das 2 condiçoes seja satisfatoria
//
//        boolean valor = false;
//        if (!valor){
//            System.out.println("");
//        }
//    }
//
//    public static void incrementosDecrementos() {
//
//        int num = 5;
//        System.out.println(num++);      // imprime 5 - e depois incrementa, num agora vale 6
//
//        System.out.println(num--);      // imprime 6 -  e depois decrementa, num agora vale 5
//
//        System.out.println(num);        // 5
//
//        System.out.println("=======");
//
//        int num2 = 5;
//        System.out.println(++num2);     // imprime 6 porque incrementou antes de imprimir
//
//        System.out.println(--num2);     // imprime 5 - porque decremento antes de imprimir
//
//        System.out.println(num);        // 5
//
//
//        //////////////////////////////////////////////////////////////////
//
//        int b = 10;
//
//        // para somar 2 em a
//        b = b + 2;
//
//        //podemos obter o mesmo resultado com:
//        b += 2;
//
//        //exemplos de operadores:
//        int i = 5;
//
//        i += 10; //soma e atribui
//        System.out.println(i);        // 15
//
//        i -= 10; //subtrai e atribui
//        System.out.println(i);        // 5
//
//        i *= 3; // multiplica e atribui
//        System.out.println(i);        // 15
//
//        i /= 3; // divide a atribui
//        System.out.println(i);        // 5
//
//        i =1 ;
//        System.out.println(i += 3); // soma 3 e retorna o resultado: 4
//
//        String nome = "Homer";
//        nome += "Simpson";          //HomerSimpson
//
//        System.out.println(nome);
//
//        int a = 10;
//        a += ++a + a + ++a;  //11 + 11 + 12 = 34 + 10 = 44
//
//        a += ++a + a + ++a;
//        a = a + ++a + a + ++a;
//        a = 10 + 11 + a + ++a;
//        a = 10 + 11 + 11 + ++a;
//        a = 10 + 11 + 11 + 12;
//
//        //Qual valor de a ?
//
//        System.out.println(a);
//
//        int c = 15, d = 20, e = 30;
//        c = (d = e + 5) + 5;        // e = 30, portanto d = 35, portanto c = 40
//
//    }
//
//    public  static void operadorTernárioCondicional(){
//
//
//        // (condiçao ? se verdadeiro : se falso)
//
//        int i = 5;
//        System.out.println(i == 5 ? "verdadeiro" : "falso");// verdadeiro
//        System.out.println(i != 5 ? 1 : 2);                   // 2
//
//        String mensagem = i % 2 == 0 ? "é par" : "é ímpar";
//        System.out.println(mensagem);
//
//        // A % B
//        //Onde A é o dividendo and B é o divisor
//
//        //Qualquer numero A % B  sendo calculado onde B (divisor) é 2, o resultado sera 0 ou 1
//
//        int r1 = 3 % 2; // resultado = 1
//        int r2 = 8 % 2; // resultado = 0
//        int r3 = 19 % 2; // resultado = 1
//        int r4 = 188 % 2; // resultado = 0
//
//        //Qualquer numero A % B  sendo calculado onde B (divisor) é diferente de 2, o resultado sera o resto da divisão
//        //15 % 6 significa que quando dividimos 15 (numerador) por 6 (denominador), obtemos o resto 3
//
//        int r6 = 15 % 6; // resultado = 3
//        int r7 = 30 % 4; // resultado = 2
//
//    }
//
//}
