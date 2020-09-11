package br.com.cesario.crudapirest.domain.service;

import br.com.cesario.crudapirest.domain.model.Contato;
import br.com.cesario.crudapirest.domain.repository.ContatoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ContatoService {

    private ContatoRepository contatoRepository;

    public Contato salvar(Contato contato) {
        return contatoRepository.save(contato);
    }

    public Contato atualizar(Contato contato) {
        return contatoRepository.save(contato);
    }

    public void deletar(Contato contato) {
        contatoRepository.delete(contato);
    }

    public List<Contato> listar() {
        return contatoRepository.findAll();
    }

    public Optional<Contato> getContatoById(long id){
        return contatoRepository.findById(id);
    }
}
