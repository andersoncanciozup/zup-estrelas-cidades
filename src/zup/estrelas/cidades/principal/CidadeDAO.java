package zup.estrelas.cidades.principal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import zup.estrelas.cidades.connectionfactory.ConnectionFactory;

public class CidadeDAO {
	private Connection conn;

	public CidadeDAO() {
		this.conn = new ConnectionFactory().fabricaConexao();
	}

	public boolean insereCidade(Cidade cidade) throws SQLException {
		
		String sql = "insert into cidade "
				+ "(nome, cep, numero_de_habitantes, capital, estado, renda_per_capta, data_de_fundacao "
				+ "values (?, ?, ?, ?, ?, ?, ?);";
		
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setString(1, cidade.getNome());
				stmt.setString(2, cidade.getCep());
				stmt.setInt(3, cidade.getNumeroHabitantes());
				stmt.setBoolean(4, cidade.isCapital());
				stmt.setString(5, cidade.getEstado());
				stmt.setFloat(6, cidade.getRendaPerCapta());
				stmt.setString(7, cidade.getDataDeFundacao());
				
			
				stmt.execute();
				stmt.close();
				return true;
	}
}
