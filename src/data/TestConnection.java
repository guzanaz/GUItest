package data;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

/**
 * parte 2:
 * https://www.youtube.com/watch?v=GPleER-tnAk
 * @author Daniela
 *
 */
public class TestConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion conexion= new Conexion();
		Connection cn=null;
		//
		Statement stm=null;
		
		ResultSet rs=null;

		
		try {
			cn=conexion.conectar();
			stm=cn.createStatement();
			
			//para ejecutar sentencias sql hacemos lo siguiente
			rs=stm.executeQuery("SELECT * FROM virtual_machine");
		
			while(rs.next()){
				String id = rs.getString(1);
				String user_id =rs.getString(2);
				String name = rs.getString(3);
				String os = rs.getString(4);
				String version = rs.getString(5);
				String ram_size = rs.getString(6);
				String disk_capacity = rs.getString(7);
				String description = rs.getString(8);
				Timestamp created_at=rs.getTimestamp(9);
				Timestamp updated_at=rs.getTimestamp(10);
				Boolean power_on=rs.getBoolean(11);
				
				System.out.println(id+" - "+user_id+" - "+name+" - "+os+" - "
				+version+" - "+ram_size+" - "+disk_capacity+" - "+description+" - "+
						created_at+" - "+updated_at+" - "+power_on);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {//cerramos las variables
				if (rs!=null){
					rs.close();
				}
				if (stm!=null){
					stm.close();
				}
				if (cn!=null){
					cn.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
