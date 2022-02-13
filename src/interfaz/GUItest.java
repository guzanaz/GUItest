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
import javax.swing.LayoutStyle.ComponentPlacement;
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
		setBounds(100, 100, 866, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		main_bg.setBackground(new Color(255, 255, 255));
		main_bg.setBounds(0, 0, 860, 478);
		contentPane.add(main_bg);
		main_bg.setLayout(null);
		
		JPanel menu_container = new JPanel();
		menu_container.setBounds(0, 0, 224, 478);
		menu_container.setBackground(new Color(51, 51, 51));
		main_bg.add(menu_container);
		
		JLabel logo_virtualio = new JLabel("");
		logo_virtualio.setHorizontalAlignment(SwingConstants.CENTER);
		logo_virtualio.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/86x92.png")));
		
		JPanel Create_btn = new JPanel();
		Create_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Create_btn.setBackground(new Color(0, 255, 127));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Create_btn.setBackground(new Color(211, 211, 211));
			}
		});
		Create_btn.setToolTipText("Create a new virtual machine");
		Create_btn.setMaximumSize(new Dimension(32780, 32767));
		Create_btn.setForeground(Color.DARK_GRAY);
		Create_btn.setFont(new Font("Roboto", Font.BOLD, 12));
		Create_btn.setBackground(new Color(211, 211, 211));
		
		JPanel List_btn = new JPanel();
		List_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				List_btn.setBackground(new Color(0, 255, 127));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				List_btn.setBackground(new Color(211, 211, 211));
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
		List_btn.setToolTipText("List all your virtual machine(s)");
		List_btn.setMaximumSize(new Dimension(32780, 32767));
		List_btn.setForeground(Color.DARK_GRAY);
		List_btn.setFont(new Font("Roboto", Font.BOLD, 12));
		List_btn.setBackground(new Color(211, 211, 211));
		
		JLabel list_icon = new JLabel("");
		list_icon.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/list_alt.png")));
		
		JLabel ListLabel = new JLabel("List all Virtual Machines");
		ListLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ListLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
		GroupLayout gl_List_btn = new GroupLayout(List_btn);
		gl_List_btn.setHorizontalGroup(
			gl_List_btn.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_List_btn.createSequentialGroup()
					.addGap(12)
					.addComponent(list_icon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(ListLabel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		gl_List_btn.setVerticalGroup(
			gl_List_btn.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_List_btn.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_List_btn.createParallelGroup(Alignment.TRAILING)
						.addComponent(ListLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(list_icon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
					.addGap(8))
		);
		List_btn.setLayout(gl_List_btn);
		
		JPanel Update_btn = new JPanel();
		Update_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Update_btn.setBackground(new Color(0, 255, 127));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Update_btn.setBackground(new Color(211, 211, 211));
			}
		});
		Update_btn.setToolTipText("Modify a virtual machine");
		Update_btn.setMaximumSize(new Dimension(32780, 32767));
		Update_btn.setForeground(Color.DARK_GRAY);
		Update_btn.setFont(new Font("Roboto", Font.BOLD, 12));
		Update_btn.setBackground(new Color(211, 211, 211));
		
		JLabel Modify_icon = new JLabel("");
		Modify_icon.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/build_circle.png")));
		
		JLabel Update_label = new JLabel("Modify a Virtual Machines");
		Update_label.setHorizontalAlignment(SwingConstants.LEFT);
		Update_label.setFont(new Font("Roboto", Font.PLAIN, 14));
		GroupLayout gl_Update_btn = new GroupLayout(Update_btn);
		gl_Update_btn.setHorizontalGroup(
			gl_Update_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 184, Short.MAX_VALUE)
				.addGroup(gl_Update_btn.createSequentialGroup()
					.addGap(12)
					.addComponent(Modify_icon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(Update_label, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		gl_Update_btn.setVerticalGroup(
			gl_Update_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 40, Short.MAX_VALUE)
				.addGroup(gl_Update_btn.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_Update_btn.createParallelGroup(Alignment.TRAILING)
						.addComponent(Update_label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(Modify_icon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
					.addGap(8))
		);
		Update_btn.setLayout(gl_Update_btn);
		
		JPanel Delete_btn = new JPanel();
		Delete_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Delete_btn.setBackground(new Color(0, 255, 127));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Delete_btn.setBackground(new Color(211, 211, 211));
			}
		});
		Delete_btn.setToolTipText("Delete a Virtual Machine");
		Delete_btn.setMaximumSize(new Dimension(32780, 32767));
		Delete_btn.setForeground(Color.DARK_GRAY);
		Delete_btn.setFont(new Font("Roboto", Font.BOLD, 12));
		Delete_btn.setBackground(new Color(211, 211, 211));
		
		JLabel Modify_icon_1 = new JLabel("");
		Modify_icon_1.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/delete_outline.png")));
		
		JLabel Update_label_1 = new JLabel("Delete a Virtual Machines");
		Update_label_1.setHorizontalAlignment(SwingConstants.LEFT);
		Update_label_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		GroupLayout gl_Delete_btn = new GroupLayout(Delete_btn);
		gl_Delete_btn.setHorizontalGroup(
			gl_Delete_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 184, Short.MAX_VALUE)
				.addGroup(gl_Delete_btn.createSequentialGroup()
					.addGap(12)
					.addComponent(Modify_icon_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(Update_label_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		gl_Delete_btn.setVerticalGroup(
			gl_Delete_btn.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 40, Short.MAX_VALUE)
				.addGroup(gl_Delete_btn.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_Delete_btn.createParallelGroup(Alignment.TRAILING)
						.addComponent(Update_label_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(Modify_icon_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
					.addGap(8))
		);
		Delete_btn.setLayout(gl_Delete_btn);
		
		JPanel Exit = new JPanel();
		Exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Exit.setBackground(new Color(0, 255, 127));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Exit.setBackground(new Color(211, 211, 211));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		Exit.setToolTipText("Exit and close virtualio");
		Exit.setMaximumSize(new Dimension(32780, 32767));
		Exit.setForeground(Color.DARK_GRAY);
		Exit.setFont(new Font("Roboto", Font.BOLD, 12));
		Exit.setBackground(new Color(211, 211, 211));
		
		JLabel Modify_icon_1_1 = new JLabel("");
		Modify_icon_1_1.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/exit_to_app.png")));
		
		JLabel Update_label_1_1 = new JLabel("Exit Application");
		Update_label_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		Update_label_1_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		GroupLayout gl_Exit = new GroupLayout(Exit);
		gl_Exit.setHorizontalGroup(
			gl_Exit.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 184, Short.MAX_VALUE)
				.addGroup(gl_Exit.createSequentialGroup()
					.addGap(12)
					.addComponent(Modify_icon_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(Update_label_1_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		gl_Exit.setVerticalGroup(
			gl_Exit.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 40, Short.MAX_VALUE)
				.addGroup(gl_Exit.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_Exit.createParallelGroup(Alignment.TRAILING)
						.addComponent(Update_label_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(Modify_icon_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
					.addGap(8))
		);
		Exit.setLayout(gl_Exit);
		//JLabel scaledimage= logo
		
		GroupLayout gl_menu_container = new GroupLayout(menu_container);
		gl_menu_container.setHorizontalGroup(
			gl_menu_container.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_menu_container.createSequentialGroup()
					.addGroup(gl_menu_container.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_menu_container.createSequentialGroup()
							.addContainerGap()
							.addComponent(logo_virtualio, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
						.addGroup(gl_menu_container.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_menu_container.createParallelGroup(Alignment.LEADING)
								.addComponent(List_btn, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addComponent(Create_btn, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addComponent(Update_btn, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addComponent(Delete_btn, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addComponent(Exit, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_menu_container.setVerticalGroup(
			gl_menu_container.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menu_container.createSequentialGroup()
					.addGap(36)
					.addComponent(logo_virtualio)
					.addGap(32)
					.addComponent(Create_btn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(List_btn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Update_btn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Delete_btn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Exit, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		
		JLabel add_icon = new JLabel("");
		add_icon.setIcon(new ImageIcon(GUItest.class.getResource("/com/images/add_box.png")));
		
		JLabel Create_label = new JLabel("New Virtual Machine");
		Create_label.setFont(new Font("Roboto", Font.PLAIN, 14));
		GroupLayout gl_Create_btn = new GroupLayout(Create_btn);
		gl_Create_btn.setHorizontalGroup(
			gl_Create_btn.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Create_btn.createSequentialGroup()
					.addGap(12)
					.addComponent(add_icon, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Create_label)
					.addGap(12))
		);
		gl_Create_btn.setVerticalGroup(
			gl_Create_btn.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_Create_btn.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_Create_btn.createParallelGroup(Alignment.LEADING)
						.addComponent(add_icon)
						.addComponent(Create_label, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
					.addGap(8))
		);
		Create_btn.setLayout(gl_Create_btn);
		menu_container.setLayout(gl_menu_container);
		
		JPanel action_container = new JPanel();
		action_container.setForeground(Color.WHITE);
		action_container.setBounds(223, 56, 631, 108);
		action_container.setBackground(UIManager.getColor("ColorChooser.background"));
		main_bg.add(action_container);
		
		JLabel lblNewLabel_1 = new JLabel("Virtual Machines List");
		action_container.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 14));
		
		JLabel lblNewLabel = new JLabel("Welcome to Virtualio!");
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel.setBounds(236, 28, 240, 16);
		main_bg.add(lblNewLabel);

	}
}
