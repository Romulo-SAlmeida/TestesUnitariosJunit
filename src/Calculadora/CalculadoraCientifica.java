package Calculadora;

public class CalculadoraCientifica  extends CalculadoraComum {



    public CalculadoraCientifica() {
        this.setExpoente(getExpoente());
        this.setRaizQuadrada(getRaizQuadrada());
        this.setSeno(getSeno());
        this.setCosseno(getCosseno());
        this.setTangente(getTangente());
    }

    //Metodo de raiz
    public double raiz() {
        double raizq = Math.sqrt(5);
        return raizq;
    }

    //Metodo da expo
    public double expoente() {
        int a = 5;
        int b = 2;
        double expo = (Math.pow(a, b));
        return expo;
    }

    //Metodo de seno
    public double seno() {
        int angulo = 5;
        double rad = (Math.PI/180) * angulo;
        double seno = Math.sin(rad);
        System.out.println("\nO Seno do angulo " + angulo + " e: " + Math.sin(rad));
        int hip = 6;
        double result = seno*hip;
        System.out.println("Resultado final: "+result);
        return result;
    }

    //Metodo do Cosseno
    public double cosseno() {
        int angulo = 8;
        double rad = (Math.PI/180) * angulo;
        double cos = Math.sin(rad);
        System.out.println("\nO Seno do angulo " + angulo + " e: " + Math.sin(rad));
        int hip = 6;
        double result = cos*hip;
        System.out.println("Resultado final: "+result);
        return result;
    }

    //Metodo da tangente
    public double tangente() {
        int angulo = 6;
        double rad = (Math.PI/180) * angulo;
        double tangente = Math.tan(rad);
        System.out.println("\nA Tangente do angulo " + angulo + " e: " + Math.tan(rad));
        double catetoAdjacente = 8;
        double result = tangente * catetoAdjacente;
        System.out.println("Resultado Final: "+result);
        return result;
    }

    //Metodo de logaritmo
    public double logaritmo() {
        int numero = 9;
        double result = Math.log(numero);
        System.out.println(result);
        return result;
    }






}
