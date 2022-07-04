package br.com.fiap.jdbc.model;
import java.sql.Date;
public class Candidato {
	private long id,idArea;
	private String nome,genero,formacao,email,endereco,telefone;
	private float tempoExperiencia;
	private Date dtNascimento;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdArea() {
		return idArea;
	}
	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public float getTempoExperiencia() {
		return tempoExperiencia;
	}
	public void setTempoExperiencia(float tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
}
