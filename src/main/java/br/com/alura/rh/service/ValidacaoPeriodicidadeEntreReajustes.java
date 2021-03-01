package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.model.exception.ValidacaoException;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

	private static final int INTERVALO_MINIMO_EM_MESES = 6;

	@Override
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

		if (mesesDesdeUltimoReajuste < INTERVALO_MINIMO_EM_MESES) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser de no mínimo 6 meses!");
		}
	}
}
