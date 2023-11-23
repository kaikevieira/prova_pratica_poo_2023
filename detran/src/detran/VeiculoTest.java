package detran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VeiculoTest {

	@Test
	void testConstrutorVazio() {
		Veiculo veiculo = new Veiculo();
		Motorista motorista = new Motorista();
        assertEquals("", veiculo.getModelo());
        assertEquals(0, veiculo.getAnoFabricação());
        assertEquals(motorista, motorista);
	}

}
