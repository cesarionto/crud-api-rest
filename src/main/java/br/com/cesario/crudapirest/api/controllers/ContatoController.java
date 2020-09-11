package br.com.cesario.crudapirest.api.controllers;

import br.com.cesario.crudapirest.api.model.ContatoDTO;
import br.com.cesario.crudapirest.api.util.Tools;
import br.com.cesario.crudapirest.domain.model.Contato;
import br.com.cesario.crudapirest.domain.service.ContatoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contatos")

public class ContatoController {

    private ContatoService contatoService;
    Tools tools = new Tools();

    public ContatoController(ContatoService contatoService){
        this.contatoService = contatoService;
    }
    @PostMapping
    public ResponseEntity salvar(@RequestBody ContatoDTO contatoDTO){
        Contato contato = tools.convertDtoToEntity(contatoDTO);
        contatoService.salvar(contato);
        return new ResponseEntity(contato, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity listar(){
        List<Contato> contatos = contatoService.listar();
        return ResponseEntity.ok(contatos);
    }
    @PutMapping("{id}")
    public ResponseEntity atualizar(@PathVariable long id, @RequestBody ContatoDTO contatoDTO){
        return contatoService.getContatoById(id).map(entity ->{
            Contato contato = tools.convertDtoToEntity(contatoDTO);
            contato.setId(entity.getId());
            contatoService.atualizar(contato);
            return ResponseEntity.ok(contato);
        }).orElseGet(()-> new ResponseEntity("Contato não encontrado", HttpStatus.BAD_REQUEST));
    }

    @DeleteMapping("{id}")
    public ResponseEntity deletar(@PathVariable long id){
        return contatoService.getContatoById(id).map(entity ->{
            contatoService.deletar(entity);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }).orElseGet(()-> new ResponseEntity("Contato não encontrado", HttpStatus.BAD_REQUEST));
    }
}
