import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {

	private static MusicTest1 test1;
	private Sequencer sequencer;

	public static void main(String[] args) {
		
		setTest1(new MusicTest1());
		
			getTest1().play();
		
	}
	
	public void play() {
		
		try {
			setSequencer(MidiSystem.getSequencer());
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("we got a sequencer");
	}

	public static MusicTest1 getTest1() {
		return test1;
	}

	public static void setTest1(MusicTest1 test1) {
		MusicTest1.test1 = test1;
	}

	public Sequencer getSequencer() {
		return sequencer;
	}

	public void setSequencer(Sequencer sequencer) {
		this.sequencer = sequencer;
	}

}
