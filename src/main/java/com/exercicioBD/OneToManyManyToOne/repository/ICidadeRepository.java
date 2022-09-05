package com.exercicioBD.OneToManyManyToOne.repository;

import com.exercicioBD.OneToManyManyToOne.model.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICidadeRepository extends JpaRepository<CidadeModel, Integer> {
}
