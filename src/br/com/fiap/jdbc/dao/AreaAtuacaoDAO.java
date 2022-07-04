package br.com.fiap.jdbc.dao;

import java.awt.geom.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.model.Candidato;

public class AreaAtuacaoDAO {
	private Connection connection;
	
	
	public List<Area> listarComCandidato() {
		try {
			Area areaAtual = null;
			List<Area> areas = new ArrayList<Area>();

			String sql = "SELECT A.idArea, A.nome, C.idCandidato, C.nome, C.dataNasc, C.genero, C.tempoExperiencia, C.formacao, C.telefone, C.email, C.endereco, C.idArea FROM AREA A INNER JOIN CANDIDATO C ON A.idArea = C.idArea order by C.idArea";

			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.execute();
				ResultSet rs = stmt.getResultSet();
				while (rs.next()) {
					if (areaAtual == null || !areaAtual.getNome().equals(rs.getString(2))) {
						Area area = new Area();
						area.setId(rs.getLong(1));
						area.setNome(rs.getString(2));
						areas.add(area);
						areaAtual = area;
					}
					Candidato candidato = new Candidato();
					candidato.setId(rs.getInt(3));
					candidato.setNome(rs.getString(4));
					candidato.setDtNasc(rs.getDate(5));
					candidato.setGenero(rs.getString(6));
					candidato.setTempoExperiencia(rs.getFloat(7));
					candidato.setFormacao(rs.getString(8));
					candidato.setTelefone(rs.getString(9));
					candidato.setEmail(rs.getString(10));
					candidato.setEndereco(rs.getString(11));
					candidato.setIdArea(rs.getInt(12));

					areaAtual.adicionarCandidato(candidato);
				}
				rs.close();
				stmt.close();
				return areas;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
