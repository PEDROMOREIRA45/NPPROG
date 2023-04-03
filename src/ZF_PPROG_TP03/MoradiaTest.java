package ZF_PPROG_TP03;

class MoradiaTest {

    @org.junit.jupiter.api.Test
    void calcImposto() {
    int factorImposto =2;
    Moradia mtest1 =new Moradia("",90,Cores.AZUL);
    mtest1.setArea(90);
    double resulEsperado=factorImposto*mtest1.getArea();
    double result=mtest1.calcImposto();
    assert (resulEsperado==result);

    }
}