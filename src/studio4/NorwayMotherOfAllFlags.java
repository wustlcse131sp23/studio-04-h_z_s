package studio4;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		StdDraw.setXscale(0, 21);
		StdDraw.setYscale(0, 16);
		
		StdDraw.clear();
		StdDraw.setPenColor(26, 6, 122);
		StdDraw.filledRectangle(3.5, 8, 3.5, 8);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(10.5, 8, 3.5, 8);
		
		StdDraw.setPenColor(242, 17, 17);
		StdDraw.filledRectangle(17.5, 8, 3.5, 8);
	}

	public static void indonesia() {
		
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(11, 4, 11, 4);
		
		StdDraw.setPenColor(252, 0, 0);
		StdDraw.filledRectangle(11, 12, 11, 4);
	}

	public static void netherlands() {
		StdDraw.setXscale(0, 21);
		StdDraw.setYscale(0, 15);
		
		StdDraw.clear();
		StdDraw.setPenColor(252, 0, 0);
		StdDraw.filledRectangle(11, 12.5, 11, 2.5);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(11, 7.5, 11, 2.5);
		
		StdDraw.setPenColor(26, 6, 122);
		StdDraw.filledRectangle(11, 2.5, 11, 2.5);
		
	}

	public static void poland() {
		
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		

		StdDraw.setPenColor(252, 0, 0);
		StdDraw.filledRectangle(11, 4, 11, 4);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(11, 12, 11, 4);
	}

	public static void thailand() {
		
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 18);
		

		StdDraw.setPenColor(252, 0, 0);
		StdDraw.filledRectangle(11,16.5, 11, 1.5);
		StdDraw.filledRectangle(11, 1.5, 11, 1.5);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(11, 13.5, 11, 1.5);
		StdDraw.filledRectangle(11, 4.5, 11, 1.5);
		
		StdDraw.setPenColor(26, 6, 122);
		StdDraw.filledRectangle(11, 9, 11, 3);
		
		
	}

	public static void finland() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		StdDraw.clear();
		StdDraw.setPenColor(26, 6, 122);
		
		StdDraw.filledRectangle(11, 8, 11, 2);
		StdDraw.filledRectangle(8, 8, 2, 8);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
