package PPROG_PL04;

public abstract class Contador {
    private String id;
    private String cliente;
    private double consumo;

    private static final String ID_POR_OMISSAO="Sem ID";
    private static final String CLIENTE_POR_OMISSAO ="Sem nome";
    private static final double CONSUMO_POR_OMISSAO=0;

    public Contador (String id, String cliente, double consumo){
       this.id= id;
       this.cliente= cliente;
       this.consumo= consumo;
    }

    public Contador (String id){
        this.id= id;
        this.cliente= CLIENTE_POR_OMISSAO;
        this.consumo= CONSUMO_POR_OMISSAO;
    }



    public String getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return String.format("Consumidor %8s com identificação %6s",cliente, id);
    }

    public abstract double calcConsumo ();
}
