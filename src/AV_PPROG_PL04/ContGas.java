package AV_PPROG_PL04;

public class ContGas extends Contador{
    private final String prefix ="GAS-";
    private static int numContGas =0;
    private static double custoM3=0.8;

    public ContGas (String cliente, double consumo){
        super("GAS-"+(++numContGas), cliente, consumo);
    }

    public ContGas (){
        super("prefix"+(++numContGas));
    }

    @Override
    public double calcConsumo() {
        return super.getConsumo()*custoM3;
    }

    public String toString() {
        return String.format("%30s tem o total de custo de %6.2f euros",super.toString(),calcConsumo());
    }
}
