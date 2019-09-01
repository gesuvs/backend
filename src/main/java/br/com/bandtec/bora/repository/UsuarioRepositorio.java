package br.com.bandtec.bora.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.bandtec.bora.model.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Long>{
		
}
