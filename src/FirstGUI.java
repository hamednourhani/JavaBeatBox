import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class FirstGUI implements MouseInputListener{

	JFrame jf ;
	JButton jb ;
	
	public static void main(String[] args) {
		FirstGUI fg = new FirstGUI();
		fg.go();
		

	}
	
		
	public void go(){
		// TODO Auto-generated method stub
		
				 jf = new JFrame();
				 jb = new JButton("Click Me");
				 MyDrawPanel mp = new MyDrawPanel();
				 
				 jf.getContentPane().add(BorderLayout.CENTER ,mp);
				
				jb.addMouseListener(this);
				
				jb.setText("Double click!!");
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.getContentPane().add(BorderLayout.PAGE_END,jb);
				jf.setSize(300, 300);
				jf.setVisible(true);
	}

	


	@Override
	public void mouseClicked(MouseEvent ev) {
		jb.setText("i am clicked!");
		jf.repaint();
		if(ev.getSource() == jb){
			
			System.out.println(ev);
		}
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
