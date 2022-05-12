package interfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class CreateVM extends JPanel {

	/**
	 * Create the panel.
	 */
	public CreateVM() {
		setBounds(230, 0, 1050, 708);
		setForeground(Color.WHITE);
		setBorder(null);
		setBackground(new Color(255, 127, 80));
		setLayout(null);
		
		JLabel CreatVMsLabel = new JLabel("Create a VM here!");
		CreatVMsLabel.setForeground(UIManager.getColor("Button.highlight"));
		CreatVMsLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		CreatVMsLabel.setBounds(31, 32, 256, 24);
		add(CreatVMsLabel);
	}

}
