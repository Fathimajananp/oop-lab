/* Develop a program that has a Choice component which contains the names of shapes such as rectangle, triangle, square and circle. Draw the corresponding shapes for given parameters as per user’s choice.*/

import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame
implements ItemListener {
	Choice ch;
	String str = "";

	public ChoiceDemo() {

		// Use a flow layout.
		setLayout(new FlowLayout());
		// Create choice lists.
		ch = new Choice();


		// Add items to os list.
		ch.add("Triangle");
		ch.add("Rectangle");
		ch.add("Square");
		ch.add("Circle");


		// Add choice lists to window.
		add(ch);


		// Add item listeners.
		ch.addItemListener(this);


		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public void itemStateChanged(ItemEvent ie) {
		str=ch.getSelectedItem();		
		repaint();
	}

	// Display current selections.
	public void paint(Graphics g) {
	
		if(str.equals("Triangle")){
			int xpoints[] = {100, 150, 200};
			int ypoints[] = {120, 60, 120};
			int num = 3;
			g.setColor(Color.blue);
			g.fillPolygon(xpoints, ypoints, num);
		}
		else if(str.equals("Rectangle")){
			g.setColor(Color.pink);
			g.fillRect(145, 120, 50, 80);
		}

		else if(str.equals("Square")){
			g.setColor(Color.red);
			g.fillRect(50, 50, 50, 50);
		}

		else if(str.equals("Circle")){
			g.setColor(Color.yellow);
			g.fillOval(40, 70, 50, 50);
		}
		else{}
	}

	public static void main(String[] args) {
		ChoiceDemo appwin = new ChoiceDemo();

		appwin.setSize(new Dimension(240, 180));
		appwin.setTitle("ChoiceDemo");
		appwin.setVisible(true);
	}
}
