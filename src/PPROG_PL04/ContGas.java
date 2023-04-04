package PPROG_PL04;

public class ContGas extends Contador{
    private final String prefix ="GAS-";
    private static int numContGas =0;
    private double custo;

    public ContGas (String id, String cliente, double consumo, double custo){
        numContGas++;
        super(id);
        super(cliente);
    }


    @Override
    public double calcConsumo() {
        return 0;
    }
}
