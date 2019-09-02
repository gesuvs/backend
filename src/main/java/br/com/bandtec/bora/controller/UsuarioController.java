
package br.com.bandtec.bora.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.bandtec.bora.model.Usuario;
import br.com.bandtec.bora.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	/*
	 * Para cadastrar um usuario
	 */
	
	@PostMapping("/usuarios")
	public Usuario criarUsuario(@Valid @RequestBody Usuario usuario) {
		return usuarioService.cadastrarUsuario(usuario);
	}

	/*
	 * Para buscar todos os usuarios cadastrados
	 */

	@GetMapping("/usuarios")
	public List<Usuario> usuariosLoo() {
		return usuarioService.buscarTodosUsuarios();
	}

	/*
	 * Para buscar usuarios cadastrados pelo idUsuario
	 */

	@GetMapping("usuarios/{idUsuario}")
	public Usuario buscarUsuarioPeloIdUsuario(@PathVariable(value = "idUsuario") Long idUsuario) {
		Usuario buscarUsuario = usuarioService.buscarUsuarioPeloIdUsuario(idUsuario);

		if (buscarUsuario == null) {
			return null;
		}

		return usuarioService.buscarUsuarioPeloIdUsuario(idUsuario);

	}
//
//	/*
//	 * atualizar um usuario cadastrado pelo idUsuario
//	 */
//
//	@PutMapping("/usuarios/{idUsuario}")
//	public ResponseEntity<Usuario> atualizarUsuarioPeloIdUsuario(@PathVariable(value = "idUsuario") Long idUsuario,
//			@Valid @RequestBody Usuario usuario) {
//		Optional<Usuario> alterarUsuario = usuarioDAO.encontrarUsuarioPeloId(idUsuario);
//
//		if (alterarUsuario == null) {
//			return ResponseEntity.notFound().build();
//		}
//		usuario.setNome(usuario.getNome());
//		usuario.setUsuario(usuario.getUsuario());
//		usuario.setCelular(usuario.getCelular());
//		usuario.setSenha(usuario.getSenha());
//
//		Usuario usuarioAlterado = usuarioDAO.cadastrar(usuario);
//		return ResponseEntity.ok(usuarioAlterado);
//	}
//
	/*
	 * Deletar um usuario
	 */
	
	@DeleteMapping("usuarios/{idUsuario}")
	public void deletarUsuario(@PathVariable(value = "idUsuario") Long idUsuario) {
		 usuarioService.deletarUsuario(idUsuario);
	}
//
//	private List<Usuario> todosUsuarios() {
//		return obterTodosUsuarios;
//	}

}
