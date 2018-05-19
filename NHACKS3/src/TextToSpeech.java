import java.util.Arrays;
import java.util.Locale;

import javax.sound.midi.Synthesizer;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech implements Runnable {
	private String text;
	public TextToSpeech(String str) {
		text = str;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		VoiceManager vm = VoiceManager.getInstance();
		Voice voice = vm.getVoice("kevin16");
		
		System.out.println(Arrays.asList(vm.getVoices()));
		
		voice.allocate();
		
		voice.speak(text);
	}
	
	public static void main(String[] args){
		new TextToSpeech("I like you ankith").run();
	}
}