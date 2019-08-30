package br.com.bandtec.bora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.bandtec.bora.model.Usuario;
import br.com.bandtec.bora.repository.UsuarioRepository;

import java.net.URI;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import br.com.bandtec.bora.service.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	UsuarioService usuarioService;
	
	@PostMapping("/cadastro")
	public ResponseEntity<Usuario> cadastraUsuario(@RequestBody Usuario usuario) {
		
//		Usuario salvaUsuario = usuarioRepository.save(usuario);
		Usuario salvaUsuario = usuarioService.validaCadastro(usuario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().replacePath("/usuarios").path("/{id}")
				.buildAndExpand(salvaUsuario.getIdUsuario()).toUri();
		
		return ResponseEntity.created(uri).build();
	}

}