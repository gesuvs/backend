package br.com.bandtec.bora.model.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tbd_evento")
public abstract class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evento")
	private Long idEvento;

	@NotEmpty
	@Size(min = 2)
	@Column(name = "nome_evento")
	private String nome;

	@Size(max = 255)
	private String descricao;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@NotEmpty
	private Categoria categoria;

	@NotEmpty
	@Column(name = "data_hora_inicio")
	@DateTimeFormat(pattern = " dd/MM/yyyy hh:mm")
	private LocalDate dataHoraInicio;

	@Column(name = "data_hora_fim")
	@DateTimeFormat(pattern = " dd/MM/yyyy hh:mm")
	private LocalDate dataHoraFim;

	@NotEmpty
	private String endereco;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "organizador_id")
	private Usuario organizador;

	public Evento() {
	}

	public Evento(Long idEvento, @NotEmpty @Size(min = 2) String nome, @NotEmpty Categoria categoria,
			@NotEmpty LocalDate dataHoraInicio, @NotEmpty String endereco, Usuario organizador) {
		this.idEvento = idEvento;
		this.nome = nome;
		this.categoria = categoria;
		this.dataHoraInicio = dataHoraInicio;
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

	public LocalDate getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(LocalDate dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public LocalDate getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(LocalDate dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
}
