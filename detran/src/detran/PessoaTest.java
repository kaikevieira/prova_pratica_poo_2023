package detran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
	void testConstrutorVazio() {
		Pessoa pessoa = new Pessoa();
        assertEquals("", pessoa.getNome());
        assertEquals(0, pessoa.getIdade());
        assertEquals("", pessoa.getSexo());
        assertEquals(false, pessoa.isFatal());
	}

}
