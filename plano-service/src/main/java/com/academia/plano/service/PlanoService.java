package com.academia.plano.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.plano.model.Plano;
import com.academia.plano.repository.PlanoRepository;

@Service
public class PlanoService {
	
	@Autowired
	private PlanoRepository planoRepository;
	
	public List<Plano> getAll() {
		return planoRepository.findAll();
	}
	
	public Plano getById(Long id) {
		return planoRepository.findById(id).orElse(null);
	}

	public Plano save(Plano plano) {
		return planoRepository.save(plano);
	}
	
	public void delete(Long id) {
		planoRepository.deleteById(id);
	}
}
