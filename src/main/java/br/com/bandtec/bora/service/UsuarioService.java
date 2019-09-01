package br.com.bandtec.bora.service;


import java.util.List;
import br.com.bandtec.bora.model.Usuario;


public interface UsuarioService {
	
	public List<Usuario> obterTodosUsuarios();	
	
	
}
	
	

//	@Autowired
//	private UsuarioRepositorio usuarioRepositorio;
//	
//	public List<Usuario> buscarUsuarios() {
//		return usuarioRepositorio.findAll();
//	}
//
//	public Optional<Usuario> buscarPeloIdUsuario(Long idUsuario) {
//		return usuarioRepositorio.findById(idUsuario);
//	}
//
//	public Usuario cadastrarUsuario(Usuario usuario) {
//		return usuarioRepositorio.save(usuario);
//	}
//
//	public void delatarPeloIdUsuario(Long idUsuario) {
//		usuarioRepositorio.deleteById(idUsuario);
//	}

//}
//	public Optional<Usuario> buscarPeloIdUsuario(Long idUsuaio);
//	public void cadastrarUsuario(Usuario usuario);
//	public void alterarUsuario(Usuario usuario);
//	public void deletarUsuarioIdUsuario(Long idUsuario);
//	
//	public List<Usuario> buscarTodosUsuarios();
//	
// public boolean existeUsuario(Usuario usuario);

//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import br.com.bandtec.bora.model.UsuarioDto;
//import br.com.bandtec.bora.repository.Usuario;
//import br.com.bandtec.bora.repository.UsuarioRepositorio;
//
//@Component
//@Service
//public class UsuarioService {
//	@Autowired
//	UsuarioRepositorio usuarioRepositorio;
//
//	public void criar(UsuarioDto usuarioDto) {
//		usuarioRepositorio.save(toEntity(usuarioDto));
//	}
//
//	public void deletar(Long idUsuario) {
//		usuarioRepositorio.deleteById(idUsuario);
//	}
//
//	public List<Usuario> obterUsuarios() {
//		return (List<Usuario>) usuarioRepositorio.findAll();
//	}
//
//	public Usuario obterPeloId(Long idUsuario) {
//		Optional<Usuario> usuarioPeloId = usuarioRepositorio.findById(idUsuario);
//		return usuarioPeloId.orElseThrow(
//				() -> new UsuarioNaoEncontradoExcecao("Nao encontrou nenhum usuario com esse id: " + idUsuario));
//	}
//
//	private Usuario toEntity(UsuarioDto usuarioDto) {
//		Usuario entity = new Usuario();
//		entity.setNome(usuarioDto.getNome());
//		return entity;
//	}
//
//}
