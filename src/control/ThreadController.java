package control;

import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class ThreadController extends Thread {

	private JTextPane coelho1;
	private JButton iniciar;
	
	public ThreadController (JTextPane coelho, JButton iniciar) {
		
		this.coelho1 = coelho;
		this.iniciar = iniciar;
	
	}
	
	private void coelho() {
		
		iniciar.setEnabled(false);
		Rectangle posicao;
		posicao = coelho1.getBounds();
		coelho1.setBounds(posicao);
		int i = 0;
		
		while (i != 100) {
			
			i = i + 5;
			posicao.x = posicao.x + 10;
			coelho1.setBounds(posicao);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		iniciar.setEnabled(true);
	
	}
	@Override
	public void run() {
		coelho();
	}
}
