package br.com.bandtec.bora.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.bandtec.bora.model.Usuario;
import br.com.bandtec.bora.repository.UsuarioRepositorio;
import br.com.bandtec.bora.service.UsuarioService;
import br.com.bandtec.bora.service.UsuarioServiceImpl;

@RestController
@RequestMapping("/api")
@EnableAutoConfiguration
public class UsuarioController {
	
	UsuarioServiceImpl usuarioServiceImpl;
		
//	UsuarioRepositorio usuarioRepositorio;
//	@Autowired
	//private UsuarioService usuarioService;

//	UsuarioRepositorio usuarioRepositorio;

//	private List<Usuario> obterTodosUsuarios;

//	public UsuarioController() {
//		this.obterTodosUsuarios = todosUsuarios();
//	}

//	public UsuarioController(UsuarioRepositorio usuarioRepositorio) {
//		this.usuarioRepositorio = usuarioRepositorio;
//	}
//
//	public UsuarioController(UsuarioDAO usuarioDAO) {
//		this.usuarioDAO = usuarioDAO;
//	}

	/*
	 * Para cadastrar um usuario
	 */
//	@PostMapping("/usuarios")
//	public Usuario criarUsuario(@Valid @RequestBody Usuario usuario) {
//		return usuarioDAO.cadastrar(usuario);
//	}

	/*
	 * Para buscar todos os usuarios cadastrados
	 */

	@GetMapping
	public List<Usuario> todosUsuarios() {
		return usuarioServiceImpl.obterTodosUsuarios();
		//return usuarioDAO.buscarTodosUsuarios();
	}

	/*
	 * Para buscar usuarios cadastrados pelo idUsuario
	 */

//	@GetMapping("usuarios/{idUsuario}")
//	public ResponseEntity<Optional<Usuario>> buscarUsuarioPeloIdUsuario(
//			@PathVariable(value = "idUsuario") Long idUsuario) {
//
//		Optional<Usuario> buscarUsuario = usuarioDAO.encontrarUsuarioPeloId(idUsuario);
//
//		if (buscarUsuario == null) {
//			return ResponseEntity.notFound().build();
//		}
//
//		return ResponseEntity.ok(buscarUsuario);
//
//	}
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
//	/*
//	 * Deletar um usuario
//	 */
//	@DeleteMapping("usuarios/{idUsuario}")
//	public ResponseEntity<Usuario> deletarUsuario(@PathVariable(value = "idUsuario") Long idUsuario) {
//
//		if (buscarUsuarioPeloIdUsuario(idUsuario) == null) {
//			return ResponseEntity.notFound().build();
//		}
//
//		usuarioDAO.deletarUsuario(idUsuario);
//		return ResponseEntity.ok().build();
//	}
//
//	private List<Usuario> todosUsuarios() {
//		return obterTodosUsuarios;
//	}

}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * private UsuarioRepositorio usuarioRepositorio; private List<Usuario>
 * obterTodosUsuarios; // UsuarioService usuarioService;
 * 
 * public UsuarioController() { this.obterTodosUsuarios = todosUsuarios(); }
 * 
 * @PostMapping("/cadastro") public ResponseEntity<Usuario>
 * cadastraUsuario(@RequestBody Usuario usuario) {
 * 
 * Usuario salvaUsuario = usuarioRepository.save(usuario); // Usuario
 * salvaUsuario = usuarioService.validaCadastro(usuario);
 * 
 * URI uri =
 * ServletUriComponentsBuilder.fromCurrentRequest().replacePath("/usuarios").
 * path("/{id}") .buildAndExpand(salvaUsuario.getIdUsuario()).toUri();
 * 
 * return ResponseEntity.created(uri).build(); }
 * 
 * @GetMapping("/usuarios") public ResponseEntity<List<Usuario>>
 * usuariosTodos(Usuario usuario) { return
 * ResponseEntity.ok(usuarioRepository.findAll()); }
 * 
 * @GetMapping("/usuarios/{idUsuario}") public ResponseEntity<Optional<Usuario>>
 * buscarPorNomeUsuario(@PathVariable Long idUsuario) { return
 * ResponseEntity.ok(usuarioRepository.findById(idUsuario)); // for (Usuario
 * usuario : obterTodosUsuarios) { // if
 * (usuario.getIdUsuario().equals(idUsuario)) { // return
 * ResponseEntity.ok(usuario); // } // } // return
 * ResponseEntity.noContent().build(); }
 * 
 * private List<Usuario> todosUsuarios() { return obterTodosUsuarios;
 * 
 * }
 */