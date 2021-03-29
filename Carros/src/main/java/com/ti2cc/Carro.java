package com.ti2cc;

public class Carro {
	private int codigo;
	private String nome;
	private String modelo;
	private int placa;
	
	public Carro() {
		this.codigo = -1;
		this.nome = "";
		this.modelo = "";
		this.placa = 0;
	}
	
	public Carro(int codigo, String nome, String modelo, int placa) {
		this.codigo = codigo;
		this.nome = nome;
		this.modelo = modelo;
		this.placa = placa;
	}

	public String toString() {
		return "Carro [codigo=" + codigo + ", nome=" + nome + ", modelo=" + modelo + ", placa=" + placa + "]";
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public int getplaca() {
		return placa;
	}
	public void setplaca(int placa) {
		this.placa = placa;
	}
}
