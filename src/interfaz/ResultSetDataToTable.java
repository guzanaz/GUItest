package interfaz;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.Conexion;
import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class ResultSetDataToTable extends JFrame {
	// TODO Auto-generated method stub
	Conexion conexion = new Conexion();
	Connection cn = null;
	//
	Statement stm = null;

	ResultSet rs = null;
	private JPanel contentPane;
	private JTable table;

	/**
	 * LLENANDO LA TABLA
	 * 
	 */
	public void Table1() {	
		try {
			cn=conexion.conectar();
			stm=cn.createStatement();
					
			//para ejecutar sentencias sql hacemos lo siguiente
			rs=stm.executeQuery("SELECT * FROM virtual_machine");
			
			//LIBRERÍA rs2xml
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
		}catch(SQLException e) {
		e.printStackTrace();
		}finally {
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
		
	public static void main(String[] args) {	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultSetDataToTable frame = new ResultSetDataToTable();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ResultSetDataToTable() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 0, 860, 325);
				contentPane.add(scrollPane);
				
						table = new JTable();
						scrollPane.setViewportView(table);
		Table1();
		
		
	}
}
