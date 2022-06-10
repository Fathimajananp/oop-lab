/* Using 2D graphics commands in an Applet, construct a house. On mouse click event, change the color of the door from blue to red. */


import java.awt.*;
import java.awt.event.*;

public class house extends Frame
implements MouseListener {

	Color c2 = new Color(0,0,255);   //declaring the colour for the door blue
	public house() {
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
				}
			});
	}

// Draw in different colors.
public void paint(Graphics g) {
	Color c1 = new Color(255, 100, 100);
	
	g.setColor(c1);
	
	// Draw a polygon
	int xpoints[] = {100, 150, 200};
	int ypoints[] = {120, 60, 120};
	int num = 3;

	g.fillPolygon(xpoints, ypoints, num);
	//g.setColor(c1);
	//g.setColor(Color.red);
	//g.fillOval(40, 70, 50, 50);

	g.setColor(Color.cyan);
	g.fillRect(100, 120, 100, 120);

	g.setColor(c2);
	g.fillRect(125, 180, 50, 60);
	
}

public void mouseClicked(MouseEvent me) {
	c2 = new Color(255,0,0);
	repaint();
	}

	public void mouseEntered(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {}
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
	public static void main(String[] args){
	house appwin = new house();

	appwin.setSize(new Dimension(400, 300));
	appwin.setTitle("House");
	appwin.setVisible(true);
	}
}
