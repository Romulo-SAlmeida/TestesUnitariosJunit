package Calculadora;

import java.util.Scanner;

import Calculadora.CalculadoraComum;
import Calculadora.Calculadora;
import Calculadora.CalculadoraCientifica;

public class Main {
    public static void main(String[] args) {

        //instanciando as classes e metodos
        Calculadora cal3 = new Calculadora();
        CalculadoraComum cal1 = new CalculadoraComum();
        CalculadoraCientifica cal2 = new CalculadoraCientifica(0, 0, 0, 0, 0, 0, 0, 0, 0,0);

        Scanner scan = new Scanner(System.in);

        //Inicio do programa

        System.out.println("***Bem vindo***");
        System.out.println("  ");
        System.out.println("Escolha o tipo de  calculadora que vôce ultilizará\n"
                + "\nComum(Adição, Subtração, Multiplicação, Divisão)"
                + "\nCientífica(Adição, Subtração, Multiplicação, Divisão, Expoente, Raiz"
                + " Quadrada, Seno, Cosseno, Tangente e Logaritmo) ");
        String tipoCal = scan.next();
//		int tipo = scan.nextInt();

        if(tipoCal.equalsIgnoreCase("comum")) {
            System.out.println("***Bem vindo***");
            System.out.println("  ");
            System.out.println("Escolha o tipo de operação desejada pelo caracter\n");
            System.out.println("+ = Adição\n"
                    +"- = Subtração\n"
                    + "* = Multiplicação\n"
                    + "/ = Divisão\n");
            String caracter = scan.next();
            if(caracter.equals("+") || caracter.equalsIgnoreCase("adição")) {
                cal3.adicao();
            }else if(caracter.equals("-") || caracter.equalsIgnoreCase("subtração")) {
                cal3.subtracao();
            }else if(caracter.equals("*") || caracter.equalsIgnoreCase("multiplicação")) {
                cal3.mutiplicacao();
            }else if (caracter.equals("/") || caracter.equalsIgnoreCase("divisão")) {
                cal3.divisao();
            }




        }else if(tipoCal.equalsIgnoreCase("Cientifica")){
            System.out.println("***Bem vindo***");
            System.out.println("   ");
            System.out.println("Escolha e digite o nome da operação desejada:\n");
            System.out.println("Adição\n"
                    +"Subtração\n"
                    +"Multiplicação\n"
                    +"Divisão\n"
                    +"Raiz\n"
                    +"Potência\n"
                    +"Seno\n"
                    +"Cosseno\n"
                    +"Tangente\n"
                    +"Logaritmo\n");
            String tipoOperacao = scan.next();

            if( tipoOperacao.equalsIgnoreCase("adição")) {
                cal3.adicao();
            }else if( tipoOperacao.equalsIgnoreCase("subtração")) {
                cal3.subtracao();
            }else if( tipoOperacao.equalsIgnoreCase("multiplicação")) {
                cal3.mutiplicacao();
            }else if (  tipoOperacao.equalsIgnoreCase("divisão")) {
                cal3.divisao();
            }if( tipoOperacao.equalsIgnoreCase("Raiz")) {
                cal3.raiz();
            }else if( tipoOperacao.equalsIgnoreCase("Potência")) {
                cal3.potencia();
            }else if( tipoOperacao.equalsIgnoreCase("seno")) {
                cal3.seno();
            }else if (  tipoOperacao.equalsIgnoreCase("cosseno")) {
                cal3.cosseno();
            }else if( tipoOperacao.equalsIgnoreCase("tangente")) {
                cal3.tangente();
            }else if (  tipoOperacao.equalsIgnoreCase("logaritmo")) {
                cal3.logaritmo();
            }



        }else {
            System.out.println("Nome incorreto digitado");
            cal3.inicio();
        }



    }
}
