package br.com.bandtec.bora.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
