package br.com.alura.rh.service.promocao;

import org.springframework.stereotype.Service;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.model.exception.ValidacaoException;

@Service
public class PromocaoService {

	public void promover(Funcionario funcionario, boolean atingiuMeta) {
		Cargo cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoException("Gerentes não podem ser promovidos!");
		}

		if (atingiuMeta) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionário não atingiu a meta!");
		}
	}
}
