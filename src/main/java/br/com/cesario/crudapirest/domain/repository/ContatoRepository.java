package br.com.cesario.crudapirest.domain.repository;

import br.com.cesario.crudapirest.domain.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
