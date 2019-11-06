package br.com.bandtec.bora.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.bandtec.bora.model.dto.CadastrarEventoDTO;
import br.com.bandtec.bora.model.entity.Evento;
import br.com.bandtec.bora.model.entity.Usuario;
import br.com.bandtec.bora.model.entity.UsuarioEvento;
import br.com.bandtec.bora.repository.EventoRepositorio;
import br.com.bandtec.bora.repository.UsuarioEventoRepositorio;

@Service
public class EventoService {

	@Autowired
	private EventoRepositorio eventoRepositorio;

	@Autowired
	private UsuarioEventoRepositorio usuarioEventoRepositorio;
	
	
	public List<Evento> buscarEventosHome(){
		return eventoRepositorio.findForHome(new PageRequest(0, 8));
	}
	
	@Transactional
	public void cadastrarEvento(CadastrarEventoDTO cadastrarEvento) {
		Usuario usuario = new Usuario();
		UsuarioEvento usuarioEvento = new UsuarioEvento();
		Evento evento = new Evento();
		usuario.setIdUsuario(cadastrarEvento.getUsuario().getIdUsuario());
		
		evento.setCategoria(cadastrarEvento.getEvento().getCategoria());
		evento.setDataHoraInicio(cadastrarEvento.getEvento().getDataHoraInicio());
		evento.setEndereco(cadastrarEvento.getEvento().getEndereco());
		evento.setNome(cadastrarEvento.getEvento().getNome());
		evento.setOrganizador(usuario);

		usuarioEventoRepositorio.save(usuarioEvento);
		usuarioEvento.setEvento(evento);
		usuarioEvento.setUsuario(usuario);
		usuarioEvento.setOrganizador(true);
		
	}	
	
	public Evento atualizarEvento(Long idEvento, Evento evento) {
		evento.setIdEvento(idEvento);
		evento.setNome(evento.getNome());
		evento.setEndereco(evento.getEndereco());
		evento.setCategoria(evento.getCategoria());
		evento.setDataHoraInicio(evento.getDataHoraInicio());
		return eventoRepositorio.save(evento);
	}
	
	public Evento entrarEvento(Long idEvento, Usuario usuario) {
		UsuarioEvento usuarioEvento = new UsuarioEvento();
		Evento evento = eventoRepositorio.findById(idEvento).orElse(null);
		usuarioEvento.setEvento(evento);
		usuarioEvento.setUsuario(usuario);
		usuarioEvento.setOrganizador(false);
		usuarioEventoRepositorio.save(usuarioEvento);
		return evento;
	}
	
	public List<Evento> buscarTodosEventos(Evento evento) {
		return eventoRepositorio.findAll();
	}

	public List<Evento> buscarEventoPorNome(String nomeEvento) throws Exception {
		List<Evento> eventos = eventoRepositorio.findByNome(nomeEvento);
		if (eventos.isEmpty()) {
			throw new Exception("Evento não encontrado"); 
		}
		return eventos;
	}
	
	public Evento buscarEventoPorIdEvento(Long idEvento) throws Exception {
		Evento evento = eventoRepositorio.findById(idEvento).orElse(null);
		if (evento == null) {
			throw new Exception("Evento não encontrado");
		}
		return evento;
		
	}

//	public List<Evento> buscarEventosPorUsuario(Usuario usuario) {
//		return eventoRepositorio.findByOrganizador(usuario.getApelido());
//	}
		
}
