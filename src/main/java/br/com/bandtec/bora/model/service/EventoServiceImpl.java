package br.com.bandtec.bora.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bandtec.bora.model.entity.Evento;
import br.com.bandtec.bora.model.entity.Usuario;
import br.com.bandtec.bora.repository.EventoRepositorio;

@Service
public class EventoServiceImpl implements EventoService{

	@Autowired
	private EventoRepositorio eventoRepositorio;
	
	@Override
	public Evento cadastrarEvento(Evento evento) {
		return eventoRepositorio.save(evento); 
	}

	@Override
	public Evento atualizarEvento(Long idEvento, Evento evento) {
		evento.setIdEvento(idEvento);
		evento.setNome(evento.getNome());
		evento.setEndereco(evento.getEndereco());
		evento.setQtdPessoa(evento.getQtdPessoa());
		evento.setCategoria(evento.getCategoria());
		evento.setDataHora(evento.getDataHora());
		return eventoRepositorio.save(evento);
	}

	@Override
	public List<Evento> buscarEventosPorUsuario(Usuario usuario) {
		return eventoRepositorio.findByUsuario(usuario.getUsuario());
	}
	

}
