package br.com.bandtec.bora.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.bandtec.bora.model.dto.CadastrarEvento;
import br.com.bandtec.bora.model.entity.Evento;
import br.com.bandtec.bora.model.entity.Usuario;
import br.com.bandtec.bora.model.entity.UsuarioEvento;

@Service
public interface EventoService {
	
	Evento criarEvento(Evento evento);
	
	Evento atualizarEvento(Long idEvento, Evento evento);

	List<Evento> buscarEventoPorNome(String nomeEvento);
	
	List<Evento> buscarEventosPorUsuario(Usuario usuario);
	
	List<Evento> buscarTodosEventos(Evento evento);

	void cadastrarEvento(CadastrarEvento cadastrarEvento);

		
}
