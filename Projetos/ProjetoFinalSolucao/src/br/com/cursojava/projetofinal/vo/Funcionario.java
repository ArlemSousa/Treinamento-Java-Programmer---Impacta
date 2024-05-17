package br.com.cursojava.projetofinal.vo;

import java.text.DecimalFormat;

public class Funcionario {

	public static final DecimalFormat MASCARA_SALARIO = new DecimalFormat("#,##0.00");
	
	/** func_code */
	private Integer matricula;

	/** func_name */
	private String nome;

	/** func_rmnt_val */
	private Double salario;

	/** role_code */
	private Integer cargoId;
	
	private String cargoNome;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getSalarioFormatado() {
		return salario == null ? "0,00" : MASCARA_SALARIO.format(salario);
	}

	public Integer getCargoId() {
		return cargoId;
	}

	public void setCargoId(Integer cargoId) {
		this.cargoId = cargoId;
	}

	public String getCargoNome() {
		return cargoNome;
	}

	public void setCargoNome(String cargoNome) {
		this.cargoNome = cargoNome;
	}
}
