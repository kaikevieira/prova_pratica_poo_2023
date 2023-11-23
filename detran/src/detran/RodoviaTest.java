package detran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RodoviaTest {
	
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
	void testContarAcidentes() {
		Operacoes.adicionarRodovia(rodovia);
        Operacoes.registrarAcidente(acidente);
        Operacoes.adicionarVeiculo(veiculo);
        assertTrue(rodovia.contarAcidentes() > 0);
	}
	
	@Test
    void testConstrutorVazio() {
		Rodovia rodovia = new Rodovia();
        assertEquals("", rodovia.getSigla());
        assertEquals("", rodovia.getPericulosidade());
    }

}
