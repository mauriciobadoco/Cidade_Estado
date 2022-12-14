package com.exercicioBD.OneToManyManyToOne.service;

import com.exercicioBD.OneToManyManyToOne.model.EstadoModel;
import com.exercicioBD.OneToManyManyToOne.repository.IEstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired

    private IEstadoRepository repository;

    public List<EstadoModel> buscaEstado(){
        return repository.findAll();
    }

    public Optional<EstadoModel> buscaPorId(Integer idEstado){
        return repository.findById(idEstado);
    }

    public EstadoModel cadastrarEstado (EstadoModel estadoModel){
        return repository.save(estadoModel);
    }

    public EstadoModel atualizarEstado(EstadoModel estadoModel){
        return repository.save(estadoModel);
    }

    public void deletarEstado(Integer idEstado){
        repository.deleteById(idEstado);
    }
}
