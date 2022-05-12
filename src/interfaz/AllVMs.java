package interfaz;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.mysql.cj.result.DefaultColumnDefinition;

import data.Conexion;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class AllVMs extends JPanel {
	private JTable table;
	private JTextField txtWriteVmName;
	private JTextField textFieldVMos;
	private JTextField textFieldVMosVersion;
	private JTextField txtWriteAValid;
	private JTextField textField;
	private JTextField txtWriteAShort;

	/**
	 * Create the panel.
	 */
	
	public AllVMs() {
		setBounds(230, 0, 1051, 708);
		setForeground(Color.WHITE);
		setBorder(null);
		setBackground(Color.WHITE);
		setLayout(null);
		
				JLabel AllVMsLabel = new JLabel("Virtualio  |");
				AllVMsLabel.setBounds(20, 25, 77, 24);
				add(AllVMsLabel);
				AllVMsLabel.setForeground(new Color(150, 150, 150));
				AllVMsLabel.setFont(new Font("Spartan MB", Font.PLAIN, 14));
		
		JLabel lblAllVirtualMachines = new JLabel("All Virtual Machines");
		lblAllVirtualMachines.setForeground(new Color(51, 51, 51));
		lblAllVirtualMachines.setFont(new Font("Spartan MB", Font.PLAIN, 14));
		lblAllVirtualMachines.setBounds(102, 25, 173, 24);
		add(lblAllVirtualMachines);
		
		JPanel panelCUD = new JPanel();
		panelCUD.setBounds(0, 65, 1051, 208);
		add(panelCUD);
		panelCUD.setLayout(null);
		
		JSeparator separatorVmName = new JSeparator();
		separatorVmName.setBounds(22, 64, 230, 12);
		
		panelCUD.add(separatorVmName);
		
		JLabel VMName = new JLabel("VM name");
		VMName.setForeground(new Color(90, 90, 90));
		VMName.setFont(new Font("Spartan MB", Font.BOLD, 11));
		VMName.setBounds(23, 21, 173, 24);
		panelCUD.add(VMName);
		
		txtWriteVmName = new JTextField();
		txtWriteVmName.setBorder(null);
		txtWriteVmName.setFont(new Font("Spartan MB", Font.PLAIN, 11));
		txtWriteVmName.setText("Write VM name here");
		txtWriteVmName.setBounds(23, 46, 230, 26);
		txtWriteVmName.setBackground(null);
		txtWriteVmName.setForeground(new Color(95,95,95));
		panelCUD.add(txtWriteVmName);
		txtWriteVmName.setColumns(10);
		
		JSeparator separator_vmos = new JSeparator();
		separator_vmos.setBounds(23, 123, 230, 12);
		panelCUD.add(separator_vmos);
		
		JLabel VMos = new JLabel("VM OS");
		VMos.setForeground(new Color(90, 90, 90));
		VMos.setFont(new Font("Spartan MB", Font.BOLD, 11));
		VMos.setBounds(23, 80, 173, 24);
		panelCUD.add(VMos);
		
		textFieldVMos = new JTextField();
		textFieldVMos.setText("Write VM OS here");
		textFieldVMos.setForeground(new Color(95, 95, 95));
		textFieldVMos.setFont(new Font("Spartan MB", Font.PLAIN, 11));
		textFieldVMos.setColumns(10);
		textFieldVMos.setBorder(null);
		textFieldVMos.setBackground((Color) null);
		textFieldVMos.setBounds(24, 104, 230, 26);
		panelCUD.add(textFieldVMos);
		
		JSeparator separator_vmos_version = new JSeparator();
		separator_vmos_version.setBounds(23, 178, 230, 12);
		panelCUD.add(separator_vmos_version); 
		
		JLabel VMVersion = new JLabel("VM OS version");
		VMVersion.setForeground(new Color(90, 90, 90));
		VMVersion.setFont(new Font("Spartan MB", Font.BOLD, 11));
		VMVersion.setBounds(23, 137, 173, 24);
		panelCUD.add(VMVersion);
		
		textFieldVMosVersion = new JTextField();
		textFieldVMosVersion.setText("Write VM OS version here");
		textFieldVMosVersion.setForeground(new Color(95, 95, 95));
		textFieldVMosVersion.setFont(new Font("Spartan MB", Font.PLAIN, 11));
		textFieldVMosVersion.setColumns(10);
		textFieldVMosVersion.setBorder(null);
		textFieldVMosVersion.setBackground((Color) null);
		textFieldVMosVersion.setBounds(24, 160, 230, 26);
		panelCUD.add(textFieldVMosVersion);
		
		JSeparator separatorDiskSize = new JSeparator();
		separatorDiskSize.setBounds(300, 64, 230, 12);
		panelCUD.add(separatorDiskSize);
		
		
		txtWriteAValid = new JTextField();
		txtWriteAValid.setText("Write a valid of value here (INT type)");
		txtWriteAValid.setForeground(new Color(95, 95, 95));
		txtWriteAValid.setFont(new Font("Spartan MB", Font.PLAIN, 11));
		txtWriteAValid.setColumns(10);
		txtWriteAValid.setBorder(null);
		txtWriteAValid.setBackground((Color) null);
		txtWriteAValid.setBounds(301, 46, 230, 26);
		panelCUD.add(txtWriteAValid);
		
	
		JLabel VMHDD = new JLabel("Disk Size");
		VMHDD.setForeground(new Color(90, 90, 90));
		VMHDD.setFont(new Font("Spartan MB", Font.BOLD, 11));
		VMHDD.setBounds(301, 21, 173, 24);
		panelCUD.add(VMHDD);
		
		JSeparator separatorRamSize_1 = new JSeparator();
		separatorRamSize_1.setBounds(301, 123, 230, 12);
		panelCUD.add(separatorRamSize_1);
		
		textField = new JTextField();
		textField.setText("Write a valid of value here (INT type)");
		textField.setForeground(new Color(95, 95, 95));
		textField.setFont(new Font("Spartan MB", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground((Color) null);
		textField.setBounds(302, 105, 230, 26);
		panelCUD.add(textField);
		
		JLabel VMName_1_1 = new JLabel("RAM Size");
		VMName_1_1.setForeground(new Color(90, 90, 90));
		VMName_1_1.setFont(new Font("Spartan MB", Font.BOLD, 11));
		VMName_1_1.setBounds(302, 80, 173, 24);
		panelCUD.add(VMName_1_1);
		
		JSeparator separatorDescription = new JSeparator();
		separatorDescription.setBounds(301, 180, 230, 12);
		panelCUD.add(separatorDescription);
		
		txtWriteAShort = new JTextField();
		txtWriteAShort.setText("Write a SHORT description");
		txtWriteAShort.setForeground(new Color(95, 95, 95));
		txtWriteAShort.setFont(new Font("Spartan MB", Font.PLAIN, 11));
		txtWriteAShort.setColumns(10);
		txtWriteAShort.setBorder(null);
		txtWriteAShort.setBackground((Color) null);
		txtWriteAShort.setBounds(302, 162, 230, 26);
		panelCUD.add(txtWriteAShort);
		
		JLabel VMName_1_1_1 = new JLabel("Description");
		VMName_1_1_1.setForeground(new Color(90, 90, 90));
		VMName_1_1_1.setFont(new Font("Spartan MB", Font.BOLD, 11));
		VMName_1_1_1.setBounds(302, 137, 173, 24);
		panelCUD.add(VMName_1_1_1);
		
		JPanel panelCreateBTN = new JPanel();
		panelCreateBTN.setBounds(819, 25, 160, 46);
		panelCreateBTN.setBackground(new Color(255, 131, 100));
		
		panelCreateBTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelCreateBTN.setBackground(new Color(255, 85, 51));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panelCreateBTN.setBackground(new Color(255, 131, 100));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		panelCUD.add(panelCreateBTN);
		panelCreateBTN.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add New VM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Spartan MB", Font.BOLD, 13));
		lblNewLabel.setBounds(6, 16, 148, 16);
		panelCreateBTN.add(lblNewLabel);
		
		JPanel panelUpdateBTN = new JPanel();
		panelUpdateBTN.setLayout(null);
		panelUpdateBTN.setBackground(new Color(255, 131, 100));
		panelUpdateBTN.setBounds(819, 87, 160, 46);
		panelUpdateBTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelUpdateBTN.setBackground(new Color(255, 85, 51));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panelUpdateBTN.setBackground(new Color(255, 131, 100));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		panelCUD.add(panelUpdateBTN);
		
		JLabel lblEditVm = new JLabel("Edit VM");
		lblEditVm.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditVm.setForeground(Color.WHITE);
		lblEditVm.setFont(new Font("Spartan MB", Font.BOLD, 13));
		lblEditVm.setBounds(6, 16, 148, 16);
		panelUpdateBTN.add(lblEditVm);
		
		JPanel panelDeleteBTN = new JPanel();
		panelDeleteBTN.setLayout(null);
		panelDeleteBTN.setBackground(new Color(255, 131, 100));
		panelDeleteBTN.setBounds(819, 147, 160, 46);
		
		panelDeleteBTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelDeleteBTN.setBackground(new Color(255, 85, 51));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panelDeleteBTN.setBackground(new Color(255, 131, 100));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		panelCUD.add(panelDeleteBTN);
		
		JLabel lblNewLabel_1 = new JLabel("Delete VM");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Spartan MB", Font.BOLD, 13));
		lblNewLabel_1.setBounds(6, 16, 148, 16);
		panelDeleteBTN.add(lblNewLabel_1);

		JPanel tableContainer = new JPanel();
		tableContainer.setBorder(new EmptyBorder(0, 0, 0, 0));
		tableContainer.setBounds(0, 235, 1051, 600);
		tableContainer.setBackground(new Color(255,255,255));
		add(tableContainer);

		// Nueva conexión
		Conexion con = new Conexion();
		@SuppressWarnings("unused")
		Connection conexion = con.conectar();
		
		// sentencia para listar todas las máquinas
		// para declarar la sentencia sql hacemos lo siguiente
		String sql = "SELECT * FROM virtual_machine";

		Statement stm = null;

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Vm id");
		model.addColumn("User id");
		model.addColumn("Vm Name");
		model.addColumn("OS");
		model.addColumn("Version");
		model.addColumn("Ram Size");
		model.addColumn("Disk Capac.");
		model.addColumn("Description");
		model.addColumn("Created at");
		model.addColumn("Updated at");
		model.addColumn("Power On");
				tableContainer.setLayout(null);
				
				
				JScrollPane scrollPane = new JScrollPane();
				tableContainer.add(scrollPane);
				scrollPane.setBounds(25, 60, 1000, 530);
				scrollPane.setViewportBorder(BorderFactory.createEmptyBorder());
				scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		
				table = new JTable();
				
				
//				@SuppressWarnings("unused") 
//				class AddRowJTable {
//					
//					//Función para añadir objeto
//					public AddRowJTable() {
//						initComponents();
//						model= (DefaultTableModel) table.getModel();
//					}
//					
//
//				}
				
				
				table.setPreferredScrollableViewportSize(new Dimension(0, 0));
				table.setShowVerticalLines(false);
				table.setGridColor(new Color(232, 232, 232));
				table.setBackground(new Color(250,250,250));
				table.setIntercellSpacing(new Dimension(0,0));
				table.setRowMargin(0);
				
				table.setSelectionForeground(new Color(255,131,100));
				table.setSelectionBackground(new Color(51, 51, 51));
				table.setRowHeight(60);
				table.setFont(new Font("Spartan MB", Font.PLAIN, 11));
				table.setBorder(new EmptyBorder(0, 2, 0, 2));
			
				
				 
				//JTable header style
				JTableHeader header = table.getTableHeader();
				
				final DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
			        renderer.setOpaque(true);
			        renderer.setForeground(Color.WHITE);
			        renderer.setBackground(new Color(255, 131, 100));
			        renderer.setPreferredSize(new Dimension(40, 40));
			        renderer.setHorizontalAlignment(JLabel.LEFT);
			        renderer.setBorder(new EmptyBorder(0,20,0,20));
			        renderer.validate();
			        renderer.revalidate();
			        renderer.repaint();
			 
			      //Apply the renderer to all header cells and all data cells:
			        
			       // ((DefaultTableCellRenderer)table.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
			        header.setReorderingAllowed(false);
			        header.setDefaultRenderer(renderer);
			        header.setFont(new Font("Spartan MB", Font.BOLD, 14));
			        header.revalidate();
			        header.repaint();
			   
				
				
				
				
				scrollPane.setViewportView(table);
				

				
				
				
						table.setModel(model);
		
		
		String[] data = new String[11];
		
		try {
			stm = conexion.createStatement();
			ResultSet result = stm.executeQuery(sql);
			
			while(result.next()) {
				data[0]=result.getString(1);
				data[1]=result.getString(2);
				data[2]=result.getString(3);
				data[3]=result.getString(4);
				data[4]=result.getString(5);
				data[5]=result.getString(6);
				data[6]=result.getString(7);
				data[7]=result.getString(8);
				data[8]=result.getString(9);
				data[9]=result.getString(10);
				data[10]=result.getString(11);
				
				//ordenamos que los datos pasen a las rows
				model.addRow(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void initComponents() {
		// TODO Auto-generated method stub
		
	}
}

/**
 * while(rs.next()){ String id = rs.getString(1); String user_id
 * =rs.getString(2); String name = rs.getString(3); String os = rs.getString(4);
 * String version = rs.getString(5); String ram_size = rs.getString(6); String
 * disk_capacity = rs.getString(7); String description = rs.getString(8);
 * Timestamp created_at=rs.getTimestamp(9); Timestamp
 * updated_at=rs.getTimestamp(10); Boolean power_on=rs.getBoolean(11);
 * 
 * System.out.println(id+" - "+user_id+" - "+name+" - "+os+" - " +version+" -
 * "+ram_size+" - "+disk_capacity+" - "+description+" - "+ created_at+" -
 * "+updated_at+" - "+power_on); }
 */
