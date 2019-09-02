package br.com.bandtec.bora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bandtec.bora.model.Sala;
import br.com.bandtec.bora.repository.SalaRepositorio;

@Service
public class SalaServiceImpl implements SalaService{

	@Autowired
	private SalaRepositorio salaRepositorio;
	
	@Override
	public Sala cadastrarSala(Sala sala) {
		return salaRepositorio.save(sala); 
	}
	

}
