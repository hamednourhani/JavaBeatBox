package util;


import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class PlayerUtil {
	
	private PlayerUtil(){
		System.out.println("I instanciated"+ this.getClass());
	}
	
	public static MidiEvent makeMidi(int comd,int chan,int one, int two,int tick){
		MidiEvent event = null;
		
		ShortMessage sm = new ShortMessage();
		try {
			sm.setMessage(comd,chan,one,two);
			event = new MidiEvent(sm, tick);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return event;
	}

}
