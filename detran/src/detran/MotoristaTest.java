package detran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MotoristaTest {

	@Test
	void testConstrutorVazio() {
		Motorista motorista = new Motorista();
        assertEquals("", motorista.getNome());
        assertEquals(0, motorista.getIdade());
        assertEquals("", motorista.getSexo());
        assertEquals(false, motorista.isFatal());
	}

}
