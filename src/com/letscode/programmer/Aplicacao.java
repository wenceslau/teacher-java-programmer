package com.letscode.programmer;

public class Aplicacao {

    public static String nomeAplicacao;

    public static void main(String[] args) {

        nomeAplicacao = "O nome da minha aplicação é App1";

        int resultado = calcular(10, 15);
        System.out.println(resultado);
        gerarLog("O resultado da minha soma foi " + resultado);
        gerarLog(null);
        //System.out.println(retorno);

    }

    public static int calcular(int valor1, int valor2) {
        gerarLog("Recebi dois valores" + valor1 +" e " + valor2 +" e vou somar...");

        return valor1 + valor2;
    }

    public static void gerarLog(String mensage){

        nomeAplicacao = "";

        if (mensage == null){
            System.out.println("o valor é null nao pode ser impresso");
            return;
        }

        System.out.println(mensage);
        //gravando log no arquivo
    }

}
