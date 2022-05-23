package com.aulas.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aulas.mvc.entidades.Compromisso;
import com.aulas.mvc.entidades.Contato;
import com.aulas.mvc.interfaces.IDAO;
import com.aulas.mvc.utilidades.Conexao;

public class DaoCompromisso implements IDAO<Compromisso> {

	@Override
	public boolean salvar(Compromisso obj) {
		Connection con = Conexao.conectar();
		String sql = "insert into compromisso (local, datahora, idcontato) values (?, ?, ?)";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getLocal());
			stm.setDate(2, obj.getDatahora());
			stm.setInt(3, obj.getContato().getId());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			Conexao.closeConexao();
		}
		return true;
	}

	@Override
	public Compromisso getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compromisso> getTodos() {
		List<Compromisso> lista = new ArrayList<>();
		Connection con = Conexao.conectar();
		try {
			String sql = "select comp.id as idcompromisso, comp.datahora, "
					+ " comp.local, ct.id as idcontato, ct.nome, ct.email "
					+ " from compromisso comp, contato ct "
					+ " where comp.idcontato = ct.id ";
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				Contato ct = new Contato(rs.getInt("idcontato"),
						                 rs.getString("nome"),
						                 rs.getString("email"));
				lista.add(new Compromisso(rs.getInt("idcompromisso"),
						                  rs.getDate("datahora"),
						                  rs.getString("local"),
						                  ct));
			}
		}
		catch(SQLException e) {
		  e.printStackTrace();	
		}
		finally {
			Conexao.closeConexao();
		}
		return lista;
	}

	@Override
	public boolean alterar(Compromisso obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public List<Compromisso> getFilter(String filtro) {
		List<Compromisso> lista = new ArrayList<>();
		Connection con = Conexao.conectar();
		try {
			String sql = "select comp.id as idcompromisso, comp.datahora, "
					+ " comp.local, ct.id as idcontato, ct.nome, ct.email "
					+ " from compromisso comp, contato ct "
					+ " where comp.idcontato = ct.id "
			        + " and lower(ct.nome) like lower('"+filtro+"%')";
			PreparedStatement stm = con.prepareStatement(sql);
					
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				Contato ct = new Contato(rs.getInt("idcontato"),
						                 rs.getString("nome"),
						                 rs.getString("email"));
				lista.add(new Compromisso(rs.getInt("idcompromisso"),
						                  rs.getDate("datahora"),
						                  rs.getString("local"),
						                  ct));
			}
		}
		catch(SQLException e) {
		  e.printStackTrace();	
		}
		finally {
			Conexao.closeConexao();
		}
		return lista;
	}


}
