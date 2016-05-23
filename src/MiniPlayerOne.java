import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

import util.PlayerUtil;

public class MiniPlayerOne {
	
	JFrame jf = new JFrame();
	public static MyNewDraw ml;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniPlayerOne mpo = new MiniPlayerOne();
		mpo.go();
	}
	
	public void setUpGui(){
		ml = new MyNewDraw();
		jf.setContentPane(ml);
		jf.setBounds(30, 30,300,300);
		jf.setVisible(true);
	}
	public void go(){
		setUpGui();
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.addControllerEventListener(ml, new int[] {127});
			player.open();
			
			Sequence sq = new Sequence(Sequence.PPQ, 4);
			Track t = sq.createTrack();
			
			for (int i =0; i<128 ; i++){
				t.add(PlayerUtil.makeMidi(144, 1, i, 100, i));
				t.add(PlayerUtil.makeMidi(176, 1,127,0, i));
				t.add(PlayerUtil.makeMidi(128, 1, i, 100, i+2));
			}
			
			player.setSequence(sq);
			player.setTempoInBPM(220);
			player.start();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	

	
	
	public class MyNewDraw extends JPanel implements ControllerEventListener {
		
		boolean msg = false;
		
		@Override
		public void controlChange(ShortMessage arg0) {
			// TODO Auto-generated method stub
			msg = true;
			repaint();
		}
		
		public void paintComponent(Graphics g){
			if(msg){
				
				Graphics2D g2d = (Graphics2D) g;
				
				int r = (int) (Math.random()*255);
				int gr = (int) (Math.random()*255);
				int b = (int) (Math.random()*255);
				
				g.setColor(new Color(r, gr, b));
				
				int ht = (int) ((Math.random()*120)+10);
				int width = (int) ((Math.random()*120)+10);
				
				int x = (int) ((Math.random()*40)+10);
				int y = (int) ((Math.random()*40)+10);
				
				g.fillRect(x, y, width, ht);
			}
		}
	}

	
	
}
