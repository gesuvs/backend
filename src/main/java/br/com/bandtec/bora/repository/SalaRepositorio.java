package br.com.bandtec.bora.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bandtec.bora.model.Sala;

@Repository
public interface SalaRepositorio extends CrudRepository<Sala, Long>{

}
