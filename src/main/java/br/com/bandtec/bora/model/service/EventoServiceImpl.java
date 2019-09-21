package br.com.bandtec.bora.model.service;

import java.util.List;

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
	public Evento cadastrarEvento(Evento evento) {
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

	@Override
	public void cadastrarEvento(CadastrarEvento cadastrarEvento) {
		UsuarioEvento usuarioEvento = new UsuarioEvento();
		CadastrarEvento cadastrarEvento2 = new CadastrarEvento();
		
		usuarioEventoRepositorio.save(usuarioEvento);
		usuarioEvento.setParticipante(cadastrarEvento2.getUsuario());
		usuarioEvento.setEvento(cadastrarEvento2.getEvento());
	}
}
