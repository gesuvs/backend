package br.com.bandtec.bora.model.dto;

import br.com.bandtec.bora.model.entity.Evento;
import br.com.bandtec.bora.model.entity.Usuario;

public class CadastrarEvento {

	private Usuario usuario;
	private Evento evento;

	public CadastrarEvento(Usuario usuario, Evento evento) {
		this.usuario = new Usuario(usuario.getIdUsuario());
		this.evento = evento;
	}

	public CadastrarEvento() {
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}
