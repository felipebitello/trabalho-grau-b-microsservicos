package com.academia.aluno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.aluno.dto.AlunoDTO;
import com.academia.aluno.model.Aluno;
import com.academia.aluno.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<AlunoDTO> getAll() {
		return alunoService.getAll();
	}

	@PostMapping
	public Aluno save(@RequestBody Aluno aluno) {
		return alunoService.save(aluno);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		alunoService.delete(id);
	}
}
