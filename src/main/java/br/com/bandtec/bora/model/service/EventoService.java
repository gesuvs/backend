package br.com.bandtec.bora.model.service;

import org.springframework.stereotype.Service;

import br.com.bandtec.bora.model.entity.Evento;

@Service
public interface EventoService {
	
	Evento cadastrarEvento(Evento evento);
	
	Evento atualizarEvento(Long idEvento, Evento evento);
}
