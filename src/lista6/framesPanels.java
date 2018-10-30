package lista6;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class framesPanels {

	public static void main(String[] args) {
		
		Strassen matriz = new Strassen();
		JFrame janela = new JFrame("");
		
		janela.getContentPane().setLayout(null);
		
		JButton randomize = new JButton("Randomize");
		randomize.setBounds(1600,50, 200, 30);
		janela.add(randomize);
		
		janela.setVisible(true);
		janela.setSize(1900,1000);
		
		matriz.start(janela);
		
		randomize.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				janela.dispose();
				Strassen matriz2 = new Strassen();
				JFrame janela2 = new JFrame("");
				
				janela2.getContentPane().setLayout(null);
				
				janela2.setVisible(true);
				janela2.setSize(1900,1000);
				matriz2.start(janela2);
				janela2.add(randomize);
			}
		});
		
	}

}
