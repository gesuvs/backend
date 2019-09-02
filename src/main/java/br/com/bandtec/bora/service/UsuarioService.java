package br.com.bandtec.bora.service;

import java.util.List;
import br.com.bandtec.bora.model.Usuario;

public interface UsuarioService {
	Usuario cadastrarUsuario(Usuario usuario);

	List<Usuario> buscarTodosUsuarios();
	
	Usuario buscarUsuarioPeloIdUsuario(Long idUsuario);
	
	void deletarUsuario(Long idUsuario);

}