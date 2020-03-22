package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import control.CorridaCoelho;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton iniciar = new JButton("Iniciar Corrida!!");
		iniciar.setBounds(24, 402, 136, 31);
		contentPane.add(iniciar);
		
		JLabel label = new JLabel("Comece a torcer para o seu sapo favorito!");
		label.setBounds(202, 11, 256, 25);
		contentPane.add(label);
		
		JTextPane coelho1 = new JTextPane();
		coelho1.setText(" (\\_/)\r\n(^_^)\r\n(_____) O");
		coelho1.setBounds(24, 163, 72, 67);
		contentPane.add(coelho1);
		
		JTextPane coelho2 = new JTextPane();
		coelho2.setText(" (\\_/)\r\n(^_^)\r\n(_____) O");
		coelho2.setBounds(24, 241, 72, 67);
		contentPane.add(coelho2);
		
		JTextPane coelho3 = new JTextPane();
		coelho3.setText(" (\\_/)\r\n(^_^)\r\n(_____) O");
		coelho3.setBounds(24, 319, 72, 67);
		contentPane.add(coelho3);
		
		CorridaCoelho corridaCoelho = new CorridaCoelho(coelho1, coelho2, 
				coelho3, iniciar);
		iniciar.addActionListener(corridaCoelho);
	}
}
