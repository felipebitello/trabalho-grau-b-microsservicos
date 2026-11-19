package com.academia.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.aluno.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
