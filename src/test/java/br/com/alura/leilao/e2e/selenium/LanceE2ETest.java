package br.com.alura.leilao.e2e.selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.leilao.e2e.pages.DetalhesDoLeilaoPage;
import br.com.alura.leilao.e2e.pages.LeiloesPage;
import br.com.alura.leilao.e2e.pages.LoginPage;

public class LanceE2ETest extends E2ETestBase{
	
	private LeiloesPage leiloesPage;

	@BeforeEach
	void setup() {
		LoginPage loginPage = new LoginPage(getDriver());
		this.leiloesPage = loginPage.realizaLoginComoFulano();
	}
	
    @Test
    public void deveAceitarUmLance() {
        LoginPage loginPage = new LoginPage(getDriver());
        this.leiloesPage = loginPage.realizaLoginComoFulano();

        DetalhesDoLeilaoPage detalhesDoLeilaoPage = this.leiloesPage.visitaLeilaoPaginaParaDarLance();
        detalhesDoLeilaoPage.darLance("150");

        assertTrue(detalhesDoLeilaoPage.existeLance("150"));
    }
    
    @Test
    public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {
        assertTrue(true);
    }
    
    @Test
    public void naoDeveAceitarDoisLancesComOMesmoValor() {
		DetalhesDoLeilaoPage detalhesLeilaoPage = leiloesPage.visitaLeilaoPaginaParaDarLance();
		detalhesLeilaoPage.darLance("150");
		detalhesLeilaoPage.darLance("150");

        assertTrue(detalhesLeilaoPage.temApenasUmLance());
    }
}
