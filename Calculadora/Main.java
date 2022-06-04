package Calculadora;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        //instanciando as classes e metodos
        CalculadoraComum cal1 = new CalculadoraComum();
        CalculadoraCientifica cal2 = new CalculadoraCientifica();


        //Inicio do programa
        System.out.println("***Bem vindo***");
        System.out.println("Escolha 1 para Comum\n" +
                "Escolha 2 para cientifica");
        System.out.println("Escolha a calculadora que você gostaria de ver a iplementação");
        int escolhaprincipal = ler.nextInt();



        //OPERAÇÕES BASICAS DA CALCULADORA COMUM;
        if (escolhaprincipal == 1){
            System.out.println("Bem vindo a calculadora basica");
            System.out.println("Digite 1 para soma\n" +
                    "Digite 2 para subtraçao\n" +
                    "Digite 3 para multiplicação\n" +
                    "Digite 4 para divisão");
            int escolhasec = ler.nextInt();
        if (escolhasec == 1){
            System.out.println("O resultado impresso é: "+cal1.adicao());
        }
            if (escolhasec == 2){
                System.out.println("O resultado impresso é: "+cal1.subtracao());
            }
            if (escolhasec == 3){
                System.out.println("O resultado impresso é: "+cal1.mutiplicacao());
            }
            if (escolhasec == 4){
                System.out.println("O resultado impresso é: "+cal1.divisao());
            }

        }


        //OPERAÇÕES DA CALCULADORA CIENTIFICA
        if (escolhaprincipal == 2){
            System.out.println("Bem vindo a calculadora basica");
            System.out.println("Digite 1 para soma\n" +
                    "Digite 2 para subtraçao\n" +
                    "Digite 3 para multiplicação\n" +
                    "Digite 4 para divisão\n" +
                    "Digite 5 para raiz\n" +
                    "Digite 6 para expoente\n" +
                    "Digite 7 para seno\n" +
                    "Digite 8 para cosseno\n" +
                    "Digite 9 para tangente\n" +
                    "Digite 10 para logaritmo\n");
            int escolhasec = ler.nextInt();
            if (escolhasec == 1){
                System.out.println("O resultado impresso é: "+cal2.adicao());
            }
            if (escolhasec == 2){
                System.out.println("O resultado impresso é: "+cal2.subtracao());
            }
            if (escolhasec == 3){
                System.out.println("O resultado impresso é: "+cal2.mutiplicacao());
            }
            if (escolhasec == 4){
                System.out.println("O resultado impresso é: "+cal2.divisao());
            }
            if (escolhasec == 5){
                System.out.println("O resultado impresso é: "+cal2.raiz());
            }
            if (escolhasec == 6){
                System.out.println("O resultado impresso é: "+cal2.expoente());
            }
            if (escolhasec == 7){
                System.out.println("O resultado impresso é: "+cal2.seno());
            }
            if (escolhasec == 8){
                System.out.println("O resultado impresso é: "+cal2.cosseno());
            }
            if (escolhasec == 9){
                System.out.println("O resultado impresso é: "+cal2.tangente());
            }
            if (escolhasec == 10){
                System.out.println("O resultado impresso é: "+cal2.logaritmo());
            }

        }







    }
}
