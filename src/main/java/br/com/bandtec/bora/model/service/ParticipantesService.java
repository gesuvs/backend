package br.com.bandtec.bora.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.bandtec.bora.model.entity.UsuarioEvento;
import br.com.bandtec.bora.repository.UsuarioEventoRepositorio;

@Service
public class ParticipantesService {
	
	@Autowired
	private UsuarioEventoRepositorio usuarioEventoRepositorio;
	
	public List<UsuarioEvento> buscarParticipanteEvento() throws Exception{
		List<UsuarioEvento> participantes = usuarioEventoRepositorio.findAll();
		if (participantes.isEmpty()) {
			throw new Exception("Participante não encontrado");
		}
		return participantes;
	}	
}