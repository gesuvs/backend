package br.com.bandtec.bora.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bandtec.bora.model.entity.Sala;
import br.com.bandtec.bora.repository.SalaRepositorio;

@Service
public class SalaServiceImpl implements SalaService{

	@Autowired
	private SalaRepositorio salaRepositorio;
	
	@Override
	public Sala cadastrarSala(Sala sala) {
		return salaRepositorio.save(sala); 
	}

	@Override
	public Sala atualizarSala(Sala sala) {
		sala = salaRepositorio.findById(sala.getIdSala()).get();
		sala.setNome(sala.getNome());
		sala.setCategoria(sala.getCategoria());
		return salaRepositorio.save(sala);
	}
	

}
