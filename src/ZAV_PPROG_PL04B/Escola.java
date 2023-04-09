package ZAV_PPROG_PL04B;
public abstract class Escola {
    private String nome;
    private int numIdentCivil;

    private final String NOME_POR_OMISSO="Sem Nome";
    private final int NUMINDCIV_POR_OMISSAO=0;

    public Escola (String nome,int numIdentCivil){
        this.nome=nome;
        this.numIdentCivil=numIdentCivil;
    }

    public String getNome() {
        return nome;
    }

    public int getNumIdentCivil() {
        return numIdentCivil;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumIdentCivil(int numIdentCivil) {
        this.numIdentCivil = numIdentCivil;
    }

    @Override
    public String toString() {
        return String.format("%8s numident: %8d", nome, numIdentCivil);
    }

    public abstract double calcCusto ();
}
