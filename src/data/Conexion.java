package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que conecta la app con la bbdd mysql siguiendo tutorial parte 1:
 * https://www.youtube.com/watch?v=UXPrmfNYJHM 
 * 
 * @author Daniela
 *
 */
public class Conexion {
	
	private static final String CONTROLLER="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/Virtualio_students";
	private static final String USER="admin";
	private static final String PASSWORD="admin";
	
	/**
	 * Function connect()
	 * it connects the main program to Virtualio DDBB
	 * @return connection
	 */
	public Connection conectar(){
		Connection conexion=null;
		try {
			Class.forName(CONTROLLER);
			conexion=DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexión Ok");

		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		return conexion;
	}
	


}
