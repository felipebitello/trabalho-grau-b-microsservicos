package com.academia.aluno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.academia.aluno.dto.AlunoDTO;
import com.academia.aluno.dto.PlanoDTO;
import com.academia.aluno.model.Aluno;
import com.academia.aluno.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public List<AlunoDTO> getAll() {
		return alunoRepository.findAll().stream().map(a -> AlunoDTO.from(a, getPlano(a.getPlanoId()))).toList();
	}
	
	public Aluno save(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public void delete(Long id) {
		alunoRepository.deleteById(id);
	}

	private PlanoDTO getPlano(Long planoId) {
		try {
			return restTemplate.getForObject("http://PLANO-SERVICE/planos/" + planoId, PlanoDTO.class);
		} catch (Exception e) {
			return null;
		}
	}
}
