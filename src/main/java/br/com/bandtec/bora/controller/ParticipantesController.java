package br.com.bandtec.bora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bandtec.bora.model.entity.UsuarioEvento;
import br.com.bandtec.bora.model.service.ParticipantesService;

@RestController
@RequestMapping("/api/participantes")
public class ParticipantesController {
	
	@Autowired
	private ParticipantesService participantesService;

	@GetMapping
	public ResponseEntity<List<UsuarioEvento>> buscarParticipantes() throws Exception{
		return ResponseEntity.ok(participantesService.buscarParticipanteEvento()); 
	}
	
}
