package ZF_PPROG_PL04.Contadores;

class ContadoresGasTest {

    @org.junit.jupiter.api.Test
    void calcularPreco() {
        int consumo =2;
        ContadoresGas c2 = new ContadoresGas();
        c2.setConsumo(consumo);
        double resultadoEsperado =1.0;
        double resultado = c2.calcularPreco();
        assert(resultadoEsperado==resultado);
    }

    @org.junit.jupiter.api.Test
    void getCustoM3() {
    }

    @org.junit.jupiter.api.Test
    void setCustoM3() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}