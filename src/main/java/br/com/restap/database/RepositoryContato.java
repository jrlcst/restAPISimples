package br.com.restap.database;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restap.entities.Contato;

public interface RepositoryContato extends JpaRepository<Contato, Long>{
	
}
