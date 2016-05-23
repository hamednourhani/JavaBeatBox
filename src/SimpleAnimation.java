import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {

	private int x;
	private int y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleAnimation sp = new SimpleAnimation();
		sp.go();

	}
	
	public void go(){
		JFrame jf = new JFrame();
		x = 10;
		y = 10;
		MyPanel mp = new MyPanel();
		jf.add(mp);
		jf.setSize(300, 300);
		jf.setVisible(true);
		
		for(int i=0;i<130;i++){
			x++;
			y++;
			
			try {
				Thread.sleep(20);
				
				mp.repaint();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			g.setColor(Color.gray);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(Color.orange);
			g.fillOval(x, y, 30, 30);
		}
	}

}
