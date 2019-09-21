package br.com.bandtec.bora.model.dto;

import br.com.bandtec.bora.model.entity.Evento;
import br.com.bandtec.bora.model.entity.Usuario;

public class CadastrarEvento {

	private Usuario usuario;
	private String nome;
	private String categoria;
	private String dataHora;
	private String endereco;

	public CadastrarEvento(Usuario usuario, String nome, String categoria, String dataHora, String endereco) {
		this.usuario = usuario;
		this.nome = nome;
		this.categoria = categoria;
		this.dataHora = dataHora;
		this.endereco = endereco;
	}

	public CadastrarEvento() {

	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
