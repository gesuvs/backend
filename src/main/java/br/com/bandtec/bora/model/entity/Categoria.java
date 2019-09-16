package br.com.bandtec.bora.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbd_categoria")
public class Categoria {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "idcategoria")
	private Long idCategoria;
	
	@NotNull
	@Column(name = "nomeCategoria")
	private String nomeCategoria;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

}
