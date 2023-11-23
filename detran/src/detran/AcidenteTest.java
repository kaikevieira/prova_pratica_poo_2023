package detran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AcidenteTest {
	
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
        passageiros = new Passageiros("Kaike", 19, "Masculino", false);
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
	void testContagemFatais() {
		Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(veiculo);
        assertTrue(acidente.contagemFatais() > 0);
	}
	
	@Test
	void testContagemFerido() {
		Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(veiculo);
        assertTrue(acidente.contagemFerido() > 0);
	}
	
	@Test
	void testContagemFataisEFeridos() {
		Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(veiculo);
        assertTrue(acidente.contagemFataisEFeridos() > 0);
	}
	
	@Test
    void testConstrutorVazio() {
		Acidente acidente = new Acidente();
        assertEquals(null, acidente.getRodovia());
        assertEquals(0, acidente.getMes());
    }
}