package com.kenzo.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenzo.API.entity.Nota;

public interface NotaRepo extends JpaRepository<Nota, Long> {}


// métodos: save(), findAll(), findByID(), delete() já prontos da classe
