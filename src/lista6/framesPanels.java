package lista6;
/*package lista6;

	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import java.awt.BasicStroke;
	import java.awt.Color;
	import java.awt.FontMetrics;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Point;
	import java.awt.RenderingHints;
	import java.awt.Stroke;
	import java.util.ArrayList;
	import java.util.List;
	import javax.swing.JPanel;
	import javax.swing.JButton;
	import java.awt.GridLayout;


public class JanelaPrincipal extends JFrame {

	private JFrame contentPane;
	private GridLayout gridLayout1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 300, 700, 500);
		contentPane = new JFrame("Lista6");
		contentPane.setSize(500,500);
		//setContentPane(contentPane);
		
		gridLayout1 = new GridLayout(3,1);   //2 POR 3; LACUNAS DE 5
		
		JPanel space_button = new JPanel();
		space_button.setBackground(Color.BLACK);
		space_button.setSize(250,250);
		space_button.setBounds(250,250,120,35);
		space_button.setLayout(gridLayout1);
		contentPane.add(space_button);
		
		JButton Caso1 = new JButton("caso 1");
		Caso1.setBounds(250,250,120,35);
		space_button.add(Caso1);
		
	}

}
*/

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