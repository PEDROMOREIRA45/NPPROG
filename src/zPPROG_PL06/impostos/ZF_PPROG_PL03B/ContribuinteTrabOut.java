package zPPROG_PL06.impostos.ZF_PPROG_PL03B;

public class ContribuinteTrabOut extends Contribuinte {
    private float rendTrab;
    private float outroTrab;
    private String nomeEmpresa;
    private static final float RENDTRAB_POR_OMISSAO=0;
    private static final float OUTROTRAB_POR_OMISSAO=0;
    private static final String NOMEEMPRESA_POR_OMISSAO="Sem Empresa";
    private static final double TAX_RENDTRAB_INF=0.01;
    private static final double TAX_RENDTRAB_SUP=0.02;
    private static final double TAX_OUTROTRAB=0.03;
    private static final double LIM_REND_MIN=30000;

    public ContribuinteTrabOut(String nome, String morada,float rendTrab,float outroTrab,String nomeEmpresa) {
        super(nome, morada);
        this.rendTrab=rendTrab;
        this.outroTrab=outroTrab;
        this.nomeEmpresa=nomeEmpresa;
    }

    public ContribuinteTrabOut() {
        super();
        this.rendTrab=RENDTRAB_POR_OMISSAO;
        this.outroTrab=OUTROTRAB_POR_OMISSAO;
        this.nomeEmpresa=NOMEEMPRESA_POR_OMISSAO;
    }

    public float getRendTrab() {
        return rendTrab;
    }

    public float getOutroTrab() {
        return outroTrab;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setRendTrab(float rendTrab) {
        this.rendTrab = rendTrab;
    }

    public void setOutroTrab(float outroTrab) {
        this.outroTrab = outroTrab;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public double carcularImposto() {
        if (rendTrab>LIM_REND_MIN)
            return rendTrab*TAX_RENDTRAB_SUP+outroTrab*TAX_OUTROTRAB;
        else
            return rendTrab*TAX_RENDTRAB_INF+outroTrab*TAX_OUTROTRAB;
    }

    @Override
    public String toString() {
        return String.format("%30s Imposto: %8.2f",super.toString(), carcularImposto());
    }

    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        ContribuinteTrabOut outroContribuinteTrabOut =
                (ContribuinteTrabOut) outroObjeto;
        return rendTrab == outroContribuinteTrabOut.rendTrab
                && outroTrab == outroContribuinteTrabOut.outroTrab
                && nomeEmpresa.equals(outroContribuinteTrabOut.nomeEmpresa);
    }

}
