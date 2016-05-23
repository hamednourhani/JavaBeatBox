import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMiniMusicApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniMiniMusicApp miniApp = new MiniMiniMusicApp();
		miniApp.play();
		
	}
	
	public void play(){
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			Sequence sq = new Sequence(Sequence.PPQ, 4);
			Track t = sq.createTrack();
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144,1,44,100);
			MidiEvent md1 = new MidiEvent(a, 1);
			t.add(md1);
			
			ShortMessage b = new ShortMessage();
			a.setMessage(128,1,44,100);
			MidiEvent md2 = new MidiEvent(b, 16);
			t.add(md2);
			
			player.setSequence(sq);
			player.start();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
