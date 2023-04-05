package PPROG_PL04;

public class ContadoresElecBiHorar extends ContadorElect{

    private double potenciaVazio;
    private double potenciaForaVazio;
    private static final double CUST_VAZIO = 0.066;
    private static final double CUST_FORAVAZIO = 0.14;

    public ContadoresElecBiHorar(String cliente,double consumo,double potenciaVazio,double potenciaForaVazio){
        super(cliente, consumo);
    }

    public ContadoresElecBiHorar(){
        super();
    }

    public double getPotenciaVazio() {
        return potenciaVazio;
    }

    public double getPotenciaForaVazio() {
        return potenciaForaVazio;
    }

    public void setPotenciaVazio(double potenciaVazio) {
        this.potenciaVazio = potenciaVazio;
    }

    public void setPotenciaForaVazio(double potenciaForaVazio) {
        this.potenciaForaVazio = potenciaForaVazio;
    }

    @Override
    public double calcConsumo() {
        return ((potenciaVazio*CUST_VAZIO)+(potenciaForaVazio*CUST_FORAVAZIO));
    }

    public String toString() {
        return String.format("%30s tem o total de custo de %6.2f euros",super.toString(),calcConsumo());
    }


}
