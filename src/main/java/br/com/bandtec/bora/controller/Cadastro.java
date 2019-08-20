package br.com.bandtec.bora.controller;

public class Cadastro {
	private String nome;
	private Integer telefone;
	
	public Cadastro(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.telefone = idade;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return telefone;
	}

}
