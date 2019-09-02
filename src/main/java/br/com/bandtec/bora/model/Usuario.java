package br.com.bandtec.bora.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tbd_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private Long idUsuario;	

	@Column(name = "nome")
	private String nome;

	@NotNull
	@Column(name = "usuario")
	private String usuario;

	@NotNull
	@Column(name = "celular")
	private String celular;

	@NotNull
	@Column(name = "senha")
	private String senha;

	@NotNull
	@CreationTimestamp
	@Column(name = "cadastroEm")
	private Date cadastroEm;
	
	@NotNull
	@UpdateTimestamp
	@Column(name = "alteradoEm")
	private Date alteradoEm;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getCadastroEm() {
		return cadastroEm;
	}

	public void setCadastroEm(Date cadastroEm) {
		this.cadastroEm = cadastroEm;
	}

	public Date getAlteradoEm() {
		return alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}
}