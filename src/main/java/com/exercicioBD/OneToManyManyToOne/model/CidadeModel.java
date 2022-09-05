package com.exercicioBD.OneToManyManyToOne.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "cidades")
public class CidadeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCidade;

    @Column(length = 50)
    private String nomeCidade;


    @ManyToOne
    @JoinColumn(name = "nomeEstado",referencedColumnName = "idEstado")
    private EstadoModel estado;
}

