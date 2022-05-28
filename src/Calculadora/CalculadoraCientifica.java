package Calculadora;

public class CalculadoraCientifica  extends CalculadoraComum {

    private int  raizQuadrada;
    private double expoente, seno, cosseno, tangente, logaritmo;
    public CalculadoraCientifica(int adicao,int subtracao, int divisao, int multiplicacao, double expoente, int raizQuadrada, double seno,
                                 double cosseno, double tangente, double logaritmo) {
        super();
        this.expoente = expoente;
        this.raizQuadrada = raizQuadrada;
        this.seno = seno;
        this.cosseno = cosseno;
        this.tangente = tangente;
    }

    public double getExpoente() {
        return expoente;
    }

    public void setExpoente(double expoente) {
        this.expoente = expoente;
    }

    public int getRaizQuadrada() {
        return raizQuadrada;
    }

    public void setRaizQuadrada(int raizQuadrada) {
        this.raizQuadrada = raizQuadrada;
    }

    public double getSeno() {
        return seno;
    }

    public void setSeno(double seno) {
        this.seno = seno;
    }

    public double getCosseno() {
        return cosseno;
    }

    public void setCosseno(double cosseno) {
        this.cosseno = cosseno;
    }

    public double getTangente() {
        return tangente;
    }

    public void setTangente(double tangente) {
        this.tangente = tangente;
    }

    public double getLogaritmo() {
        return logaritmo;
    }
    public void setLogaritmo(double logaritmo) {
        this.logaritmo = logaritmo;
    }



}
