package interfaz;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;

public class AllVMs extends JPanel {

	/**
	 * Create the panel.
	 */
	public AllVMs() {
		setBorder(null);
		setBounds(230, 0, 1050, 650);
		setLayout(new BorderLayout(0, 0));
		
		JButton btnDownloadPDF = new JButton("Ir a Download PDF >>");
		btnDownloadPDF.setFont(new Font("Spartan MB", Font.BOLD, 23));
		add(btnDownloadPDF);
		
		

	}
}
