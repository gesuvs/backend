package br.com.bandtec.bora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.bandtec.bora.model.entity.UsuarioEvento;;

@Repository
public interface UsuarioEvento extends JpaRepository<UsuarioEvento,Long>{
	
}
