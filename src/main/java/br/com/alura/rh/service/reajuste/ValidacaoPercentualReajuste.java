package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.model.exception.ValidacaoException;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

	private static final double PERCENTUAL_DE_REAJUSTE = 0.4;

	@Override
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);

		if (percentualReajuste.compareTo(new BigDecimal(PERCENTUAL_DE_REAJUSTE)) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
	}
}
