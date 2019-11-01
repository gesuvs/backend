package br.com.bandtec.bora.model.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
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

	
//	Cadastrar Evento
	
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
	
//	Atualizar Evento	
	
	public Evento atualizarEvento(Long idEvento, Evento evento) {
		evento.setIdEvento(idEvento);
		evento.setNome(evento.getNome());
		evento.setEndereco(evento.getEndereco());
		evento.setCategoria(evento.getCategoria());
		evento.setDataHoraInicio(evento.getDataHoraInicio());
		return eventoRepositorio.save(evento);
	}
	
// Buscar Evento por nome	

	public List<Evento> buscarEventoPorNome(String nomeEvento) {
		return (List<Evento>) eventoRepositorio.findByNome(nomeEvento);
	}

//	public List<Evento> buscarEventosPorUsuario(Usuario usuario) {
//		return eventoRepositorio.findByOrganizador(usuario.getApelido());
//	}

//	Buscar Todos os eventos	
	
	public List<Evento> buscarTodosEventos(Evento evento) {
		return eventoRepositorio.findAll();
	}
	
//	Entrar no evento selecionado	

	public Evento entrarEvento(Long idEvento, Usuario usuario) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario);
		
		Evento evento = eventoRepositorio.getOne(idEvento);
//		evento.setParticipantes(usuarios);
		
		eventoRepositorio.save(evento);
		
		return evento;
	}
}
