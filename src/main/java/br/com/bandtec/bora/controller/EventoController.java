package br.com.bandtec.bora.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.bandtec.bora.model.entity.Evento;
import br.com.bandtec.bora.model.entity.Usuario;
import br.com.bandtec.bora.model.service.EventoService;
import br.com.bandtec.bora.repository.EventoRepositorio;


@RestController
@RequestMapping("/api")
public class EventoController {
	
	@Autowired
	private EventoService eventoService;
	
	
	@PostMapping("/eventos")
	public ResponseEntity<Evento> cadastraEvento(@RequestBody Evento evento) {
		return ResponseEntity.ok(eventoService.cadastrarEvento(evento));
	}
	
	@PutMapping("/eventos/{idEvento}")
	public ResponseEntity<Evento> atualizarEvento(@PathVariable(value="idEvento") Long idEvento, 
			@Valid @RequestBody Evento evento) {
		return ResponseEntity.ok(eventoService.atualizarEvento(idEvento, evento));
	}
	
	@GetMapping("/eventos/{usuario}")
	public ResponseEntity<Evento> buscarEventoPorUsuario(@PathVariable(value='usuario') String usuario,
			@Valid @RequestBody Evento evento){
		return ResponseEntity.ok(eventoService.buscarEventoPorUsuario());
	}

}