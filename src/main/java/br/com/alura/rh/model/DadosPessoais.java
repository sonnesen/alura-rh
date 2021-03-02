package br.com.alura.rh.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class DadosPessoais {

	@Getter
	private final String nome;

	@Getter
	private final String cpf;

	@Setter
	private Cargo cargo;

	@Getter
	private BigDecimal salario;

	public DadosPessoais(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	public void setSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

}
