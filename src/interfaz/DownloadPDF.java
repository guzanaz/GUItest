package interfaz;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DownloadPDF extends JPanel {

	/**
	 * Create the panel.
	 */
	public DownloadPDF() {
		setBorder(null);
		setBounds(230, 0, 1050, 650);
		setLayout(new BorderLayout(0, 0));
		
		JButton btnDownloadPDF = new JButton("Ir a All VMs >>");
		btnDownloadPDF.setFont(new Font("Spartan MB", Font.BOLD, 23));
		add(btnDownloadPDF);
	}

}
