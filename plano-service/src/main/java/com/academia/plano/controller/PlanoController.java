package com.academia.plano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.plano.model.Plano;
import com.academia.plano.service.PlanoService;

@RestController
@RequestMapping("/planos")
public class PlanoController {
	
	@Autowired
	private PlanoService planoService;
	
	@GetMapping
	public List<Plano> getAll() {
		return planoService.getAll();
	}
	
	@GetMapping("/{id}")
	public Plano getById(@PathVariable Long id) {
		return planoService.getById(id);
	}

	@PostMapping
	public Plano save(@RequestBody Plano plano) {
		return planoService.save(plano);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		planoService.delete(id);
	}
}
