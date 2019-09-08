//package br.com.bandtec.bora.security;
//
//import br.com.bandtec.bora.model.entity.Usuario;
//import br.com.bandtec.bora.repository.UsuarioRepositorio;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Repository;
//
//
//@Repository
//public class ImplementsUserDetailsService implements UserDetailsService{
//
//	@Autowired
//	private UsuarioRepositorio ur;
//	
//	@Override
//	public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
//		Usuario procuraUsuario = ur.findByIdUsuario(usuario);
//		
//		if(procuraUsuario == null){
//			throw new UsernameNotFoundException("Usuario não encontrado!");
//		}
//		return procuraUsuario;
//	}
//
//}
