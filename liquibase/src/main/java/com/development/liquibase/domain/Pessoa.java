package com.development.liquibase.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "PESSOA")
public class Pessoa {

    @Id
    private Long id;

    private String nome;

    private String email;

    private Integer contato;
}