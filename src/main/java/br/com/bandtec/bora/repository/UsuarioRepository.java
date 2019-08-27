package br.com.bandtec.bora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bandtec.bora.model.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}
