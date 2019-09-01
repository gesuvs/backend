package br.com.bandtec.bora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.bandtec.bora.model.Usuario;
import br.com.bandtec.bora.repository.UsuarioRepositorio;


@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {
	
	UsuarioRepositorio usuarioRepositorio;

	@Override
	public List<Usuario> obterTodosUsuarios() {
		return (List<Usuario>) usuarioRepositorio.findAll();
	}

}
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import br.com.bandtec.bora.model.Usuario;
//import br.com.bandtec.bora.repository.UsuarioRepositorio;
//
//public class UsuarioServiceImpl implements UsuarioService{
//	
//	@Autowired
//	private UsuarioRepositorio usuarioRepositorio;
//
//	@Override
//	public Optional<Usuario> buscarPeloIdUsuario(Long idUsuaio) {
//		return usuarioRepositorio.findById(idUsuaio);
//	}
//
//	@Override
//	public void cadastrarUsuario(Usuario usuario) {
//		usuarioRepositorio.save(usuario);
//		
//	}
//
//	@Override
//	public void alterarUsuario(Usuario usuario) {
//		cadastrarUsuario(usuario);
//	}
//
//	@Override
//	public void deletarUsuarioIdUsuario(Long idUsuario) {
//		usuarioRepositorio.deleteById(idUsuario);
//	}
//
//	@Override
//	public List<Usuario> buscarTodosUsuarios() {
//		return usuarioRepositorio.findAll();
//	}
//		
//}
