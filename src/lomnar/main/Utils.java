package lomnar.main;

import java.awt.Color;

public class Utils {
	
	private static Color color = Color.BLACK;
	
	public static String encode(Color color) {
		String text = null;
		if (color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 0) {
			text = "&0[x]";
		}
		else if (color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 170) {
			text = "&1[x]";
		}
		else if (color.getRed() == 0 && color.getGreen() == 170 && color.getBlue() == 0) {
			text = "&2[x]";
		}
		else if (color.getRed() == 0 && color.getGreen() == 170 && color.getBlue() == 170) {
			text = "&3[x]";
		}
		else if (color.getRed() == 170 && color.getGreen() == 0 && color.getBlue() == 0) {
			text = "&4[x]";
		}
		else if (color.getRed() == 170 && color.getGreen() == 0 && color.getBlue() == 170) {
			text = "&5[x]";
		}
		else if (color.getRed() == 255 && color.getGreen() == 170 && color.getBlue() == 0) {
			text = "&6[x]";
		}
		else if (color.getRed() == 170 && color.getGreen() == 170 && color.getBlue() == 170) {
			text = "&7[x]";
		}
		else if (color.getRed() == 85 && color.getGreen() == 85 && color.getBlue() == 85) {
			text = "&8[x]";
		}
		else if (color.getRed() == 85 && color.getGreen() == 85 && color.getBlue() == 255) {
			text = "&9[x]";
		}
		else if (color.getRed() == 85 && color.getGreen() == 255 && color.getBlue() == 85) {
			text = "&a[x]";
		}
		else if (color.getRed() == 85 && color.getGreen() == 255 && color.getBlue() == 255) {
			text = "&b[x]";
		}
		else if (color.getRed() == 255 && color.getGreen() == 85 && color.getBlue() == 85) {
			text = "&c[x]";
		}
		else if (color.getRed() == 255 && color.getGreen() == 85 && color.getBlue() == 255) {
			text = "&d[x]";
		}
		else if (color.getRed() == 255 && color.getGreen() == 255 && color.getBlue() == 85) {
			text = "&e[x]";
		}
		else if (color.getRed() == 255 && color.getGreen() == 255 && color.getBlue() == 255) {
			text = "&f[x]";
		}
		else text = "&f[x]";
		return text;
	}
	
	public static Color getColor() {
		return color;
	}

}
