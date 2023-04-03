package ZF_PPROG_TP03;

public class Moradia implements Tributavel, Cores {

    private String morada;
    private float area;
    private String cor;

    public Moradia(String morada, float area, String cor) {
        this.morada = morada;
        this.area = area;
        this.cor = cor;
    }

    public String getMorada() {
        return morada;
    }

    public float getArea() {
        return area;
    }

    public String getCor() {
        return cor;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Moradia situada na %s com área de %.1f tem cor %s",
                morada, area, cor);
    }

    private static int fatorImposto = 2;

    public static int getFatorImposto() {
        return fatorImposto;
    }

    public static void setFatorImposto(int fatorImposto) {
        Moradia.fatorImposto = fatorImposto;
    }

    public double calcImposto (){
        return fatorImposto * area;
    }

}

