package com.exercicioBD.OneToManyManyToOne.repository;

import com.exercicioBD.OneToManyManyToOne.model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoRepository extends JpaRepository<EstadoModel, Integer> {


}
