package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Builder.Default;
import lombok.RequiredArgsConstructor;

public class Promocao implements ReajusteTributavel {

	private final BigDecimal valor;

	private LocalDate data;

	public Promocao(BigDecimal valor) {
		this.valor = valor;
		this.data = LocalDate.now();
	}

	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}

	@Override
	public BigDecimal valorImpostoDeRenda() {
		return valor.multiply(new BigDecimal(0.1));
	}

}
