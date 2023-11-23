package detran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VeiculoCargaTest {

	@Test
	void testConstrutorVazio() {
		VeiculoCarga veiculoCarga = new VeiculoCarga();
		Motorista motorista = new Motorista();
        assertEquals("", veiculoCarga.getModelo());
        assertEquals(0, veiculoCarga.getAnoFabricação());
        assertEquals(motorista, motorista);
	}

}
