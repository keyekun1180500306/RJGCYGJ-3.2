package MainInterface;

import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JTextField;

import Implementation.TimeRefresh;
import Implementation.TimeTransform;

public class ChooseTime {
	private Thread thread;
	public ChooseTime(JTextField jTextField, String xString,JButton button) throws ParseException {
		if (xString.equals("5����")) {
			this.thread=new Thread(new TimeRefresh(jTextField, new TimeTransform().CreateTime(0, 5, 0),button));
		} else if (xString.equals("10����")) {
			this.thread=new Thread(new TimeRefresh(jTextField, new TimeTransform().CreateTime(0, 10, 0),button));
		} else if (xString.equals("20����")) {
			this.thread=new Thread(new TimeRefresh(jTextField, new TimeTransform().CreateTime(0, 20, 0),button));
		} else if (xString.equals("30����")) {
			this.thread=new Thread(new TimeRefresh(jTextField, new TimeTransform().CreateTime(0, 30, 0),button));
		} else if (xString.equals("40����")) {
			this.thread=new Thread(new TimeRefresh(jTextField, new TimeTransform().CreateTime(0, 40, 0),button));
		} else if (xString.equals("50����")) {
			this.thread=new Thread(new TimeRefresh(jTextField, new TimeTransform().CreateTime(0, 50, 0),button));
		} else if (xString.equals("1Сʱ")) {
			this.thread=new Thread(new TimeRefresh(jTextField, new TimeTransform().CreateTime(1, 0, 0),button));
		} else {
			String string[] = xString.split("\\s");
			int hour = Integer.valueOf(string[0]);
			int minute = Integer.valueOf(string[1]);
			this.thread=new Thread(new TimeRefresh(jTextField, new TimeTransform().CreateTime(hour, minute, 0),button));
		}
		thread.start();
	}
	@SuppressWarnings("deprecation")
	public void endThread() {
		this.thread.stop();
	}
}
