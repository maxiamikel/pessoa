package aula20200406.aula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesPessoas {
	

	@Test
	void testPessoa() {
		Pessoa jean=new Pessoa("Amikel",21,28,12);
		Pessoa pedro=new Pessoa("Pedro",12,15,45);
		
		jean.setNome();
		jean.setAltura();
		jean.setIdade();
		jean.setPeso();
		assertTrue(true,jean.getNome());
		assertEquals(28,jean.getAltura());
		assertEquals(21,jean.getIdade());
		assertEquals(12,jean.getPeso());
		
		pedro.setNome();
		assertTrue(true,pedro.getNome());
		pedro.setAltura();
		assertEquals(15,pedro.getAltura());
		pedro.setIdade();
		assertEquals(12,pedro.getIdade());
		pedro.setPeso();
		assertEquals(45,pedro.getPeso());

	}

}
