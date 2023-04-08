package AV_PPROG_PL04B;

public class EstudanteSemBolsa extends Estudante{

    public EstudanteSemBolsa(String nome, int numIdentCivil) {
        super(nome, numIdentCivil);
    }

    @Override
    public double calcCusto() {
        return 0;
    }

    public String toString() {
        return String.format("%20s não bolseiro",super.toString());
    }
}
