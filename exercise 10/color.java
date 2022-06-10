// Program to draw Circle, Rectangle, Line


import java.awt.*;
import java.awt.event.*;

public class color extends Frame {

	public color() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
				}
			});
	}

// Draw in different colors.
public void paint(Graphics g) {
	
	g.setColor(Color.pink);
	g.drawLine(40, 50, 80, 50);
	
	g.setColor(Color.red);
	g.fillOval(40, 70, 50, 50);

	g.setColor(Color.cyan);
	g.fillRect(40, 150, 60, 70);
	
}

public static void main(String[] args) {
	color appwin = new color();

	appwin.setSize(new Dimension(250, 250));
	appwin.setTitle("ColorDemo");
	appwin.setVisible(true);
	}
}
