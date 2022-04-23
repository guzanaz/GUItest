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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class GUItest extends JFrame {

	private JPanel contentPane;
	private final JPanel main_bg = new JPanel();
	
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUItest frame = new GUItest();
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
	public GUItest() {
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
		
		JPanel menu_container = new JPanel();
		menu_container.setBounds(0, 0, 230, 800);
		menu_container.setBackground(new Color(51, 51, 51));
		main_bg.add(menu_container);
		
		JLabel logo_virtualio = new JLabel("");
		logo_virtualio.setBounds(6, 36, 230, 98);
		logo_virtualio.setHorizontalAlignment(SwingConstants.CENTER);
		logo_virtualio.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/Logo86x92.png")));
		
		JPanel List_btn_borrarluego = new JPanel();
		List_btn_borrarluego.setBounds(22, 224, 185, 40);
		List_btn_borrarluego.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				List_btn_borrarluego.setBackground(new Color(0, 255, 127));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				List_btn_borrarluego.setBackground(new Color(211, 211, 211));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {												
						try {
							ResultSetDataToTable frame = new ResultSetDataToTable();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		List_btn_borrarluego.setToolTipText("List all your virtual machine(s)");
		List_btn_borrarluego.setMaximumSize(new Dimension(32780, 32767));
		List_btn_borrarluego.setForeground(Color.DARK_GRAY);
		List_btn_borrarluego.setFont(new Font("Roboto", Font.BOLD, 12));
		List_btn_borrarluego.setBackground(new Color(211, 211, 211));
		
		JLabel list_icon = new JLabel("");
		list_icon.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/list_alt.png")));
		
		JLabel ListLabel = new JLabel("List all Virtual Machines");
		ListLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ListLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
		GroupLayout gl_List_btn_borrarluego = new GroupLayout(List_btn_borrarluego);
		gl_List_btn_borrarluego.setHorizontalGroup(
			gl_List_btn_borrarluego.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_List_btn_borrarluego.createSequentialGroup()
					.addGap(12)
					.addComponent(list_icon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(ListLabel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		gl_List_btn_borrarluego.setVerticalGroup(
			gl_List_btn_borrarluego.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_List_btn_borrarluego.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_List_btn_borrarluego.createParallelGroup(Alignment.TRAILING)
						.addComponent(ListLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(list_icon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
					.addGap(8))
		);
		List_btn_borrarluego.setLayout(gl_List_btn_borrarluego);
		
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
		exit_icon.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/WhiteExit_to_app.png")));
		
		JLabel exit_label = new JLabel("Exit App");
		exit_label.setForeground(Color.WHITE);
		exit_label.setHorizontalAlignment(SwingConstants.LEFT);
		exit_label.setFont(new Font("Roboto", Font.BOLD, 20));
		GroupLayout gl_Exit_btn = new GroupLayout(Exit_btn);
		gl_Exit_btn.setHorizontalGroup(
			gl_Exit_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 184, Short.MAX_VALUE)
				.addGroup(gl_Exit_btn.createSequentialGroup()
					.addGap(12)
					.addComponent(exit_icon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(exit_label, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		gl_Exit_btn.setVerticalGroup(
			gl_Exit_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 40, Short.MAX_VALUE)
				.addGroup(gl_Exit_btn.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_Exit_btn.createParallelGroup(Alignment.TRAILING)
						.addComponent(exit_label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(exit_icon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
					.addGap(8))
		);
		Exit_btn.setLayout(gl_Exit_btn);
		
		JPanel List_btn = new JPanel();
		List_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				List_btn.setBackground(new Color(255, 131, 100));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				List_btn.setBackground(new Color(51, 51, 51));
			}
		});
		List_btn.setBounds(0, 507, 230, 101);
		List_btn.setToolTipText("List all your Virtual Machine(s)");
		List_btn.setMaximumSize(new Dimension(32780, 32767));
		List_btn.setForeground(Color.DARK_GRAY);
		List_btn.setFont(new Font("Roboto", Font.BOLD, 20));
		List_btn.setBackground(new Color(51, 51, 51));
		
		JLabel List_icon = new JLabel("");
		List_icon.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/WhiteList.png")));
		List_icon.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel list_label = new JLabel("List all VMs");
		list_label.setHorizontalAlignment(SwingConstants.LEFT);
		list_label.setForeground(Color.WHITE);
		list_label.setFont(new Font("Roboto", Font.BOLD, 20));
		GroupLayout gl_List_btn = new GroupLayout(List_btn);
		gl_List_btn.setHorizontalGroup(
			gl_List_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 230, Short.MAX_VALUE)
				.addGroup(gl_List_btn.createSequentialGroup()
					.addGap(12)
					.addComponent(List_icon, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(list_label, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		gl_List_btn.setVerticalGroup(
			gl_List_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 101, Short.MAX_VALUE)
				.addGroup(gl_List_btn.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_List_btn.createParallelGroup(Alignment.TRAILING)
						.addComponent(list_label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
						.addComponent(List_icon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
					.addGap(8))
		);
		List_btn.setLayout(gl_List_btn);
		menu_container.setLayout(null);
		menu_container.add(logo_virtualio);
		menu_container.add(List_btn_borrarluego);
		menu_container.add(Exit_btn);
		menu_container.add(List_btn);
		
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
		});
		Create_btn.setToolTipText("Create a new Virtual Machine");
		Create_btn.setMaximumSize(new Dimension(32780, 32767));
		Create_btn.setForeground(Color.DARK_GRAY);
		Create_btn.setFont(new Font("Roboto", Font.BOLD, 20));
		Create_btn.setBackground(new Color(51, 51, 51));
		Create_btn.setBounds(0, 406, 230, 101);
		menu_container.add(Create_btn);
		
		JLabel Create_icon = new JLabel("");
		Create_icon.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/add_circle_outline.png")));
		Create_icon.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel list_label_1 = new JLabel("New VM");
		list_label_1.setHorizontalAlignment(SwingConstants.LEFT);
		list_label_1.setForeground(Color.WHITE);
		list_label_1.setFont(new Font("Roboto", Font.BOLD, 20));
		GroupLayout gl_Create_btn = new GroupLayout(Create_btn);
		gl_Create_btn.setHorizontalGroup(
			gl_Create_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 230, Short.MAX_VALUE)
				.addGroup(gl_Create_btn.createSequentialGroup()
					.addGap(12)
					.addComponent(Create_icon, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(list_label_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		gl_Create_btn.setVerticalGroup(
			gl_Create_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 101, Short.MAX_VALUE)
				.addGroup(gl_Create_btn.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_Create_btn.createParallelGroup(Alignment.TRAILING)
						.addComponent(list_label_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
						.addComponent(Create_icon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
					.addGap(8))
		);
		Create_btn.setLayout(gl_Create_btn);
		
		JPanel action_container = new JPanel();
		action_container.setForeground(Color.WHITE);
		action_container.setBounds(230, 70, 1050, 100);
		action_container.setBackground(UIManager.getColor("ColorChooser.background"));
		main_bg.add(action_container);
		
		JLabel lblNewLabel_1 = new JLabel("Virtual Machines List");
		action_container.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 14));
		
		JLabel lblNewLabel = new JLabel("Welcome to Virtualio!");
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel.setBounds(265, 28, 240, 16);
		main_bg.add(lblNewLabel);

	}
}
