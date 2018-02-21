package time.calculator.app;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.concurrent.TimeUnit;

public class TimeCalculator {

	public static void main(String[] args) {
		
		String input;
		long num;
		input=showInputDialog(null,
				"Enter seconds",
				"Time calculator",
				INFORMATION_MESSAGE);
		
		try {
			num= Long.parseLong(input);
			int days = (int)TimeUnit.SECONDS.toDays(num);
			long hours = TimeUnit.SECONDS.toHours(num) - (TimeUnit.SECONDS.toDays(num) * 24);
			long minutes = TimeUnit.SECONDS.toMinutes(num) - (TimeUnit.SECONDS.toHours(num) * 60);
			long seconds = TimeUnit.SECONDS.toSeconds(num) - (TimeUnit.SECONDS.toMinutes(num) * 60);
			
			String day = String.valueOf(days);
			String hour = String.valueOf(hours);
			String minute = String.valueOf(minutes);
			String second = String.valueOf(seconds);
			
			showMessageDialog(null,
					day + " days " + hour + " hours " + minute + " minutes " + second + " seconds", "Calculation successfull", INFORMATION_MESSAGE
				);
		} catch (Exception e) {
			showMessageDialog(null,
					"Something goes wrong...",
					"Error",
					ERROR_MESSAGE);
		}
	}

}
