package ZF_PPROG_PL02A;

public class MainUtentes {
    public static void main(String[] args) {
        Utente u1 = new Utente();
        Utente u2 = new Utente ("Pedro","Masculino",45 , 1.70 , 70.00);
        Utente u3 = new Utente ("Maria","Feminino",35 , 1.60 , 65.00);
        Utente u4 = new Utente ("Ines","Feminino",55 , 1.60 , 90.00);
        Utente u5 = new Utente ("Rita","Feminino",35,1.60 , 45.00);

        System.out.println(u2.calcIMC());

        Object[] utentes = new Object[10];
        utentes[0]=u1;
        utentes[1]=u2;
        utentes[2]=u3;
        utentes[3]=u4;
        utentes[4]=u5;

        for (int i = 0; i < utentes.length; i++) {
            if (utentes[i] != null) {
                System.out.println(utentes[i].toString());
            }
        }

        System.out.println();

        for (int i = 0; i < utentes.length; i++) {
            if (utentes[i] != null) {
                System.out.println(((Utente)utentes[i]).getNome() + "  " + ((Utente)utentes[i]).calcIMC());
            }
        }

        System.out.println();

        for (int i = 0; i < utentes.length; i++) {
            if ((utentes[i] != null)  && !((Utente)utentes[i]).grauIMC().equals("Saudavel")){
                System.out.printf("Utente %10s tem IMC %f\n",((Utente)utentes[i]).getNome(),((Utente)utentes[i]).calcIMC());
            }
        }

        System.out.println();

        for (int i = 0; i < utentes.length; i++) {
            if (utentes[i] != null) {
                System.out.printf("Utente %10s tem IMC %f e é %s \n",((Utente)utentes[i]).getNome(),((Utente)utentes[i]).calcIMC(),((Utente)utentes[i]).grauIMC());
            }
        }

        System.out.println(u3.verfMaisNovo(u4));

        u3.setIdade(u4.getIdade());

        System.out.println(u3.verfMaisNovo(u4));


    }
}
