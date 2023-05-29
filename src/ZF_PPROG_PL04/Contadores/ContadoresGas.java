package ZF_PPROG_PL04.Contadores;

public class ContadoresGas extends Contador {

    private static final String prefix = "GAS_";

    private static double custoM3 = 0.8;

    private static double totalContdGas = 0;

    public double calcularPreco() {
        return super.getConsumo() * custoM3;
    }

    public ContadoresGas(String cliente, double consumo) {
        super(prefix + (++totalContdGas), cliente, consumo);
    }

    public ContadoresGas() {
        super(prefix + (++totalContdGas));
    }



    public static double getCustoM3() {
        return custoM3;
    }

    public static void setCustoM3(double custoM3) {
        ContadoresGas.custoM3 = custoM3;
    }

    @Override
    public String toString() {
        return String.format("tem o preço unitario de %6.2f e o total de custo de %6.2f euros",custoM3,calcularPreco());
    }
}
