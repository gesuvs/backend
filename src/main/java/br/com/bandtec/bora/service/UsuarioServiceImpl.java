package br.com.bandtec.bora.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.bandtec.bora.model.Usuario;
import br.com.bandtec.bora.repository.UsuarioRepositorio;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Override
	public List<Usuario> buscarTodosUsuarios() {
		return (List<Usuario>) usuarioRepositorio.findAll();
	}
	
	@Override
	public Usuario cadastrarUsuario(Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}

	@Override
	public Usuario buscarUsuarioPeloIdUsuario(Long idUsuario) {
		return usuarioRepositorio.findById(idUsuario).orElse(null);
	}

	@Override
	public void deletarUsuario(Long idUsuario) {
		usuarioRepositorio.deleteById(idUsuario);
	}
}