	package br.com.bandtec.bora.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.bandtec.bora.model.entity.Usuario;

@Service
public interface UsuarioService {
	Usuario cadastrarUsuario(Usuario usuario);

	List<Usuario> buscarTodosUsuarios();
	
	Usuario buscarUsuarioPeloIdUsuario(Long idUsuario);
	
	void deletarUsuario(Long idUsuario);

}