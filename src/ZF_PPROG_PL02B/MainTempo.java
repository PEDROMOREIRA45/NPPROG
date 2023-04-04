package ZF_PPROG_PL02B;

public class MainTempo {
    public static void main(String[] args) {
        Tempo t1 = new Tempo (5,30,12);
        System.out.println(t1.visualTempoPMAM());

        t1.acrescSegundo();
        System.out.println(t1.visualTempoPMAM());

        Tempo t2 = new Tempo (18,5,20);
        System.out.println(t2.visualTempoPMAM());

        System.out.println(t1.verifTempoMaior(t2));

        System.out.println(t1.verifTempoMaior(23,7,4));

        System.out.println(t1.diferTempoSeg(t2));

        System.out.println(t1.diferTempo(t2));
    }
}
