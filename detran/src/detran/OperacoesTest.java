package detran;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperacoesTest {

    Veiculo veiculo;
    VeiculoCarga veiculoCarga;
    Passageiros passageiros;
    Motorista motorista;
    Acidente acidente;
    Bicicleta bicicleta;
    Rodovia rodovia;


    @BeforeEach
    void executaAntes(){
        motorista = new Motorista("João", 23, "Masculino", true, 0.09);
        veiculo = new Veiculo("Palio", 2015, motorista);
        passageiros = new Passageiros("Kaike", 19, "Masculino", true);
        veiculoCarga = new VeiculoCarga("Scania", 2023, motorista, 25000);
        rodovia = new Rodovia("SC-290", "ALTA");
        acidente = new Acidente(rodovia, 02);
        bicicleta = new Bicicleta("VIKINGS", 2010, motorista);
        acidente.addVeiculo(veiculo);
        acidente.addVeiculo(bicicleta);
        acidente.addVeiculo(veiculoCarga);
        veiculo.addPassageiro(passageiros);
        rodovia.adicionarAcidente(acidente);
    }

    @Test
    void testAcidentesEmbriagados() {
        Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(veiculo);
        Operacoes.acidentesEmbriagados();
        assertTrue(veiculo.getMotorista().isEmbriagado());
}

    @Test
    void testAcidentesPericulosidade() {
        Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(veiculo);
        Operacoes.acidentesPericulosidade();
        assertEquals("SC-290", rodovia.getSigla());
        assertEquals("ALTA", rodovia.getPericulosidade());
    }

    @Test
    void testAdicionarRodovia() {
        Operacoes.adicionarRodovia(rodovia);
    }

    @Test
    void testAdicionarVeiculo() {
        Operacoes.adicionarVeiculo(veiculo);
    }

    @Test
    void testContagemFataisPorRodovia() {
    	Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(veiculo);
        Operacoes.contagemFataisPorRodovia();
        assertTrue(veiculo.getMotorista().isFatal());
        assertTrue(veiculo.getPassageiros().get(0).isFatal());
        
    }

    @Test
    void testContagemMaisAcidentesBicicletas() {
    	Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(bicicleta);
        Operacoes.contagemMaisAcidentesBicicletas();
        assertEquals(bicicleta, acidente.getVeiculos().get(1));
    }

    @Test
    void testContagemVeiculosNovos() {
    	Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(veiculo);
        Operacoes.contagemVeiculosNovos();
        assertTrue(veiculo.getAnoFabricação() >= 2013);
    }

    @Test
    void testRegistrarAcidente() {
        Operacoes.registrarAcidente(acidente);
    }

    @Test
    void testRodoviaComAcidentesCarnaval() {
    	Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(veiculo);
        Operacoes.contagemVeiculosNovos();
        assertEquals(2, acidente.getMes());
    }

    @Test
    void testVeiculosCargaAcidentados() {
    	Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(veiculoCarga);
        Operacoes.veiculosCargaAcidentados();
        assertEquals(veiculoCarga, acidente.getVeiculos().get(2));
    }
}
