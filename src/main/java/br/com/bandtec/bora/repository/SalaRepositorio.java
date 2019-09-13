package br.com.bandtec.bora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bandtec.bora.model.entity.Sala;

@Repository
public interface SalaRepositorio extends JpaRepository<Sala, Long>{

}
