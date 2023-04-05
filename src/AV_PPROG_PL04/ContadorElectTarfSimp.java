package AV_PPROG_PL04;

public class ContadorElectTarfSimp extends ContadorElect{

    private double potencia;
    private static final double LIMITE_POT_CONTRAT = 0.6;
    private static final double CUST_INF = 0.13;
    private static final double CUST_SUP = 0.16;



    public ContadorElectTarfSimp(String cliente, double consumo, double potencia) {
        super(cliente, consumo);
        this.potencia=potencia;
    }

    public ContadorElectTarfSimp() {
        super();
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public double calcConsumo() {
        if (potencia<LIMITE_POT_CONTRAT)
            return (potencia*CUST_INF);
        else
            return ((potencia)*CUST_INF)+((potencia-LIMITE_POT_CONTRAT)*CUST_SUP);
    }

    public String toString() {
        return String.format("%30s tem o total de custo de %6.2f euros",super.toString(),calcConsumo());
    }
}
