package br.com.universidade.modelo;

public class Aluno {
	private String nome;
	private int numeroMatricula;
	private String email;

	public void preencherNome(String pNome) {
		if (pNome.length() <= 50) {
			nome = pNome.toUpperCase();
		}
		else {
			throw new RuntimeException();
		}
	}
	public String exibirNome() {
		return nome;
	}
	public void preencherNumeroMatricula(int pNumeroMatricula) {
		numeroMatricula = pNumeroMatricula;
	}
	public int exibirNumeroMatricula() {
		return numeroMatricula;
	}
	public void preencherEmail(String pEmail) {
		email = pEmail;
	}
	public String exibirEmail() {
		return email;
	}
	public void preencherTudo(String pNome, int pNumeroMatricula, String pEmail) {
		nome = pNome;
		numeroMatricula = pNumeroMatricula;
		email = pEmail;
	}
	public String exibirTudo() {
		return nome + "-" + numeroMatricula +"-"+ email;
	}
}
