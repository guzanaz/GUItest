package interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;


@SuppressWarnings("serial")
public class VirtualioGUI extends JFrame {

	public JPanel contentPane;
	public final JPanel main_bg = new JPanel();
	public final JLabel Logo = new JLabel("");
	public final JPanel menu_container = new JPanel();
	
	
	

	// contenedor cardlayout
	public final JPanel JPanel = new JPanel();

	// contenedor acción por dafault
	public final JPanel containers_container = new JPanel();
	
	AllVMs allvms = new AllVMs();

	CardLayout cl;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VirtualioGUI frame = new VirtualioGUI();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VirtualioGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		main_bg.setBackground(new Color(255, 255, 255));
		main_bg.setBounds(0, 0, 1280, 708);
		contentPane.add(main_bg);
		main_bg.setLayout(null);

		// ventana por defecto
		JPanel.setLayout(null);
		JPanel.setBackground(null);
		JPanel.setBounds(0, 0, 1280, 708);
		main_bg.add(JPanel);
		containers_container.setForeground(Color.DARK_GRAY);
		containers_container.setBorder(null);
		containers_container.setBackground(Color.WHITE);
		containers_container.setBounds(230, 0, 1050, 708);
		JPanel.add(containers_container);
		containers_container.setLayout(new CardLayout(0, 0));

		cl =(CardLayout) (containers_container.getLayout());


		

		menu_container.setBounds(0, 0, 230, 708);
		JPanel.add(menu_container);
		menu_container.setBackground(new Color(51, 51, 51));
		menu_container.setLayout(null);
		Logo.setBounds(0, 0, 230, 205);
		menu_container.add(Logo);
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Logo.setIcon(new ImageIcon(VirtualioGUI.class.getResource("/com/images/logomenu_150x170px.png")));

		JPanel Create_btn = new JPanel();
		Create_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Create_btn.setBackground(new Color(255, 131, 100));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				Create_btn.setBackground(new Color(51, 51, 51));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		Create_btn.setToolTipText("Create a new Virtual Machine");
		Create_btn.setMaximumSize(new Dimension(32780, 32767));
		Create_btn.setForeground(Color.DARK_GRAY);
		Create_btn.setFont(new Font("Roboto", Font.BOLD, 20));
		Create_btn.setBackground(new Color(51, 51, 51));
		Create_btn.setBounds(0, 305, 230, 101);
		menu_container.add(Create_btn);

		JLabel Create_icon_1 = new JLabel("");
		Create_icon_1.setIcon(new ImageIcon(VirtualioGUI.class.getResource("/com/images/add_circle_outline.png")));
		Create_icon_1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel list_label_1_1 = new JLabel("<html><body>New Virtual<br>Machine</body></html>");
		list_label_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		list_label_1_1.setForeground(Color.WHITE);
		list_label_1_1.setFont(new Font("Roboto", Font.BOLD, 20));
		GroupLayout gl_Create_btn = new GroupLayout(Create_btn);
		gl_Create_btn.setHorizontalGroup(gl_Create_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 230, Short.MAX_VALUE)
				.addGroup(gl_Create_btn.createSequentialGroup().addGap(12)
						.addComponent(Create_icon_1, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE).addGap(7)
						.addComponent(list_label_1_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addGap(15)));
		gl_Create_btn
				.setVerticalGroup(gl_Create_btn.createParallelGroup(Alignment.TRAILING).addGap(0, 101, Short.MAX_VALUE)
						.addGroup(gl_Create_btn.createSequentialGroup().addGap(8)
								.addGroup(gl_Create_btn.createParallelGroup(Alignment.TRAILING)
										.addComponent(list_label_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 85,
												Short.MAX_VALUE)
										.addComponent(Create_icon_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 85,
												Short.MAX_VALUE))
								.addGap(8)));
		Create_btn.setLayout(gl_Create_btn);

