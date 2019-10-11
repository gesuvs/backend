package br.com.bandtec.bora.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "TBD_SUB_CATEGORIA")
public class SubCategoria {
	
	@Id
	@GeneratedValue
	@Column(name = "id_sub_categoria")
	private Long id;
	
	@Column(name = "nome_sub_categoria")
	private String nome;
	
//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
//	@Column(name="id_categoria")
//	@NotEmpty
//	private Categoria idCategoria;

}
