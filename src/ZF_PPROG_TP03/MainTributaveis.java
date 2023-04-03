package ZF_PPROG_TP03;

public class MainTributaveis {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("22-33-CC",1000,"encarnado");
        System.out.println(v1);

        Veiculo v2 = new Veiculo("44-55-DD",2500,Cores.AZUL);
        System.out.println(v2);

        Veiculo v3 = new Veiculo("11-22-BB",1400,Cores.VERDE);
        System.out.println(v3);

        System.out.println();

        Moradia m1 = new Moradia("Rua do Bocage",90,Cores.CINZENTO);
        System.out.println(m1);

        Tributavel[] trib = new Tributavel[4];

        Cores c = v1;
        c = m1;

        trib[0] = v1;
        trib[1] = v2;
        trib[2] = v3;
        trib[3] = m1;

        for (int i = 0; i < trib.length; i++) {
            if (trib[i] != null) {
                System.out.println(trib[i].toString());
            }
        }

        for (int i = 0; i < trib.length; i++) {
            if (trib[i] != null) {
                System.out.println(trib[i].calcImposto());
            }
        }
        System.out.println();
        for (int i = 0; i < trib.length; i++) {
            if ((trib[i] != null) && (trib[i] instanceof Veiculo)) {
                System.out.println(trib[i].calcImposto());
            }
        }
        System.out.println();
        for (int i = 0; i < trib.length; i++) {
            if ((trib[i] != null) && (trib[i] instanceof Moradia)) {
                System.out.println(trib[i].calcImposto());
            }
        }

    }


}
