package ZF_PPROG_PL04B;

public class MainEscola {
    public static void main(String[] args) {
        Professor p1 = new Professor("Pedro",1100032132,"Coordenador",2500.00);
        Professor p2 = new Professor("Maria",1100055532,"Adjunto",1500.00);
        EstudanteBolseiro e1 = new EstudanteBolseiro("Rodrigo",515145136,500.00);
        EstudanteBolseiro e2 = new EstudanteBolseiro("Manuela",515885136,1500.00);
        EstudanteSemBolsa e3 = new EstudanteSemBolsa("Ricardo", 542332166);
        EstudanteSemBolsa e4 = new EstudanteSemBolsa("Vera", 542332776);
        Escola [] escola = new Escola[10];
        escola[0]=p1;
        escola[1]=p2;
        escola[2]=e1;
        escola[3]=e2;
        escola[4]=e3;
        escola[5]=e4;
        for (int i = 0; i < escola.length; i++) {
            if ((escola[i]!=null)&&(escola[i] instanceof Professor))
                System.out.println(escola[i].getNome() + ((Professor) escola[i]).getCategoria());
        }
        System.out.println();
        for (int i = 0; i < escola.length; i++) {
            if ((escola[i]!=null)&&(escola[i] instanceof EstudanteSemBolsa))
                System.out.println(escola[i].getNumIdentCivil());
        }
        System.out.println();
        for (int i = 0; i < escola.length; i++) {
            if (escola[i]!=null)
                System.out.println(escola[i]);
        }
        System.out.println();
        for (int i = 0; i < escola.length; i++) {
            if ((escola[i]!=null)&&(escola[i] instanceof Professor))
                System.out.println(escola[i].getNome()+escola[i].calcCusto());
        }
        System.out.println();
        for (int i = 0; i < escola.length; i++) {
            if ((escola[i]!=null)&&(escola[i] instanceof EstudanteBolseiro))
                System.out.println(escola[i].getNome()+escola[i].calcCusto());
        }
        System.out.println();
        double despesasEscola=0;
        double despesasProfessores=0;
        double despesasBolseiros=0;
        for (int i = 0; i < escola.length; i++) {
            if (escola[i]!=null)
                despesasEscola=despesasEscola+escola[i].calcCusto();
                if (escola[i] instanceof Professor)
                    despesasProfessores=despesasProfessores+escola[i].calcCusto();
                else if (escola[i] instanceof EstudanteBolseiro)
                    despesasBolseiros=despesasBolseiros+escola[i].calcCusto();
        }
        System.out.println(despesasEscola);
        System.out.println(despesasProfessores);
        System.out.println(despesasBolseiros);
    }
}
