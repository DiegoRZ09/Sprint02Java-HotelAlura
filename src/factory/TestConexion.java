package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {
	
	public static void main(String[] args) throws SQLException{
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conexion = connectionFactory.recuperarConexion();
		
		System.out.println("Probando conexión");
		
		conexion.close();
		
		System.out.println("Conexión cerrada");
		
	}
}
