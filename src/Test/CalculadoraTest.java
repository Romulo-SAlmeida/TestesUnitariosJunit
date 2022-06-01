package Test;

import Calculadora.Calculadora;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest extends Calculadora {


        //METODO DE ADIÇÃO
        @Test
        public void adicao(){
            int a = 5;
            int b = 5;
            int result = a + b;
            System.out.println(result);
            int expResult = 10;
            assertEquals(expResult, result, 0);
        }

        //Metodo de subtração
        @Test
        public void subtracao() {
            int a = 5;
            int b = 2;
            int result = a - b;
            System.out.println(result);
            int expResult = 3;
            assertEquals(expResult, result, 0);
        }

        //Metodo de mutiplicação
        @Test
        public void mutiplicacao() {
            int a = 5;
            int b = 5;
            int result = a * b;
            System.out.println(result);
            int expResult = 25;
            assertEquals(expResult, result, 0);
        }

        //Metodo de divisão
        @Test
        public void divisao() {
            int a = 5;
            int b = 5;
            int result = a / b;
            System.out.println(result);
            int expResult = 1;
            assertEquals(expResult, result, 0);
        }

        //Metodo de raiz
        @Test
        public void raiz() {
            double raizq = Math.sqrt(5);
            System.out.println(raizq);
            double expResult = raizq;
            assertEquals(expResult, raizq, 0);
        }

        //Metodo da potencia
        @Test
        public void potencia() {
            int a = 5;
            int b = 2;
            double expo = (Math.pow(a, b));
            System.out.println(expo);
            double expResult = expo;
            assertEquals(expResult, expo, 0);
        }

        //Metodo de seno
        @Test
        public void seno() {
            int angulo = 5;
            double rad = (Math.PI/180) * angulo;
            double seno = Math.sin(rad);
            System.out.println("\nO Seno do angulo " + angulo + " e: " + Math.sin(rad));
            int hip = 6;
            double result = seno*hip;
            System.out.println("Resultado final: "+result);
            double expResult = result;
            assertEquals(expResult, result, 0);
        }

        //Metodo do Cosseno
        @Test
        public void cosseno() {
            int angulo = 8;
            double rad = (Math.PI/180) * angulo;
            double cos = Math.sin(rad);
            System.out.println("\nO Seno do angulo " + angulo + " e: " + Math.sin(rad));
            int hip = 6;
            double result = cos*hip;
            System.out.println("Resultado final: "+result);
            double expResult = result;
            assertEquals(expResult, result, 0);
        }

        //Metodo da tangente
        @Test
        public void tangente() {
            int angulo = 6;
            double rad = (Math.PI/180) * angulo;
            double tangente = Math.tan(rad);
            System.out.println("\nA Tangente do angulo " + angulo + " e: " + Math.tan(rad));
            double catetoAdjacente = 8;
            double result = tangente * catetoAdjacente;
            System.out.println("Resultado Final: "+result);
            double expResult = result;
            assertEquals(expResult, result, 0);
        }

        //Metodo de logaritmo
        @Test
        public void logaritmo() {
            int numero = 9;
            double result = Math.log(numero);
            System.out.println(result);
            double expResult = result;
            assertEquals(expResult, result, 0);
        }



        }



