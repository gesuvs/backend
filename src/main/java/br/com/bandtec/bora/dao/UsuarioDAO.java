//package br.com.bandtec.bora.dao;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import br.com.bandtec.bora.model.Dao;
//import br.com.bandtec.bora.model.Usuario;
//import br.com.bandtec.bora.repository.UsuarioRepositorio;
//
//@Service
//public class UsuarioDAO implements Dao<Usuario> {
//
//	private List<Usuario> usuarios = new ArrayList<>();
//
//	@Override
//	public Optional<Usuario> get(int idUsuario) {
//		return Optional.ofNullable(usuarios.get(idUsuario));
//	}
//
//	@Override
//	public List<Usuario> getAll() {
//		return usuarios.stream().filter(Objects::nonNull)
//				.collect(Collectors.collectingAndThen(Collectors.toList(), 
//						Collections::unmodifiableList));
//	}
//	
//	
//	@Override
//	public int save(Usuario usuario) {
//		usuarios.add(usuario);
//		int index = usuarios.size() -1;
//		usuario.setIdUsuario(index);
//		return index;
//	}
//	
//	@Override
//	public void update(Usuario usuario) {
//		usuarios.set(usuario.getIdUsuario(), usuario);
//	}
//	
//	
//	@Override
//	public void delete(Usuario usuario) {
//		usuarios.set(usuario.getIdUsuario(), null);
//	}
//	
//
//	@Autowired
//	UsuarioRepositorio usuarioRepositorio;
//
//	/*
//	 * Para cadastrar um usuario
//	 */
//
//	public Usuario cadastrar(Usuario usuario) {
//		return usuarioRepositorio.save(usuario);
//	}
//
//	/*
//	 * Para buscar por todos os usuario
//	 */
//
//	public List<Usuario> buscarTodosUsuarios() {
//		return (List<Usuario>) usuarioRepositorio.findAll();
//	}
//
//	/*
//	 * Para buscar por usuario pelo idUsuario
//	 */
//	public Optional<Usuario> encontrarUsuarioPeloId(Long idUsuario) {
//		return usuarioRepositorio.findById(idUsuario);
//	}
//
//	/*
//	 * Para deletar um usuario
//	 */
//
//	public void deletarUsuario(Long idUsuario) {
//		usuarioRepositorio.deleteById(idUsuario);
//	}
//}
