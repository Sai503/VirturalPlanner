import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

public class TrayPopup {
	public TrayPopup (String firstLine, String secondLine, MessageType type) throws Exception {
		SystemTray tray = SystemTray.getSystemTray();
		
		Image image = Toolkit.getDefaultToolkit().createImage(".png");
		
		TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
		
		trayIcon.setImageAutoSize(true);
		trayIcon.setToolTip(firstLine);
		tray.add(trayIcon);
		
		trayIcon.displayMessage(firstLine, secondLine, type);
	}
	
}
