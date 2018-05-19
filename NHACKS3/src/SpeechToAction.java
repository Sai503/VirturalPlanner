import java.awt.TrayIcon.MessageType;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SpeechToAction implements Runnable {
	String typeOfEvent, eventName, eventDate, eventTime;
	String[] x;

	public SpeechToAction(String[] x) {
		typeOfEvent = x[0];
		eventName = x[1];
		eventDate = x[2];
		eventTime = x[3];
	}

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			   LocalDateTime now = LocalDateTime.now();  
			   System.out.println(dtf.format(now));  
			if (typeOfEvent == "Homework") {
				new TrayPopup("", "", MessageType.INFO);
			} else if (typeOfEvent == "Test") {

			} else if (typeOfEvent == "Commitment") {

			}
		} catch (Exception e) {

		}
	}
}
