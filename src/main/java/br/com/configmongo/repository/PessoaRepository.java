package br.com.configmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.configmongo.model.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, String> {

}
