package detran;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperacoesTest {

    Operacoes operacoes;
    Veiculo veiculo;
    VeiculoCarga veiculoCarga;
    Pessoa pessoa;
    Passageiros passageiros;
    Motorista motorista;
    Acidente acidente;
    Bicicleta bicicleta;
    Rodovia rodovia;


    @BeforeEach
    void executaAntes(){
        operacoes = new Operacoes();
        veiculo = new Veiculo("Palio", 2015, motorista);
        passageiros = new Passageiros("Kaike", 19, "Masculino", true);
        motorista = new Motorista("João", 23, "Masculino", false, 0.09);
        pessoa = new Pessoa();
        veiculoCarga = new VeiculoCarga("Scania", 2023, motorista, 25000);
        acidente = new Acidente(rodovia, 2);
        bicicleta = new Bicicleta("VIKINGS", 2010, motorista);
        rodovia = new Rodovia("SC-290", "ALTA");
    }

    @Test
    void testAcidentesEmbriagados() {
    

    
    }

    @Test
    void testAcidentesPericulosidade() {

    }

    @Test
    void testAdicionarRodovia() {

    }

    @Test
    void testAdicionarVeiculo() {

    }

    @Test
    void testContagemFataisPorRodovia() {

    }

    @Test
    void testContagemMaisAcidentesBicicletas() {

    }

    @Test
    void testContagemVeiculosNovos() {

    }

    @Test
    void testRegistrarAcidente() {

    }

    @Test
    void testRodoviaComAcidentesCarnaval() {

    }

    @Test
    void testVeiculosCargaAcidentados() {

    }
}
