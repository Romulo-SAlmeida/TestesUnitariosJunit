package Calculadora;

import java.util.Scanner;
public class Calculadora {

    Scanner scan = new Scanner(System.in);
    public CalculadoraComum cal1 = new CalculadoraComum();
    CalculadoraCientifica cal2 = new CalculadoraCientifica(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);




    //Metodo da adição
    public void adicao(){
        int a = 5;
        int b = 5;
        int result = a + b;
        System.out.println(result);
    }

    //Metodo de subtração
    public void subtracao() {
        int a = 5;
        int b = 2;
        int result = a - b;
        System.out.println(result);
    }

    //Metodo de mutiplicação
    public void mutiplicacao() {
        int a = 5;
        int b = 5;
        int result = a * b;
        System.out.println(result);
    }

    //Metodo de divisão
    public void divisao() {
        int a = 5;
        int b = 4;
        int result = a / b;
        if(b == 0){
            System.out.println(a);
        }
        System.out.println(result);
    }

    //Metodo de raiz
    public void raiz() {
        double raizq = Math.sqrt(5);
        System.out.println(raizq);
    }

    //Metodo da potencia
    public void potencia() {
        int a = 5;
        int b = 2;
        double expo = (Math.pow(a, b));
        System.out.println(expo);
    }

    //Metodo de seno
    public void seno() {
        int angulo = 5;
        double rad = (Math.PI/180) * angulo;
        double seno = Math.sin(rad);
        System.out.println("\nO Seno do angulo " + angulo + " e: " + Math.sin(rad));
        int hip = 6;
        double result = seno*hip;
        System.out.println("Resultado final: "+result);
    }

    //Metodo do Cosseno
    public void cosseno() {
        int angulo = 8;
        double rad = (Math.PI/180) * angulo;
        double cos = Math.sin(rad);
        System.out.println("\nO Seno do angulo " + angulo + " e: " + Math.sin(rad));
        int hip = 6;
        double result = cos*hip;
        System.out.println("Resultado final: "+result);
    }

    //Metodo da tangente
    public void tangente() {
        int angulo = 6;
        double rad = (Math.PI/180) * angulo;
        double tangente = Math.tan(rad);
        System.out.println("\nA Tangente do angulo " + angulo + " e: " + Math.tan(rad));
        double catetoAdjacente = 8;
        double result = tangente * catetoAdjacente;
        System.out.println("Resultado Final: "+result);
    }

    //Metodo de logaritmo
    public void logaritmo() {
        int numero = 9;
        double result = Math.log(numero);
        System.out.println(result);
    }


    public void inicio() {
        //Extanciando as classes e metodos
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
//			int tipo = scan.nextInt();

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
