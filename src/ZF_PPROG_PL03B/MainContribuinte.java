package ZF_PPROG_PL03B;

public class MainContribuinte {
    public static void main(String[] args) {
        ContribuinteReformado c1 = new ContribuinteReformado("Paulo Silva","Rua bernardino",(float)60000.00,(float)30000.00);
        ContribuinteReformado c2 = new ContribuinteReformado();
        System.out.println(c1);
        System.out.println(c2);

        ContribuinteContPP c3 =new ContribuinteContPP("Rita Marques","Rua de Cima",(float) 50000,(float) 30000,"Medica");
        ContribuinteContPP c4 =new ContribuinteContPP();
        System.out.println(c3);
        System.out.println(c4);

        ContribuinteTrabOut c5 = new ContribuinteTrabOut("Rui Vizela","Rua S Joao", (float)20000,(float)5000,"GoooSilver");
        ContribuinteTrabOut c6 = new ContribuinteTrabOut();
        System.out.println(c5);
        System.out.println(c6);

        ContribuinteDesempregado c7 = new ContribuinteDesempregado("Marco","Rua Parai",(float)16000,15);
        ContribuinteDesempregado c8 = new ContribuinteDesempregado("Melvira","Rua naVidaBoa",(float)36000,6);
        System.out.println(c7);
        System.out.println(c8);

        System.out.println();
        System.out.println();

        Contribuinte[] contrib = new Contribuinte[10];
        contrib[0]=c1;
        contrib[1]=c2;
        contrib[2]=c3;
        contrib[3]=c4;
        contrib[4]=c5;
        contrib[5]=c6;
        contrib[6]=c7;
        contrib[7]=c8;


        for (int i = 0; i < contrib.length; i++) {
            if (contrib[i]!=null)
                System.out.println(contrib[i]);

        }

        System.out.println();
        for (int i = 0; i < contrib.length; i++) {
            if ((contrib[i]!=null)&& (contrib[i] instanceof ContribuinteDesempregado))
                System.out.println(contrib[i]);
        }

        ContribuinteDesempregado.setTax_outroTrab(0.05);
        System.out.println();
        for (int i = 0; i < contrib.length; i++) {
            if ((contrib[i]!=null)&& (contrib[i] instanceof ContribuinteDesempregado))
                System.out.println(contrib[i]);
        }


    }
}
