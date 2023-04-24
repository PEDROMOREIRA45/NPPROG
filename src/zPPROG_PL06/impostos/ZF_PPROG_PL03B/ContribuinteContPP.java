package zPPROG_PL06.impostos.ZF_PPROG_PL03B;

public class ContribuinteContPP extends Contribuinte {
    private float rendTrab;
    private float outroTrab;
    private String profissao;

    private static final float RENDTRAB_POR_OMISSAO=0;
    private static final float OUTROTRAB_POR_OMISSAO=0;
    private static final String PROFISSAO_POR_OMISSAO="Sem Profissao";

    private static final double TAX_OUTROTRAB_INF=0.02;
    private static final double TAX_OUTROTRAB_SUP=0.05;
    private static final double TAX_RENDTRAB=0.03;
    private static final double LIM_REND_MIN=50000;

    public ContribuinteContPP(String nome, String morada, float rendTrab, float outroTrab, String profissao) {
        super(nome, morada);
        this.rendTrab=rendTrab;
        this.outroTrab=outroTrab;
        this.profissao=profissao;
    }

    public ContribuinteContPP() {
        super();
        this.rendTrab=RENDTRAB_POR_OMISSAO;
        this.outroTrab=OUTROTRAB_POR_OMISSAO;
        this.profissao=PROFISSAO_POR_OMISSAO;
    }

    public float getRendTrab() {
        return rendTrab;
    }

    public float getOutroTrab() {
        return outroTrab;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setRendTrab(float rendTrab) {
        this.rendTrab = rendTrab;
    }

    public void setOutroTrab(float outroTrab) {
        this.outroTrab = outroTrab;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public double carcularImposto() {
        if (outroTrab>LIM_REND_MIN)
            return rendTrab*TAX_RENDTRAB+outroTrab*TAX_OUTROTRAB_SUP;
        else
            return rendTrab*TAX_RENDTRAB+outroTrab*TAX_OUTROTRAB_INF;
    }

    @Override
    public String toString() {
        return String.format("%30s Imposto: %8.2f",super.toString(), carcularImposto());
    }

    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        ContribuinteContPP outroContribuinteContPP =
                (ContribuinteContPP) outroObjeto;
        return rendTrab == outroContribuinteContPP.rendTrab
                && outroTrab == outroContribuinteContPP.outroTrab
                && profissao.equals(outroContribuinteContPP.profissao);
    }
}
