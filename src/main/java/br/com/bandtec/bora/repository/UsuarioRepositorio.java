package br.com.bandtec.bora.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bandtec.bora.model.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {
}
