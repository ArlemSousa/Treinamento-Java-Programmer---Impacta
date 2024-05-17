package br.com.cursojava.projetofinal.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class GenericDAO extends AbstractDAO {

	public String executeExtenso(Integer numero) throws DAOException {

		Connection cn = null;
		CallableStatement cs = null;
		
		try {

			cn = getConnection();
			cs = cn.prepareCall("{ call impacta.prc_numero_extenso(?, ?) }");

			cs.setInt(1, numero);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.executeUpdate();

			return cs.getString(2);

		} catch (SQLException e) {
			throw new DAOException("Nao foi possivel calcular o valor por extenso", e);
		} finally {
			closeResources(cn, cs, null);
		}
	}
}
