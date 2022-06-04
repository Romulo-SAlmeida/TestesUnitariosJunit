package Calculadora;


public class CalculadoraComum extends Calculadora {



    //Metodo da adição
    public int adicao(){
        int a = 3;
        int b = 3;
        int result = a + b;
        return result;
    }

    //Metodo de subtração
    public int subtracao() {
        int a = 5;
        int b = 2;
        int result = a - b;
        return result;
    }

    //Metodo de mutiplicação
    public int mutiplicacao() {
        int a = 5;
        int b = 5;
        int result = a * b;
        return result;
    }

    //Metodo de divisão
    public int divisao() {
        int a = 5;
        int b = 5;
        int result = a / b;
        if(b == 0){
            System.out.println(a);
        }
        System.out.println(result);
        return result;
    }
}
