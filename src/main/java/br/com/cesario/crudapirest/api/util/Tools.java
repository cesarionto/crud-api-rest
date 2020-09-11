package br.com.cesario.crudapirest.api.util;

import br.com.cesario.crudapirest.api.model.ContatoDTO;
import br.com.cesario.crudapirest.domain.model.Contato;
import org.springframework.context.annotation.Bean;


public class Tools {
    public Contato convertDtoToEntity(ContatoDTO contatoDTO){
        Contato contato = new Contato();
        contato.setNome(contatoDTO.getNome());
        contato.setTelefone(contatoDTO.getTelefone());

        return contato;
    }
}
