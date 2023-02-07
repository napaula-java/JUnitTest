package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	A_desejar {
		@Override
		public BigDecimal PercentualReajuste() {
			return new BigDecimal("0.03");
		}
	}, 
	Otimo {
		@Override
		public BigDecimal PercentualReajuste() {
			return new BigDecimal("0.20");
		}
	},
	Bom {
		@Override
		public BigDecimal PercentualReajuste() {
			return new BigDecimal("0.15");
		}
	};

	public abstract BigDecimal PercentualReajuste();
}
