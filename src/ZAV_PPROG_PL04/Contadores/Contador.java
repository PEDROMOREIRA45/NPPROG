package ZAV_PPROG_PL04.Contadores;

public abstract class Contador {

    private String id;

    private String cliente;

    private double consumo;

    private final String ID_POR_OMISSAO ="SEMCONT";
    private final String CLIENTE_POR_OMISSAO ="SEM CLIENTE";
    private final double CONS_POR_OMISSAO = 0.0;


    public Contador (String id, String cliente, double consumo){
        this.id=id;
        this.cliente=cliente;
        this.consumo=consumo;
    }

    public Contador (){
        this.id=ID_POR_OMISSAO;
        this.cliente=CLIENTE_POR_OMISSAO;
        this.consumo=CONS_POR_OMISSAO;
    }

    public Contador(String s) {
        this.cliente=CLIENTE_POR_OMISSAO;
        this.consumo=CONS_POR_OMISSAO;
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
        return String.format("Contador %3d com o cliente %10s",id,cliente );
    }

    public abstract double calcularPreco();
}
