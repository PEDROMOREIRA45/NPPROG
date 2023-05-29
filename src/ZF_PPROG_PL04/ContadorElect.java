package ZF_PPROG_PL04;

public abstract class ContadorElect extends Contador {
    private final String prefix ="ELECT-";
    private static int numContElect =0;

    public static int getNumContElect() {
        return numContElect;
    }

    public ContadorElect(String cliente, double consumo) {
        super("ELECT-"+(++numContElect), cliente, consumo);
    }

    public ContadorElect() {
        super("ELECT-"+(++numContElect));
    }

}
