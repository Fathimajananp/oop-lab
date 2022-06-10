/*Find the percentage of marks obtained by a student in 5 subjects.Display a happy face if he secures above 50% or a sad face if otherwise.*/

import java.awt.*;
import java.awt.event.*;

public class percentage extends Frame implements ActionListener {
	Button sub;
	int f=0,sum,k=0;
	String str="";
	float per;
	TextField s1,s2,s3,s4,s5;

	public percentage() {
		// Use a flow layout.
		setLayout(new FlowLayout());

		//create button
		sub = new Button("SUBMIT");

		// Create controls.
		Label sub1 = new Label("Enter the mark for English: ");
		Label sub2 = new Label("Enter the mark for Mathematics : ");
		Label sub3 = new Label("Enter the mark for Science : ");
		Label sub4 = new Label("Enter the mark for Malayalam : ");
		Label sub5 = new Label("Enter the mark for Computer : ");

		s1 = new TextField(5);
		s2 = new TextField(5);
		s3 = new TextField(5);
		s4 = new TextField(5);
		s5 = new TextField(5);


		// Add the controls to the frame.
		add(sub1);
		add(s1);
		add(sub2);
		add(s2);
		add(sub3);
		add(s3);
		add(sub4);
		add(s4);
		add(sub5);
		add(s5);
		add(sub);

		//add action listeners for buttons
		sub.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	// User pressed Enter.
	public void actionPerformed(ActionEvent ae) {
		k=1;
		int a=Integer.parseInt(s1.getText());
		int b=Integer.parseInt(s2.getText());
		int c=Integer.parseInt(s3.getText());
		int d=Integer.parseInt(s4.getText());
		int e=Integer.parseInt(s5.getText());
		 
		sum=(a+b+c+d+e);
		per=(float)(sum*0.2);
		if (sum<250){
			f=1;
			str="Better Luck Next Time";
			repaint();
		}
		else if(sum>=250){
			str="Eligible For Higher Studies";
			f=2;
			repaint();
		}
		else{}
	}




	public void paint(Graphics g) {
		if(k==1){
			g.setColor(Color.yellow);
			g.fillOval(200, 80, 90, 90);

			g.setColor(Color.black);
			g.fillOval(220, 110, 10, 10);

			g.setColor(Color.black);
			g.fillOval(260, 110, 10, 10);

			if(f==1){
				g.drawArc(230, 140, 30, 30, 0, 180);
				g.setColor(Color.blue);
				g.drawString(str,200,200);
			}

			else if(f==2)
			{
				g.drawArc(230, 120, 30, 30, 180, 180);
				g.setColor(Color.blue);
				g.drawString(str,200,200);
			}
			else{}
			g.drawString("you got "+Float.toString(per)+"%",220,220);
		}
	}

	public static void main(String[] args) {
		percentage appwin = new percentage();

		appwin.setSize(new Dimension(1000, 500));
		appwin.setTitle("TextFieldDemo");
		appwin.setVisible(true);
	}
}
