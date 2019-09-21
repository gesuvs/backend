package br.com.bandtec.bora.model.entity;


@Entity
@Table(name = "tbd_usuario_evento")
public class UsuarioEvento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEvento")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@JoinColumn(name="id_usuario")
	private Usuario participante;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@JoinColumn(name="id_evento")
	private Evento evento;

	public String getParticipante() {
		return participante;
	}

	public void setParticipante(Usuario participante) {
		this.participante = participante;
	}


	public String getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}