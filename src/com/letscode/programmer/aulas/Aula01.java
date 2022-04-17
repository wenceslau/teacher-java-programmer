//package com.letscode.programmer.bkp;
//
//public class Aula01 {
//
////    byte (1 byte): -128 a 127
////    short (2 bytes): -32.768 a 32.767
////    int (4 bytes): -2.147.483.648 a 2.147.483.647
////    long (8 bytes): -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
//
////    Byte -> byte
////    Integer -> int
////    Double -> double
////    Short -> short
////    Float -> float
////    Long -> long
////    Char -> char
////    Boolean -> boolean
//
//
////    float (4 bytes): aprox. +- 3.40282347E+38F (6-7 dígitos decimais significativos)
////    double (8 bytes): aprox. +- 1.797691313486231570E+308 (15 dígitos decimais significativos)
//
//
//    public static void main(String[] args) {
//
//        byte b = 127;
//        short numero1 = 32767;
//        int numero2 = 2147483647;
//        long numero3 = 922337203685477580L;
//
//        double numero4;
//        float numero5 = 10.01F;
//        numero4 = 10.10d;
//
//        char letraA = 'a';
//
//        boolean ativo = false;
//        Boolean ativo2 = true;
//
//        String palavra = "Olá pessoal";
//
//
//        final int NUMERO10 ;
//        NUMERO10 = 9;
//
//        MarcasEnum marca =  MarcasEnum.DELL;
//        System.out.println(marca);
//
//
//
//    }
//
//    public enum MarcasEnum {
//        AMAZON, DELL, HP, TOSHIBA, LG, SAMSUNG;
//    }
//
//    public enum Mes {
//
//        JANEIRO(1),
//        FEVEREIRO(2),
//        MARCO(3),
//        ABRIL(4),
//        MAIO(5),
//        JUNHO(6),
//        JULHO(7),
//        AGOSTO(8),
//        SETEMBRO(9),
//        OUTUBRO(10),
//        NOVEMBRO(11),
//        DEZEMBRO(12);
//
//        private int numeroMes;
//
//        Mes(int numeroMes) {
//            this.numeroMes = numeroMes;
//        }
//
//        public int getNumeroMes() {
//            return numeroMes;
//        }
//    }
//}
