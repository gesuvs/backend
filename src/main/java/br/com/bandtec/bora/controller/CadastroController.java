//package br.com.bandtec.bora.controller;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import br.com.bandtec.AgendaDeObjetivos.controller.Usuario;
//
//public class CadastroController {
//	
//	private List<Cadastro> cadastros;
//	
//	public CadastroController() {
//		this.cadastros = obterTodosUsuarios();
//	}
//	
//	@PostMapping("/usuarios/cadastro")
//	public ResponseEntity<List<Cadastro>> obterPorNome(@RequestBody String nome, String telefone){
//		List<Usuario> usuariosPorNome = new ArrayList<Usuario>();
//		for(Cadastro usuario: cadastros) {
//			if(usuario.getNome().(nome)) {
//				usuariosPorNome.add(usuario);
//			}
//		}
//		if(usuariosPorNome.isEmpty()) {
//			return ResponseEntity.noContent().build();
//		}
//		
//		return ResponseEntity.ok(usuariosPorNome);
//	}
//	
//	private List<Cadastro> obterTodosUsuarios(){
//		return Arrays.asList(
//				new Cadastro("Rodrigo",39),
//				new Cadastro("maia",20),
//				new Cadastro("joao",22)
//				);
//	}
//
//}
