package detran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PassageirosTest {

	@Test
	void testConstrutorVazio() {
		Passageiros passageiro = new Passageiros();
        assertEquals("", passageiro.getNome());
        assertEquals(0, passageiro.getIdade());
        assertEquals("", passageiro.getSexo());
        assertEquals(false, passageiro.isFatal());
	}

}
