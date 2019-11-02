
package br.com.bandtec.bora.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bandtec.bora.model.entity.Usuario;
import br.com.bandtec.bora.model.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;


	@PostMapping
	public ResponseEntity<Usuario> criarUsuario(@Valid @RequestBody Usuario usuario) {
		return ResponseEntity.ok(usuarioService.cadastrarUsuario(usuario));
	}
	
	@Deprecated
	@GetMapping
	public ResponseEntity<List<Usuario>> buscarTodosUsuario() throws Exception {
		return ResponseEntity.ok(usuarioService.buscarTodosUsuarios());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> buscarUsuarioPeloIdUsuario(@PathVariable(value = "id") Long idUsuario) throws Exception {
		return ResponseEntity.ok(usuarioService.buscarUsuarioPeloIdUsuario(idUsuario));

	}

	@DeleteMapping("/{idUsuario}")
	public void deletarUsuario(@PathVariable(value = "idUsuario") Long idUsuario) {
		 usuarioService.deletarUsuario(idUsuario);
	}

}
