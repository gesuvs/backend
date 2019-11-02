package br.com.bandtec.bora.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tbd_recorrencia")
public class Recorrencia {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_recorrencia")
	private Long idRecorrencia;
	
	@Column(name = "dia_evento")
	private String diaEvento;
	
	@Column(name = "tipo_recorrencia")
	private String tipoRecorrencia;
	
	public Recorrencia() {
	}

	public Recorrencia(Long id, String tipoRecorrencia) {
		this.idRecorrencia = id;
		this.tipoRecorrencia = tipoRecorrencia;
	}
}
