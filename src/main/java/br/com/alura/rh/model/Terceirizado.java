package br.com.alura.rh.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Terceirizado {

	private String empresa;
	private DadosPessoais dadosPessoais;

	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
		this.empresa = empresa;
	}

}
