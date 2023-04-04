package ZF_PPROG_PL02B;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    private static final int HORA_POR_OMISSAO=0;
    private static final int MINUTO_POR_OMISSAO=0;
    private static final int SEGUNDO_POR_OMISSAO=0;

    public Tempo (int hora, int minuto , int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tempo () {
        this.hora = HORA_POR_OMISSAO;
        this.minuto = MINUTO_POR_OMISSAO;
        this.segundo = SEGUNDO_POR_OMISSAO;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo(){
        return segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return String.format("%2d/%2d/%2d", hora, minuto,segundo);
    }

    public String visualTempoPMAM (){
        if (hora>12)
            return String.format("%2d:%2d:%2d PM", hora-12, minuto, segundo);
        else
            return String.format("%2d:%2d:%2d AM", hora, minuto,segundo);
    }

    public void acrescSegundo (){
        segundo++;
    }

    public boolean verifTempoMaior (Tempo outroTempo){
        int h1 = (this.hora*60*60)+(this.minuto*60)+(this.segundo);
        int h2 = (outroTempo.hora*60*60)+(outroTempo.minuto*60)+(outroTempo.segundo);
        if (h1>h2)
            return true;
        else
            return false;
    }

    public boolean verifTempoMaior (int hora, int minuto,int segundo){
        int h1 = (this.hora*60*60)+(this.minuto*60)+(this.segundo);
        int h2 = (hora*60*60)+(minuto*60)+(segundo);
        if (h1>h2)
            return true;
        else
            return false;
    }

    public int diferTempoSeg (Tempo outroTempo){
        int h1 = (this.hora*60*60)+(this.minuto*60)+(this.segundo);
        int h2 = (outroTempo.hora*60*60)+(outroTempo.minuto*60)+(outroTempo.segundo);
        if (h1>h2)
            return h1-h2;
        else
            return h2-h1;
    }

    public String diferTempo (Tempo outroTempo){
        int h1 = (this.hora*60*60)+(this.minuto*60)+(this.segundo);
        int h2 = (outroTempo.hora*60*60)+(outroTempo.minuto*60)+(outroTempo.segundo);
        int tempDif = h1-h2;
        int hdif = tempDif/(60*60);
        tempDif = tempDif%(60*60);
        int mdif = tempDif/(60);
        int sdif = tempDif%(60);
        if (h1>h2)
            return String.format("%2d:%2d:%2d",hdif,mdif,sdif);
        else
            return String.format("%2d:%2d:%2d",hdif*-1,mdif*-1,sdif*-1);
    }

}
