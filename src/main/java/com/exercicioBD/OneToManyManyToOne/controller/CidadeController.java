package com.exercicioBD.OneToManyManyToOne.controller;

import com.exercicioBD.OneToManyManyToOne.model.CidadeModel;
import com.exercicioBD.OneToManyManyToOne.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class CidadeController {

    @Autowired

    private CidadeService service;

    @GetMapping( path = "/cidades")
    public List<CidadeModel> buscaCidades(){
        return service.buscaCidade();
    }

    @GetMapping(path = "/cidades/{idCidade}")
    public Optional<CidadeModel> buscaPorId (@PathVariable Integer idCidade){
        return service.buscaPorId(idCidade);
    }

    @PostMapping(path = "/cidades")
    @ResponseStatus(HttpStatus.CREATED)
    public CidadeModel cadastrarCidade(@RequestBody CidadeModel cidadeModel){
        return service.cadastrarCidade(cidadeModel);
    }

    @PutMapping(path ="/cidades/{idCidade}")
    public  CidadeModel atualizarCidade(@RequestBody CidadeModel cidadeModel){
        return service.atualizarCidade(cidadeModel);
    }

    @DeleteMapping (path = "/cidades/{idCidade}")
    public void deletarCidade(@PathVariable Integer idCidade){
        service.deletarCidade(idCidade);
    }

}
