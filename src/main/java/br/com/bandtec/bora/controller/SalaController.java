package br.com.bandtec.bora.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.bandtec.bora.model.Sala;
import br.com.bandtec.bora.model.Usuario;
import br.com.bandtec.bora.repository.SalaRepositorio;
import br.com.bandtec.bora.service.SalaService;


@RestController
@RequestMapping("/salas")
public class SalaController {
	
	@Autowired
	SalaRepositorio salaRepositorio;
	SalaService salaService;
	
	@PostMapping("/sala")
	public ResponseEntity<Sala> cadastraSala(@RequestBody Sala sala) {

		Sala salvaUsuario = salaService.cadastrarSala(sala);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().replacePath("/salas").path("/{id}")
				.buildAndExpand(salvaUsuario.getIdSala()).toUri();

		return ResponseEntity.created(uri).build();
	}
	
}
