package AV_PPROG_PL04B;

public class Professor extends Escola{
    private String categoria;

    private double salarioBase=1500.00;

    private double majorAdjunto=0.2;

    private double majorCoordenad=0.5;

    public Professor(String nome, int numIdentCivil) {
        super(nome, numIdentCivil);
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getMajorAdjunto() {
        return majorAdjunto;
    }

    public double getMajorCoordenad() {
        return majorCoordenad;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setMajorAdjunto(double majorAdjunto) {
        this.majorAdjunto = majorAdjunto;
    }

    public void setMajorCoordenad(double majorCoordenad) {
        this.majorCoordenad = majorCoordenad;
    }

    @Override
    public double calcCusto() {
        if (categoria.equals("Coordenador"))
            return salarioBase*(1+majorCoordenad);
        else if (categoria.equals("Adjunto"))
            return salarioBase*(1+majorAdjunto);
        else
            return salarioBase;
    }
}