		JPanel ExportPdf_btn = new JPanel();
		ExportPdf_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ExportPdf_btn.setBackground(new Color(255, 131, 100));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ExportPdf_btn.setBackground(new Color(51, 51, 51));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});

		JPanel List_btn = new JPanel();
		List_btn.setBounds(0, 406, 230, 101);
		menu_container.add(List_btn);
		List_btn.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseEntered(MouseEvent e) {
				List_btn.setBackground(new Color(255, 131, 100));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				List_btn.setBackground(new Color(51, 51, 51));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				containers_container.add(allvms,"listVMs");
				cl.show(containers_container, "listVMs");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// change the jlabel background color
				List_btn.setBackground(Color.blue);

				
			}
		});
		List_btn.setToolTipText("List all your Virtual Machine(s)");
		List_btn.setMaximumSize(new Dimension(32780, 32767));
		List_btn.setForeground(Color.DARK_GRAY);
		List_btn.setFont(new Font("Roboto", Font.BOLD, 20));
		List_btn.setBackground(new Color(51, 51, 51));

		JLabel List_icon = new JLabel("");
		List_icon.setIcon(new ImageIcon(VirtualioGUI.class.getResource("/com/images/WhiteList.png")));
		List_icon.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel list_label = new JLabel("<html><body>All Virtual<br>Machines</body></html>");
		list_label.setHorizontalAlignment(SwingConstants.LEFT);
		list_label.setForeground(Color.WHITE);
		list_label.setFont(new Font("Roboto", Font.BOLD, 20));
		GroupLayout gl_List_btn = new GroupLayout(List_btn);
		gl_List_btn
				.setHorizontalGroup(gl_List_btn.createParallelGroup(Alignment.TRAILING).addGap(0, 230, Short.MAX_VALUE)
						.addGroup(gl_List_btn.createSequentialGroup().addGap(12)
								.addComponent(List_icon, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE).addGap(7)
								.addComponent(list_label, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addGap(15)));
		gl_List_btn.setVerticalGroup(gl_List_btn.createParallelGroup(Alignment.TRAILING).addGap(0, 101, Short.MAX_VALUE)
				.addGroup(gl_List_btn.createSequentialGroup().addGap(8)
						.addGroup(gl_List_btn.createParallelGroup(Alignment.TRAILING)
								.addComponent(list_label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 85,
										Short.MAX_VALUE)
								.addComponent(List_icon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 85,
										Short.MAX_VALUE))
						.addGap(8)));
		List_btn.setLayout(gl_List_btn);
		ExportPdf_btn.setToolTipText("Download a list with the state of all your virtual machines");
		ExportPdf_btn.setMaximumSize(new Dimension(32780, 32767));
		ExportPdf_btn.setForeground(Color.DARK_GRAY);
		ExportPdf_btn.setFont(new Font("Roboto", Font.BOLD, 20));
		ExportPdf_btn.setBackground(new Color(51, 51, 51));
		ExportPdf_btn.setBounds(0, 507, 230, 101);
		menu_container.add(ExportPdf_btn);

		JLabel exportPDF_icon = new JLabel("");
		exportPDF_icon.setIcon(new ImageIcon(VirtualioGUI.class.getResource("/com/images/downloading.png")));
		exportPDF_icon.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel exportPDF_label = new JLabel("<html><body>Download<br>PDF data</body></html>");
		exportPDF_label.setHorizontalAlignment(SwingConstants.LEFT);
		exportPDF_label.setForeground(Color.WHITE);
		exportPDF_label.setFont(new Font("Roboto", Font.BOLD, 20));
		GroupLayout gl_ExportPdf_btn = new GroupLayout(ExportPdf_btn);
		gl_ExportPdf_btn.setHorizontalGroup(gl_ExportPdf_btn.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ExportPdf_btn.createSequentialGroup().addGap(23)
						.addComponent(exportPDF_icon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGap(18)
						.addComponent(exportPDF_label, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addGap(14)));
		gl_ExportPdf_btn
				.setVerticalGroup(gl_ExportPdf_btn.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
						gl_ExportPdf_btn.createSequentialGroup().addGap(8)
								.addGroup(gl_ExportPdf_btn.createParallelGroup(Alignment.LEADING)
										.addComponent(exportPDF_icon, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
										.addComponent(exportPDF_label, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
								.addContainerGap()));
		ExportPdf_btn.setLayout(gl_ExportPdf_btn);

		JPanel Exit_btn = new JPanel();
		Exit_btn.setBounds(0, 608, 230, 101);
		Exit_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Exit_btn.setBackground(new Color(255, 131, 100));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				Exit_btn.setBackground(new Color(51, 51, 51));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		Exit_btn.setToolTipText("Exit and close virtualio");
		Exit_btn.setMaximumSize(new Dimension(32780, 32767));
		Exit_btn.setForeground(Color.DARK_GRAY);
		Exit_btn.setFont(new Font("Roboto", Font.BOLD, 20));
		Exit_btn.setBackground(new Color(51, 51, 51));

		JLabel exit_icon = new JLabel("");
		exit_icon.setHorizontalAlignment(SwingConstants.CENTER);
		exit_icon.setIcon(new ImageIcon(VirtualioGUI.class.getResource("/com/images/WhiteExit_to_app.png")));

		JLabel exit_label = new JLabel("Exit App");
		exit_label.setForeground(Color.WHITE);
		exit_label.setHorizontalAlignment(SwingConstants.LEFT);
		exit_label.setFont(new Font("Roboto", Font.BOLD, 20));
		GroupLayout gl_Exit_btn = new GroupLayout(Exit_btn);
		gl_Exit_btn.setHorizontalGroup(gl_Exit_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 184, Short.MAX_VALUE)
				.addGroup(gl_Exit_btn.createSequentialGroup().addGap(12)
						.addComponent(exit_icon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(7).addComponent(exit_label, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addGap(15)));
		gl_Exit_btn.setVerticalGroup(gl_Exit_btn.createParallelGroup(Alignment.TRAILING).addGap(0, 40, Short.MAX_VALUE)
				.addGroup(gl_Exit_btn.createSequentialGroup().addGap(8)
						.addGroup(gl_Exit_btn.createParallelGroup(Alignment.TRAILING)
								.addComponent(exit_label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24,
										Short.MAX_VALUE)
								.addComponent(exit_icon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24,
										Short.MAX_VALUE))
						.addGap(8)));
		Exit_btn.setLayout(gl_Exit_btn);
		menu_container.add(Exit_btn);

	}
}
