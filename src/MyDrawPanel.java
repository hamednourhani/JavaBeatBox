import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class MyDrawPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
		
		g.setColor(Color.CYAN);
		g.fillRect(20, 50, 100, 100);
	}
}
