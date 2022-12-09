package br.puc.forum.model;

public class Aluno {

	private String nome;
	private String matricula;
	private double n1;
	private double n2;
	private double media;

	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
