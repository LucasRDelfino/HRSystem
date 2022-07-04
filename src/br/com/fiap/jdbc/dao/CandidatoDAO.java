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



public class CandidatoDAO {
	private Connection conexao;
	
	
	public CandidatoDAO() {
		 				
	}
	
	public void insert(Candidato candidato) throws SQLException {
		String sql = "insert into usuario (idcandidato,nome,data_nasc,genero,tempo_experiencia,formacao,telefone,email,endereco) values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setLong(1,candidato.getId());
		stmt.setString(2,candidato.getNome());
		stmt.setDate(3,candidato.getDtNascimento());
		stmt.setString(4,candidato.getGenero());
		stmt.setFloat(5,candidato.getTempoExperiencia());
		stmt.setString(6,candidato.getFormacao());
		stmt.setString(7,candidato.getTelefone());
		stmt.setString(8,candidato.getEmail());
		stmt.setString(9,candidato.getEndereco());
		
		
		stmt.execute();
		stmt.close();
		
		
		
	}
	public List<Candidato> select() throws SQLException {
		List<Candidato> usuarios = new ArrayList<Candidato>();
		String sql = "select * from usuario";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Candidato usuario = new Candidato();
			usuario.setId(rs.getLong("id"));
			usuario.setNome(rs.getString("nome"));
			usuario.setDtNascimento(rs.getDate("data"));
			usuario.setGenero(rs.getString("Genero"));
			usuario.setTempoExperiencia(rs.getLong("Tempo Experiencia"));
			usuario.setFormacao(rs.getString("Formacao"));
			usuario. setTelefone(rs.getString("telefone"));
			usuario.setEmail(rs.getString("email"));
			usuario.setEndereco(rs.getString("Endereco"));
			usuarios .add(usuario);
}
		
			rs.close();
			stmt.close();
			return usuarios;
	}
	
	
	public Candidato selectById(Long id) throws SQLException {
		Candidato usuario = null;
		String sql = "select * from candidato where idcandidato=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setLong(1, id);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			usuario.setId(rs.getLong("id"));
			usuario.setNome(rs.getString("nome"));
			usuario.setDtNascimento(rs.getDate("data"));
			usuario.setGenero(rs.getString("Genero"));
			usuario.setTempoExperiencia(rs.getLong("Tempo Experiencia"));
			usuario.setFormacao(rs.getString("Formacao"));
			usuario. setTelefone(rs.getString("telefone"));
			usuario.setEmail(rs.getString("email"));
			usuario.setEndereco(rs.getString("Endereco"));
			rs.close();
			stmt.close();
			return usuario;
			
		}
		return usuario;
	}	
			public void delete(Long id) throws SQLException {
			String sql = "delete from candidato where idcandidato=?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
			}
			
		public void update(Candidato candidato) throws SQLException {
			String sql = "update candidato set nome=?,data_nasc=?,genero=?,tempo_experiencia=?,formacao=?,telefone=?,email=?,endereco=?,where idcandidato=?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1,candidato.getId());
			stmt.setString(2,candidato.getNome());
			stmt.setDate(3,candidato.getDtNascimento());
			stmt.setString(4,candidato.getGenero());
			stmt.setFloat(5,candidato.getTempoExperiencia());
			stmt.setString(6,candidato.getFormacao());
			stmt.setString(7,candidato.getTelefone());
			stmt.setString(8,candidato.getEmail());
			stmt.setString(9,candidato.getEndereco());
			stmt.execute();
			stmt.close();
		}
		
}
