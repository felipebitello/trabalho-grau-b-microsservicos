package com.academia.plano.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.plano.model.Plano;

public interface PlanoRepository extends JpaRepository<Plano, Long> {

}
