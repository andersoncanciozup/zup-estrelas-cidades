package zup.estrelas.cidades.principal;

import java.sql.Connection;
import java.sql.SQLException;

import zup.estrelas.cidades.connectionfactory.ConnectionFactory;

public class ProgramaPrincipal {
	public static void main(String[] args) throws SQLException {

		Connection conn = new ConnectionFactory().fabricaConexao();
		System.out.println("Conectado!");
		
		CidadeDAO cidade = new CidadeDAO();
		
Cidade rio = new Cidade("Rio de Janeiro", "12345-098", 5000, true, "rj", 2000F, "2000-01-01");

cidade.insereCidade(rio);


		conn.close();
	}
}