package ZF_PPROG_PL05.VencimentosComComparador;

import java.util.*;

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira",
                500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        System.out.println("### Trabalhadores ###");
        listar(trabs);

        System.out.println();
        Comparator<Trabalhador> c1 =new Comparator<Trabalhador>() {
            public int compare(Trabalhador t1, Trabalhador t2) {
                double vencimento1 = t1.calcularVencimento();
                double vencimento2 = t2.calcularVencimento();

                if (vencimento1 < vencimento2) {
                    return -1;
                } else if (vencimento1 > vencimento2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(trabs,c1);
        listar(trabs);

        System.out.println();
        Collections.sort(trabs,c1.reversed());
        listar(trabs);

        System.out.println();
        Comparator<Trabalhador> c2 =new Comparator<Trabalhador>() {
            public int compare(Trabalhador t1, Trabalhador t2) {
                String nome1 = t1.getNome();
                String nome2 = t2.getNome();

                if (nome1.compareTo(nome2)<0 ) {
                    return -1;
                } else if (nome1.compareTo(nome2)>0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(trabs,c2);
        listar(trabs);


    }

    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(),
                        trab.calcularVencimento());
            }
        }
    }

}
