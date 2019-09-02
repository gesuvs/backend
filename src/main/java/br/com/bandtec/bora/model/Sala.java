package br.com.bandtec.bora.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbd_sala")
public class Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSala")
	private Long idSala;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "categoria")
	private String categoria;
	
	@Column(name = "qtd_pessoas")
	private Long qtdPessoa;
	
	@Column(name = "dataHora")
	private Long dataHora;
	
	@Column(name = "endereco")
	private String endereco;

	
	public Long getIdSala() {
		return idSala;
	}

	public void setIdSala(Long idSala) {
		this.idSala = idSala;
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

	public Long getQtdPessoa() {
		return qtdPessoa;
	}

	public void setQtdPessoa(Long qtdPessoa) {
		this.qtdPessoa = qtdPessoa;
	}

	public Long getDataHora() {
		return dataHora;
	}

	public void setDataHora(Long dataHora) {
		this.dataHora = dataHora;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
