package br.com.bandtec.bora.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.bandtec.bora.model.entity.Sala;
import br.com.bandtec.bora.model.entity.Usuario;
import br.com.bandtec.bora.model.service.SalaService;
import br.com.bandtec.bora.repository.SalaRepositorio;


@RestController
@RequestMapping("/salas")
public class SalaController {
	
	@Autowired
	private SalaService salaService;
	
	@PostMapping("/sala")
	public ResponseEntity<Sala> cadastraSala(@RequestBody Sala sala) {

		return ResponseEntity.ok(salaService.cadastrarSala(sala));
	}
	
//	@PutMapping("/sala")
//	public ResponseEntity<Sala> atualizarSala(@RequestBody Sala sala) {
//		
//		return ResponseEntity.ok(salaService.atualizarSala(sala));
//	}
	
	@PutMapping("/sala/{idSala}")
	public ResponseEntity<Sala> atualizarSala(@PathVariable (value = "idSala") Long idSala,
			@Valid @RequestBody Sala sala) {
		return ResponseEntity.ok(salaService.atualizarSala(sala));
	}

}