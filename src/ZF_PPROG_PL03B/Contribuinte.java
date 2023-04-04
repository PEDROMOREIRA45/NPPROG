package ZF_PPROG_PL03B;
public abstract class Contribuinte {
    private String nome;
    private String morada;

    private static final String NOME_POR_OMISSAO ="Sem Nome";
    private static final String MORADA_POR_OMISSAO ="Sem Morada";

    public Contribuinte (String nome, String morada){
        this.nome=nome;
        this.morada=morada;
    }

    public Contribuinte (){
        this.nome=NOME_POR_OMISSAO;
        this.morada=MORADA_POR_OMISSAO;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    @Override
    public String toString() {
        return String.format("Nome: %10s morada: %15s",nome, morada);
    }

    public abstract double carcularImposto();
}
