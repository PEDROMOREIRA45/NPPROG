package ZF_PPROG_PL04;

public class ContadoresElecBiHorar extends ContadorElect{

    private double horasVazio;
    private double horasForaVazio;
    private static final double CUST_VAZIO = 0.066;
    private static final double CUST_FORAVAZIO = 0.14;

    public ContadoresElecBiHorar(String cliente,double consumo,double potenciaVazio,double potenciaForaVazio){
        super(cliente, consumo);
    }

    public ContadoresElecBiHorar(){
        super();
    }

    public double getPotenciaVazio() {
        return horasVazio;
    }

    public double getHorasForaVazio() {
        return horasForaVazio;
    }

    public void setPotenciaVazio(double potenciaVazio) {
        this.horasVazio = potenciaVazio;
    }

    public void setHorasForaVazio(double horasForaVazio) {
        this.horasForaVazio = horasForaVazio;
    }

    @Override
    public double calcConsumo() {
        return ((horasVazio *CUST_VAZIO)+(horasForaVazio *CUST_FORAVAZIO));
    }

    public String toString() {
        return String.format("%30s tem o total de custo de %6.2f euros",super.toString(),calcConsumo());
    }


}
