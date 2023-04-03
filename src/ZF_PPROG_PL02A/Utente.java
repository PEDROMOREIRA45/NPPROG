package ZF_PPROG_PL02A;
public class Utente {
    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;

    private static String NOME_POR_OMISSAO = "Sem Nome";
    private static String GENERO_POR_OMISSAO = "M/F";
    private static int IDADE_POR_OMISSAO = 0;
    private static double ALTURA_POR_OMISSAO = 0.00;
    private static double PESO_POR_OMISSAO = 0.0;

    private int contUtentes=0;

    public Utente (){
        contUtentes++;
        this.nome=NOME_POR_OMISSAO;
        this.genero=GENERO_POR_OMISSAO;
        this.idade=IDADE_POR_OMISSAO;
        this.altura=ALTURA_POR_OMISSAO;
        this.peso=PESO_POR_OMISSAO;
    }
    public Utente (String nome, int idade){
        contUtentes++;
        this.nome=nome;
        this.genero=GENERO_POR_OMISSAO;
        this.idade=idade;
        this.altura=ALTURA_POR_OMISSAO;
        this.peso=PESO_POR_OMISSAO;
    }
     public Utente (String nome, String genero, int idade, double altura, double peso){
        contUtentes++;
        this.nome=nome;
        this.genero=genero;
        this.idade=idade;
        this.altura=altura;
        this.peso=peso;
    }

    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return String.format("O utente %10s é %7s com %3d anos tem %6.2f mtss e %6.2f kls",nome, genero, idade, altura, peso);
    }

    public int difIdades (Utente outroUtente) {
        return this.idade - outroUtente.idade;
    }

    public double calcIMC (){
        return peso/(altura*altura);
    }

    private static final int LIM_MAX_IMC=25;
    private static final int LIM_MIN_IMC=18;
    public String grauIMC (){
        if (calcIMC()<LIM_MIN_IMC)
            return "Magro";
        else if (calcIMC()>LIM_MAX_IMC)
            return "Obeso";
        else
            return "Saudavel";
    }

    public boolean verfSaudavel (){
        if (grauIMC().equals("Saudavel"))
            return true;
        else
            return false;
    }

    public int quantUtentes () {
        return contUtentes;
    }

    public String verfMaisNovo (Utente outroUtente){
        if (idade<outroUtente.idade)
            return nome;
        else if (idade>outroUtente.idade)
            return outroUtente.nome;
        else
            return"Mesma idade";
    }
}
