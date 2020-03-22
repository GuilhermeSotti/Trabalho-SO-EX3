package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextPane;

public class CorridaCoelho implements ActionListener {

	private JTextPane coelho1;
	private JTextPane coelho2;
	private JTextPane coelho3;
	private JButton iniciar;
	
	public CorridaCoelho (JTextPane coelho1, 
			JTextPane coelho2, JTextPane coelho3, JButton iniciar) {
		
		this.coelho1 = coelho1;
		this.coelho2 = coelho2;
		this.coelho3 = coelho3;
		this.iniciar = iniciar;
	}
	
	private void corrida() {
		
		Thread t1 = new ThreadController(coelho1, iniciar);
		Thread t2 = new ThreadController(coelho2, iniciar);
		Thread t3 = new ThreadController(coelho3, iniciar);
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		corrida();
	}
}