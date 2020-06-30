package br.com.itau.aula.model;

public class Usuario {
	private int id;
	private String nome;
	private String senha;
	private String email;
	private String foto;

	public Usuario() {
		super();
	}
	
	public Usuario(int id, String nome, String senha, String email, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.foto = foto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
