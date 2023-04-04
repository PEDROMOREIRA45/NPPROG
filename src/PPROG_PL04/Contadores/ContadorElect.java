package PPROG_PL04.Contadores;

public abstract class ContadorElect extends Contador {

    private static final String prefix = "GAS_";

    private static double totalContdElect = 0;

    public ContadorElect (String cliente, double consumo){
        super(prefix + (++totalContdElect), cliente, consumo);
    }

}
