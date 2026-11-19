package com.academia.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@RequestMapping("/fallback/alunos")
	public String alunosFallback() {
		return "Servico de alunos fora do ar, tente mais tarde";
	}

	@RequestMapping("/fallback/planos")
	public String planosFallback() {
		return "Servico de planos fora do ar, tente mais tarde";
	}

}
