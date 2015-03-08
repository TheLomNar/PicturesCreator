package lomnar.main;

import lomnar.components.ColorChoser;
import lomnar.components.Frame;
import lomnar.components.Text;

public class PicturesCreator {
	
	public static void main (String args[]) {
		new Runnable() {
			
			@Override
			public void run() {
				new Frame().setVisible(true);
				new ColorChoser();
				new Text();
			}
		}.run();
	}

}
