package AV_PPROG_PL03A;

public class MainVencimentos {
    public static void main(String[] args) {
        TrabalhadorPeca t1 = new TrabalhadorPeca("Jorge Silva",53, 62);
        TrabalhadorComissao t2 = new TrabalhadorComissao("Susana Ferreira",(float)650.0,(float)2731.5,(float)4.25);
        TrabalhadorHora t3 = new TrabalhadorHora("Carlos Miguel",168, (float)4.50);

        Trabalhador[] trabalhadores = new Trabalhador[10];
        trabalhadores[0]=t1;
        trabalhadores[1]=t2;
        trabalhadores[2]=t3;

        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i]!=null)
                System.out.println(trabalhadores[i]);
        }
        System.out.println();
        for (int i = 0; i < trabalhadores.length; i++) {
            if ((trabalhadores[i]!=null)&&(trabalhadores[i] instanceof TrabalhadorHora))
                System.out.println(trabalhadores[i]);
        }
        System.out.println();
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i]!=null) {
                System.out.println(trabalhadores[i]);
                System.out.printf("Vencimento Total: %8.2f €\n",trabalhadores[i].calcularVencimento());
            }
        }
    }
}
