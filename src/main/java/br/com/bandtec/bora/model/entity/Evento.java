package br.com.bandtec.bora.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tbd_evento")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evento")
	private Long idEvento;

	@NotEmpty
	@Size(min = 2)
	@Column(name = "nome_evento")
	private String nome;
	
	@NotEmpty
	@Column(name = "data_hora_inicio")
//	@DateTimeFormat(pattern = " dd/MM/yyyy hh:mm")
	private String dataHoraInicio;

	@Column(name = "data_hora_fim")
//	@DateTimeFormat(pattern = " dd/MM/yyyy hh:mm")
	private String dataHoraFim;
	
	@Size(max = 255)
	private String descricao;

	@Column(name = "is_privado")
	private boolean isPrivado;
	
	private String senha;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@NotEmpty
	private Categoria categoria;

	@NotEmpty
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Endereco endereco;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "organizador_id")
	private Usuario organizador;

	public Evento() {
	}

	

	public Evento(Long idEvento, @NotEmpty @Size(min = 2) String nome, @NotEmpty String dataHoraInicio,
			String dataHoraFim, @Size(max = 255) String descricao, boolean isPrivado, String senha,
			@NotEmpty Categoria categoria, @NotEmpty Endereco endereco, Usuario organizador) {
		super();
		this.idEvento = idEvento;
		this.nome = nome;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.descricao = descricao;
		this.isPrivado = isPrivado;
		this.senha = senha;
		this.categoria = categoria;
		this.endereco = endereco;
		this.organizador = organizador;
	}



	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(String dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public String getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(String dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public boolean isPrivado() {
		return isPrivado;
	}

	public void setPrivado(boolean isPrivado) {
		this.isPrivado = isPrivado;
	}

	public String getSenha() {
		return senha;
	}
	

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
}
