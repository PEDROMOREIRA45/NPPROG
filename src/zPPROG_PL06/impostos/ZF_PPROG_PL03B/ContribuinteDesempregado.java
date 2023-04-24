package zPPROG_PL06.impostos.ZF_PPROG_PL03B;

public class ContribuinteDesempregado extends Contribuinte {
    private float outroTrab;
    private int mesesParado;

    private static final float OUTROTRAB_POR_OMISSAO=0;
    private static final int MESESPARADO_POR_OMISSAO=24;

    private static double tax_outroTrab=0.02;


    public ContribuinteDesempregado(String nome, String morada, float outroTrab, int mesesParado) {
        super(nome, morada);
        this.outroTrab=outroTrab;
        this.mesesParado=mesesParado;
    }

    public ContribuinteDesempregado() {
        super();
        this.outroTrab=OUTROTRAB_POR_OMISSAO;
        this.mesesParado=MESESPARADO_POR_OMISSAO;
    }

    public float getOutroTrab() {
        return outroTrab;
    }

    public int getMesesParado() {
        return mesesParado;
    }

    public void setOutroTrab(float outroTrab) {
        this.outroTrab = outroTrab;
    }

    public void setMesesParado(int mesesParado) {
        this.mesesParado = mesesParado;
    }

    public static double getTax_outroTrab() {
        return tax_outroTrab;
    }

    public static void setTax_outroTrab(double tax_outroTrab) {
        ContribuinteDesempregado.tax_outroTrab = tax_outroTrab;
    }

    @Override
    public double carcularImposto() {
        return outroTrab*tax_outroTrab;
    }

    @Override
    public String toString() {
        return String.format("%30s Imposto: %8.2f",super.toString(), carcularImposto());
    }

    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        ContribuinteDesempregado outroContribuinteDesempregado =
                (ContribuinteDesempregado) outroObjeto;
        return outroTrab == outroContribuinteDesempregado.outroTrab
                && mesesParado == outroContribuinteDesempregado.mesesParado;
    }
}
