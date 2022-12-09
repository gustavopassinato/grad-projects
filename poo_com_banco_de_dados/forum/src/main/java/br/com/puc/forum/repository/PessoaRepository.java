package br.com.puc.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.puc.forum.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, String>{
	
	Optional<Pessoa> findByCpf(String cpf);

}
