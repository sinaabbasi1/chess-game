import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class GUITimer {

	private static int cnt;

	public static void main(String args[]) {

		new JFrame().setVisible(true);
		ActionListener actListner = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				cnt += 1;
				System.out.println("Counter = " + cnt);
			}
		};
		Timer timer = new Timer(1000, actListner);
		timer.start();
	}
}