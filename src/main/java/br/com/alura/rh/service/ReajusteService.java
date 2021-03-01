package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.alura.rh.model.Funcionario;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReajusteService {

	private final List<ValidacaoReajuste> validacoes;

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		validacoes.forEach(valicacao -> valicacao.validar(funcionario, aumento));

		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
