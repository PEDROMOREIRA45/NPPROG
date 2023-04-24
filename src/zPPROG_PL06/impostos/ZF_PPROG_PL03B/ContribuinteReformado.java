package zPPROG_PL06.impostos.ZF_PPROG_PL03B;

public class ContribuinteReformado extends Contribuinte {
    private float rendTrab;
    private float outroTrab;

    private static final float RENDTRAB_POR_OMISSAO=0;
    private static final float OUTROTRAB_POR_OMISSAO=0;

    private static final double TAX_RENDTRAB=0.01;
    private static final double TAX_OUTROTRAB=0.03;

    public ContribuinteReformado(String nome, String morada,float rendTrab,float outroTrab) {
        super(nome, morada);
        this.rendTrab=rendTrab;
        this.outroTrab=outroTrab;
    }

    public ContribuinteReformado() {
        super();
        this.rendTrab=RENDTRAB_POR_OMISSAO;
        this.outroTrab=OUTROTRAB_POR_OMISSAO;
    }


    public float getRendTrab() {
        return rendTrab;
    }

    public float getOutroTrab() {
        return outroTrab;
    }

    public void setRendTrab(float rendTrab) {
        this.rendTrab = rendTrab;
    }

    public void setOutroTrab(float outroTrab) {
        this.outroTrab = outroTrab;
    }

    public double carcularImposto(){
        return rendTrab*TAX_RENDTRAB+outroTrab*TAX_OUTROTRAB;
    }

    @Override
    public String toString() {
        return String.format("%30s Imposto: %8.2f",super.toString(), carcularImposto());
    }

    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        ContribuinteReformado outroContribuinteReformado =
                (ContribuinteReformado) outroObjeto;
        return rendTrab == outroContribuinteReformado.rendTrab
                && outroTrab == outroContribuinteReformado.outroTrab;
    }
}
