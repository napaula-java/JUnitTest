package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	private ReajusteService reajusteService;
	private Funcionario funcionario;

	//Também existe a anotação @AfterEach p/ chamar depois dos testes
	@BeforeEach           // Anotação do Junit pra chamar o método antes dos testes 
	public void inicializar() {
		reajusteService = new ReajusteService();
		funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("8000"));
	}
	
	@Test
	public void AjusteTresPorCentoDesenpenhoADesejar() {
		reajusteService.concederReajuste(funcionario, Desempenho.A_desejar);
		assertEquals(new BigDecimal("8240.00"), funcionario.getSalario());
	}
	
	@Test
	public void AjusteQuinzePorCentoDesenpenhoBom() {
		
		reajusteService.concederReajuste(funcionario, Desempenho.Bom);
		assertEquals(new BigDecimal("9200.00"), funcionario.getSalario());
		
}
	
	@Test
	public void AjusteVintePorCentoDesenpenhoOtimo()  {
		
		reajusteService.concederReajuste(funcionario, Desempenho.Otimo);
		assertEquals(new BigDecimal("9600.00"), funcionario.getSalario());
		
}
}