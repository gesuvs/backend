package br.com.bandtec.bora.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tbd_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private Long idUsuario;	

	@NotNull
	@Column(name = "nome")
	@Pattern(regexp="^[a-zA-Z\\s]+",message="Voce tem certeza que seu nome ta correto?")
	private String nome;

	@NotNull
	@NotEmpty(message="Nome do usuario nao pode ficar vazio")
	@Size(min = 2,max = 32, message="Nome do usuario nao pode ser menor que 2 ou maior que 32 caracteres")
	@Column(name = "usuario")
	private String usuario;

	@NotNull
	@Pattern(regexp="\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d", message = "voce tem certeza que seu numero de celular esta correto?")
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