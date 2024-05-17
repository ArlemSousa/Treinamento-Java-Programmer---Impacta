package br.com.cursojava.projetofinal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDAO {

	protected Connection getConnection() throws SQLException {
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/impacta?noAccessToProcedureBodies=true", "aluno", "java");
		return cn;
	}

	protected void closeResources(Connection cn, Statement st, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {}
		}

		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {}
		}

		if (cn != null) {
			try {
				cn.close();
			} catch (SQLException e) {}
		}
	}
}
