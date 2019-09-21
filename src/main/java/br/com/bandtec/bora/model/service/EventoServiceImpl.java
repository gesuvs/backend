package br.com.bandtec.bora.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bandtec.bora.model.dto.CadastrarEvento;
import br.com.bandtec.bora.model.entity.Evento;
import br.com.bandtec.bora.model.entity.Usuario;
import br.com.bandtec.bora.model.entity.UsuarioEvento;
import br.com.bandtec.bora.repository.EventoRepositorio;
import br.com.bandtec.bora.repository.UsuarioEventoRepositorio;

@Service
public class EventoServiceImpl implements EventoService{

	@Autowired
	private EventoRepositorio eventoRepositorio;

	@Autowired
	private UsuarioEventoRepositorio usuarioEventoRepositorio;
	
	@Override
	public Evento criarEvento(Evento evento) {
		return eventoRepositorio.save(evento); 
	}

	@Override
	public Evento atualizarEvento(Long idEvento, Evento evento) {
		evento.setIdEvento(idEvento);
		evento.setNome(evento.getNome());
		evento.setEndereco(evento.getEndereco());
		evento.setCategoria(evento.getCategoria());
		evento.setDataHora(evento.getDataHora());
		return eventoRepositorio.save(evento);
	}

	@Override
	public List<Evento> buscarEventoPorNome(String nomeEvento) {
		return (List<Evento>) eventoRepositorio.findByNome(nomeEvento);
	}

	public List<Evento> buscarEventosPorUsuario(Usuario usuario) {
		return eventoRepositorio.findByOrganizador(usuario.getUsuario());
	}
	
	public List<Evento> buscarTodosEventos(Evento evento) {
		return eventoRepositorio.findAll();
	}

//	@Transactional
//	public void cadastrarEvento(UsuarioEvento evento) {
//		usuarioEventoRepositorio.save(evento);
//		evento.setParticipante(new CadastrarEvento().getUsuario());
//		evento.setEvento(new CadastrarEvento().getEvento());
//	}

	@Override
	public void cadastrarEvento(CadastrarEvento cadastrarEvento) {
		Evento evento = new Evento();
		UsuarioEvento usuarioEvento = new UsuarioEvento();
		usuarioEventoRepositorio.save(usuarioEvento);
//		Usuario usuario = new Usuario();
//		cadastrarEvento.setUsuario(new Usuario());
//		cadastrarEvento.setEvento(new Evento());
//		Evento evento = new Evento();
//		evento.setNome(cadastrarEvento.getNome());
//		evento.setCategoria(cadastrarEvento.getCategoria());
//		evento.setDataHora(cadastrarEvento.getDataHora());
//		evento.setEndereco(cadastrarEvento.getEndereco());
//		evento.setOrganizador(cadastrarEvento.getUsuario());
//		eventoRepositorio.save(evento);
	}

//	@Override
//	public void cadastrarEvento(CadastrarEvento cadastrarEvento) {
//		// TODO Auto-generated method stub
//		
//	}

	
}
