package ZF_PPROG_PL09;

public class MesInvalidoException extends IllegalArgumentException {

    public MesInvalidoException() {
        super("Mês é inválido!!");
    }

    public MesInvalidoException(String mensagem) {
        super(mensagem);
    }

}