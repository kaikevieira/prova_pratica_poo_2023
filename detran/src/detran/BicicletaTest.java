package detran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BicicletaTest {

	@Test
	void testConstrutorVazio() {
		Bicicleta bicicleta = new Bicicleta();
		Motorista motorista = new Motorista();
        assertEquals("", bicicleta.getModelo());
        assertEquals(0, bicicleta.getAnoFabricação());
        assertEquals(motorista, motorista);
	}
}