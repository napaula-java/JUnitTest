package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
       BonusService service = new BonusService();

       assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Ana", LocalDate.now(), new BigDecimal(20000))));
	}
	
	@Test
	void bonusDeveriaSerCemParaFuncionarioComSalarioMil() {
       BonusService service = new BonusService();
       BigDecimal bonus = service.calcularBonus(new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000")));

       assertEquals(new BigDecimal("100.0"), bonus);
	
	}
	
	@Test
	void bonusDeveriaSerMilParaFuncionarioComSalarioDezMil() {
       BonusService service = new BonusService();
       BigDecimal bonus = service.calcularBonus(new Funcionario("Ana", LocalDate.now(), new BigDecimal("10000")));

       assertEquals(new BigDecimal("1000.0"), bonus);
       
}
}
