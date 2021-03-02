package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}

	public Cargo getCargo() {
		return this.dadosPessoais.getCargo();
	}

	public BigDecimal reajustarSalario(BigDecimal aumento) {
		return this.dadosPessoais.getSalario().add(aumento);
	}

	public BigDecimal getSalario() {
		return this.dadosPessoais.getSalario();
	}

	public LocalDate getDataUltimoReajuste() {
		return this.dataUltimoReajuste;
	}

}
