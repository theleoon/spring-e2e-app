package br.com.alura.leilao.e2e.selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.leilao.e2e.pages.AlterarLeilaoPage;
import br.com.alura.leilao.e2e.pages.LeiloesPage;
import br.com.alura.leilao.e2e.pages.LoginPage;
import br.com.alura.leilao.e2e.pages.NovoLeilaoPage;

public class LeiloesE2ETest extends E2ETestBase{

	/** Classe dedicada para exercícios */
	private LeiloesPage leiloesPage;

	@BeforeEach
	void setup() {
		LoginPage loginPage = new LoginPage(getDriver());
		leiloesPage = loginPage.realizaLoginComoFulano();		
	}

	@Test
	public void deveCadastrarUmLeilao() {
		assertTrue(true);
	}
	
	
	@Test
	public void deveEditarUmLeilao() {
		assertTrue(true);
	}
	
}
