package br.com.bandtec.bora.model.service;

import org.springframework.stereotype.Service;

import br.com.bandtec.bora.model.entity.Sala;

@Service
public interface SalaService {
	Sala cadastrarSala(Sala sala);

}
