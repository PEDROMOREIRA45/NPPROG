package AV_PPROG_PL04.Contadores;

public class ContadoresElecBiHorar extends ContadorElect {

    private double potencia;

    private static double limitePot = 6.9;

    private static double custoKwhBaixo = 0.13;
    private static double custoKwhAlto = 0.16;

    public ContadoresElecBiHorar(String cliente, double consumo) {
        super(cliente, consumo);
    }

//    public ContadoresElecNormal (double potencia, String cliente, double consumo){
//        super(cliente, consumo);
//        this.potencia=potencia;
//    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double calcularPreco() {
        if (potencia > limitePot )
            return (((potencia-limitePot)*custoKwhAlto)+(limitePot*custoKwhBaixo));
        else
            return (limitePot*custoKwhBaixo);
    }

}
