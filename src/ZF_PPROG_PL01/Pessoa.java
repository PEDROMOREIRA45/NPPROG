package ZF_PPROG_PL01;
public class Pessoa {
    private String nome;

    private int idade;

    public Pessoa (String nome){
    this.nome = nome;
    }

    public Pessoa (){
    }

    public Pessoa (String nome, int idade){
        this.nome=nome;
        this.idade= idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public String toString() {
//        return String.format("O nome é %10s", nome);
//    }

    public String toString() {
        return String.format("%10s tem %3d anos", nome, idade);
    }
}
