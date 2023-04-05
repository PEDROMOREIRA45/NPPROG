package PPROG_PL04;

public class MainContadores {
    public static void main(String[] args) {
        ContGas c1 = new ContGas("Jose Maria",7.00);
        ContGas c2 = new ContGas("Maria Jose",5.00);
        ContadoresElecBiHorar c3 =new ContadoresElecBiHorar("Marco Alozo",6,7,5.5);
        ContadoresElecBiHorar c4 =new ContadoresElecBiHorar("Manuela Alozo",8,5,7);
        ContadorElectTarfSimp c5 = new ContadorElectTarfSimp("Fernanda",7,9);
        ContadorElectTarfSimp c6 = new ContadorElectTarfSimp("Fernandinho",5,6);
        Contador [] contad = new Contador[10];
        contad[0]=c1;
        contad[1]=c2;
        contad[2]=c3;
        contad[3]=c4;
        contad[4]=c5;
        contad[5]=c6;

        for (int i = 0; i < contad.length; i++) {
            if (contad[i]!=null)
                System.out.printf("Cliente: %8s con contador : %8s\n",contad[i].getCliente(),contad[i].getId());
        }
        System.out.println();
        System.out.println( ContadorElect.getNumContElect());
        System.out.println();
        for (int i = 0; i < contad.length; i++) {
            if ((contad[i]!=null)&&(contad[i] instanceof ContadoresElecBiHorar))
                System.out.println(contad[i].getId());
        }


    }
}
