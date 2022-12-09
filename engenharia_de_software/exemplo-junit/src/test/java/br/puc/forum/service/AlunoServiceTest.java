package br.puc.forum.service;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import br.puc.forum.model.Aluno;

public class AlunoServiceTest {
	
	@Test
	public void testaCriacaoDeAlunoPeloServico() {
		String alunoNome = "Nome Teste";
		Integer matricula = 12345;

		Aluno aluno = AlunoService.createAluno(alunoNome, matricula);
		
		assertTrue(aluno.getNome().equals(alunoNome));
		assertTrue(aluno.getMatricula().contains(matricula.toString()));
		assertTrue(aluno.getMatricula().contains(String.valueOf(LocalDate.now().getYear())));
		
	}
	
	@Test
	public void testaMediaComN1MaiorQue4() {
		String alunoNome = "Nome Teste";
		Integer matricula = 12345;

		Aluno aluno = AlunoService.createAluno(alunoNome, matricula);
		aluno.setN1(10);
		aluno.setN2(5);
		
		double media = AlunoService.getMedia(aluno);
		
		assertTrue(media == 8.5);
	}
	
	@Test
	public void testaMediaComN1MenorQue4() {
		String alunoNome = "Nome Teste";
		Integer matricula = 12345;

		Aluno aluno = AlunoService.createAluno(alunoNome, matricula);
		aluno.setN1(3);
		aluno.setN2(10);
		
		double media = AlunoService.getMedia(aluno);
		
		assertTrue(media == 6.5);
	}

}
