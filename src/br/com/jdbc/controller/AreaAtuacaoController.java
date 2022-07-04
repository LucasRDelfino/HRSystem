package br.com.jdbc.controller;

import br.com.fiap.jdbc.factory.ConnectionFactory;

public class AreaAtuacaoController {

	private AreaAtuacaoController areaDAO;

	public AreaAtuacaoController() {
		ConnectionFactory connection = new ConnectionFactory().conectar();
		areaDAO = new AreaAtuacaoController(connection);
	}

}