package br.com.bandtec.bora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbd_usuario") //nome da tabela a ser criada
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)     //define a pk da tabela e gera automaticamente
	private Long idUsuario;
	
	private String nome;
	
	private String usuario;
	
	private String celular;
	
	private String senha;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}
