package interfaz;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class AllVMs extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public AllVMs() {		
		setBounds(230, 0, 1050, 708);
		setForeground(Color.WHITE);
		setBorder(null);
		setBackground(UIManager.getColor("Button.select"));
		setLayout(null);

		JLabel AllVMsLabel = new JLabel("All VMs List here!");
		AllVMsLabel.setForeground(UIManager.getColor("Button.highlight"));
		AllVMsLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		AllVMsLabel.setBounds(31, 32, 157, 24);
		add(AllVMsLabel);
		
		

	}
}
