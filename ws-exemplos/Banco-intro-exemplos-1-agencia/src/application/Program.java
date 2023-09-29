package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import entities.Carro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		Carro carro = new Carro();

		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from veiculos");

			while (rs.next()) {

				carro.addCarro(new Carro(rs.getString("marca"), rs.getString("modelo"), rs.getInt("ano"),
						rs.getString("placa")));
				System.out.println("Adicionando carro..");
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}

		for (Carro c : carro.getCarros()) {
			System.out.println(c.toString());
		}
	}

}
