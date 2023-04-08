package AV_PPROG_PL04B;

public class EstudanteBolseiro extends Estudante{

    private double bolsa;

    public EstudanteBolseiro(String nome, int numIdentCivil, double bolsa) {
        super(nome, numIdentCivil);
        this.bolsa=bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public double calcCusto() {
        return bolsa;
    }

    public String toString() {
        return String.format("%20s bolseiro",super.toString());
    }
}
