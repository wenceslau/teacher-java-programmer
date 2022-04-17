package com.letscode.programmer.aulas;

import java.util.Scanner;

enum FasesDaLua{
    CHEIA, MINGUANTE, CRESCENTE, NOVA
}

public class Aula5 {



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try {

            String fase = sc.nextLine();
            FasesDaLua faseLua = FasesDaLua.valueOf(fase);
            switch (faseLua) {
                case CHEIA:
                    System.out.println("CHEIA");
                    break;
                case NOVA:
                    System.out.println("NOVA");
                    break;
                case CRESCENTE:
                    System.out.println("CRESCENTE");
                    break;
                default:
                    System.out.println("Fase desconhecido");

            }

        } catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());

        }



    }


    public static void ifElse(){

        boolean autentico = true;
        if (autentico) {
            System.out.println("Usuario aceito");
        } else {
            System.out.println("Usuario incorreto");
        }

        int numero = 10;

        if (numero == 10) {
            System.out.println("Numero 10");

        } else if (numero == 11) {
            System.out.println("Numero 11");

        } else if (numero == 12) {
            System.out.println("Numero 12");

        } else {
            System.out.println("Numero desconhecido");

        }
    }

    public static void switchCase(){

        int numero = 12;
        int numero2 = 12;
        int numero3 = numero + numero2;

        String nome = "Ana";

        if (numero3 == 1){
            System.out.println("Numero 10");
        }

        switch (numero3) {
            case 1:
                System.out.println("Numero 10");
            case 2:
                System.out.println("Numero 11");
            case 3:
                System.out.println("Numero 12");
            default:
                System.out.println("Numero desconhecido");

        }
    }
}

