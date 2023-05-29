package ZF_PPROG_PL06.impostos;

import java.util.ArrayList;
import java.util.List;

public class TesteImpostos {

    public static void main(String[] args) {

        List<Contribuinte> contribuintes = new ArrayList<>();

//        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
//        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
//        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
//        contribuintes.add(new TrabalhadorContaOutrem("Ana", "Ovar", 1800, 300, "CMM"));
//        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
//        contribuintes.add(new TrabalhadorContaOutrem("Salvio", "Seixal", 8000, 1000, "SSB"));
//        contribuintes.add(new TrabalhadorContaPropria("Mário", "Guarda", 1500, 300, "Eletricista"));
//        contribuintes.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
//        contribuintes.add(new TrabalhadorContaOutrem("João", "Lisboa", 800, 100, "CML"));
//        contribuintes.add(new TrabalhadorContaPropria("Carla", "Porto", 15000, 1000, "Advogado"));
//        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));

        Contribuinte ctb1 = new TrabalhadorContaOutrem("Marta Meireles","Braga",1000.0f,800.0f,"UnifiedLDA");
        Contribuinte ctb2 = new TrabalhadorContaPropria("Jorge Mendes","Porto",2500.0f,500.0f,"Programador");
        contribuintes.add(ctb1);
        contribuintes.add(ctb2);

        listar("#### Contribuintes ####", contribuintes);

//        System.out.println(contribuintes.remove(new Desempregado("Lito Vidal", "Lisboa", 230, 1)));
//
//        listar("#### Desempregado removido ####", contribuintes);
//
//        System.out.println("\n#### Equals 1 ####\n");
//        Contribuinte c1 = new Reformado("Aníbal Silva", "Coimbra", 1000, 500);
//        Contribuinte c2 = new Reformado("Aníbal Silva", "Coimbra", 1000, 500);
//        System.out.printf("%s%n%n equals %n%n%s%n%n = %s%n", c1, c2, c1.equals(c2));
//
//        System.out.println("\n#### Equals 2 ####\n");
//        Contribuinte c3 = new Reformado("Jaime Magalhães", "Porto", 1500, 100);
//        System.out.printf("%s%n%n equals %n%n%s%n%n = %s%n", c1, c3, c1.equals(c3));
//
//        System.out.println("\n#### Equals 3 ####\n");
//        Contribuinte c4 = new TrabalhadorContaOutrem("Salvio Salvador", "Seixal", 8000, 1000, "SSB");
//        System.out.printf("%s%n%n equals %n%n%s%n%n = %s%n", c1, c4, c1.equals(c4));
//
//        Comparator<Contribuinte> criterio1 = new Comparator<Contribuinte>() {
//
//            @Override
//            public int compare(Contribuinte c1, Contribuinte c2) {
//                return c1.getClass().getName().compareTo(c2.getClass().getName());
//            }
//
//        };
//
//        Collections.sort(contribuintes, Collections.reverseOrder(criterio1));
//        listar("#### Ordem alfabética inversa dos tipos de contribuintes ####", contribuintes);
//
//        Comparator<Contribuinte> criterio2 = new Comparator<Contribuinte>() {
//
//            @Override
//            public int compare(Contribuinte c1, Contribuinte c2) {
//                int comparacaoTipoContribuinte = c1.getClass().getName().compareTo(c2.getClass().getName());
//                if (comparacaoTipoContribuinte == 0) {
//                    return c1.getNome().compareTo(c2.getNome());
//                } else {
//                    return comparacaoTipoContribuinte;
//                }
//            }
//
//        };
//
//        Collections.sort(contribuintes, criterio2);
//        listar("#### Ordem alfabética dos tipos de contribuintes \n"
//                + " e ordem alfabética dos nomes em cada tipo de contribuinte ####", contribuintes);

    }

    private static void listar(String titulo, List<Contribuinte> a) {
        System.out.println("\n" + titulo);
        for (Contribuinte c : a) {
            System.out.println("\n" + c + "\nImposto: " + c.calcularImposto() + "€");
        }
    }

}
