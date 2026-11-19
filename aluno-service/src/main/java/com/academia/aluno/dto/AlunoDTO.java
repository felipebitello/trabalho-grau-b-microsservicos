package com.academia.aluno.dto;

import com.academia.aluno.model.Aluno;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AlunoDTO {
	private Long id;
	private String nome;
	private String cpf;
	private Integer idade;
	private String plano;
	private Double valorMensal;
	
	public static AlunoDTO from(Aluno aluno, PlanoDTO plano) {
		if (plano == null) {
			plano = new PlanoDTO();
			plano.setNome("Plano nao encontrado");
		}
		return AlunoDTO.builder()
					.id(aluno.getId())
					.nome(aluno.getNome())
					.cpf(aluno.getCpf())
					.idade(aluno.getIdade())
					.plano(plano.getNome())
					.valorMensal(plano.getValorMensal())
					.build();
	}
}
