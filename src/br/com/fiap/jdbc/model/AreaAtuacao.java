package br.com.fiap.jdbc.model;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.model.Candidato;

public class AreaAtuacao {
	private long id;
	private String nome;
	private List<Candidato> candidatos = new ArrayList<Candidato>();
	
	public List<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}