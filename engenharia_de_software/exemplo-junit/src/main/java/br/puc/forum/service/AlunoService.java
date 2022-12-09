package br.puc.forum.service;

import java.time.LocalDate;

import br.puc.forum.model.Aluno;

public class AlunoService {
	
	
	public static Aluno createAluno(String nome, Integer matricula) {
		String matriculaFormatada = String.format("%d%d", matricula, LocalDate.now().getYear());
		
		return new Aluno(nome, matriculaFormatada);
	}
	
	private static void calculaMedia(Aluno aluno) {
		double pesoUm =5;
		double pesoDois = 5;
		
		if(aluno.getN1() >= 4) {
			pesoUm = 7;
			pesoDois = 3;
		}
		
		aluno.setMedia((aluno.getN1()*pesoUm + aluno.getN2()*pesoDois)/(pesoUm+pesoDois));
	}
	
	public static double getMedia(Aluno aluno) {
		
		calculaMedia(aluno);
		
		return aluno.getMedia();
	}

}
