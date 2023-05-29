package ZF_PPROG_PL09;

import java.util.Scanner;

public final class Util {

    private Util(){}

    public static Data lerData() {

        Scanner ler = new Scanner(System.in);
        Data d = new Data();
        boolean dataInvalida = true;

        System.out.print("Data de aniversário (ano/mes/dia): ");
        do {
            try {
                String[] data = ler.nextLine().split("/");
                if (data.length != 3) {
                    throw new NumberFormatException();
                }
                int ano = Integer.parseInt(data[0]);
                int mes = Integer.parseInt(data[1]);
                int dia = Integer.parseInt(data[2]);

                d.setData(ano, mes, dia);

                dataInvalida = false;
            } catch (NumberFormatException e) {
                System.out.println("Formato é inválido!!");
                System.out.print("Digite novamente a data de aniversário (ano/mes/dia): ");
            } catch (DiaInvalidoException | MesInvalidoException e) {
                System.out.println(e.getMessage());
                System.out.print("Digite novamente a data de aniversário (ano/mes/dia): ");
            }
        } while (dataInvalida);

        return d;
    }
}