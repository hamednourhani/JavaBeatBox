import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;

import util.PlayerUtil;

public class MiniPlayerOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			Sequence sq = new Sequence(Sequence.PPQ, 4);
			Track t = sq.createTrack();
			
			for (int i =0; i<128 ; i++){
				t.add(PlayerUtil.makeMidi(144, 1, i, 100, i));
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
	
	
}
