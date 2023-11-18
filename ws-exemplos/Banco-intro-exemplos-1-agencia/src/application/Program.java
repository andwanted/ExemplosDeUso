package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import entities.Carro;

public class Program {

	public static void conectar() {

	}

	public static void consultar() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("SELECT marca FROM veiculos WHERE marca ='fiat'");

			while (rs.next()) {
				System.out.println(rs.getString("marca"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

	public static void inserir() {
		Connection conn = null;
		PreparedStatement st = null;

		List<Carro> carros = new ArrayList<>();

		carros.add(new Carro("Fiat", "Doblo", 2014, "JKO-2424"));
		carros.add(new Carro("Fiat", "Palio Young", 2002, "PAO-3421"));
		carros.add(new Carro("Fiat", "Palio ED", 1997, "EDE-9877"));
		carros.add(new Carro("Fiat", "Stilo", 2005, "RER-2424"));
		carros.add(new Carro("Hyunday", "Tucson", 2018, "JEE-1631"));

		for (int i = 0; i < carros.size(); i++) {

			try {
				conn = DB.getConnection();
				st = conn.prepareStatement(
						"INSERT INTO veiculos " + "(marca,modelo,ano,placa)" + "VALUES " + "(?,?,?,?)",
						Statement.RETURN_GENERATED_KEYS);
				st.setString(1, carros.get(i).getMarca());
				st.setString(2, carros.get(i).getModelo());
				st.setInt(3, carros.get(i).getAno());
				st.setString(4, carros.get(i).getPlaca());

				int rowsAffected = st.executeUpdate();

				if (rowsAffected > 0) {
					ResultSet rs = st.getGeneratedKeys();
					while (rs.next()) {
						int id = rs.getInt(1);
						System.out.println("Done! Id: " + id);
					}
				} else {
					System.out.println("No rows affected!");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

				DB.closeStatement(st);
				DB.closeConnection();
			}

		}

	}

	public static void remover() {
		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("DELETE FROM veiculos " + "WHERE ano = ?", Statement.RETURN_GENERATED_KEYS);
			st.setInt(1, 2018);

			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {

				System.out.println("Done!");

			} else {
				System.out.println("No rows affected!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro = new Carro();

		// remover();
		inserir();
		consultar();
		/*
		 * while (rs.next()) {
		 * 
		 * carro.addCarro(new Carro(rs.getString("marca"), rs.getString("modelo"),
		 * rs.getInt("ano"), rs.getString("placa")));
		 * System.out.println("Adicionando carro.."); }
		 * 
		 */

		for (Carro c : carro.getCarros()) {
			System.out.println(c.toString());
		}
	}

}
