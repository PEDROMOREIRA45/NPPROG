package ZF_PPROG_PL09;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

import static ZF_PPROG_PL09.Util.lerData;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Formatter escreverFicheiro;
        boolean nomeFicheiroInvalido;

        System.out.print("\nNome do ficheiro: ");
        do {
            nomeFicheiroInvalido = false;
            try {
                String nomeFicheiro = ler.nextLine();
                escreverFicheiro = new Formatter(nomeFicheiro);
                System.out.println("Ficheiro criado.");
                try {
                    System.out.print("\nNome (\"ENTER para terminar\"): ");
                    String nome = ler.nextLine();
                    while (!nome.trim().isEmpty()) {
                        Data d = lerData();
                        escreverFicheiro.format("%s; %s %n", nome, d);
                        System.out.print("\nNome (\"ENTER para terminar\"): ");
                        nome = ler.nextLine();
                    }
                } finally {
                    escreverFicheiro.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("\nImpossível criar ficheiro!!\n" + e.getMessage());
                System.out.print("\nDigite novamente o nome do ficheiro: ");
                nomeFicheiroInvalido = true;
            } catch (Exception e) {
                System.out.println("\n"+ e.getMessage());
            }
        } while (nomeFicheiroInvalido);
        System.out.println("\nAplicação terminada.");

    }

}