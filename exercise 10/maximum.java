//Program to find maximum of three numbers using AWT.

import java.awt.*;
import java.awt.event.*;

public class maximum extends Frame implements ActionListener {
  Button res;
  String str="";
  TextField n1,n2,n3;

  public maximum() {
    setLayout(new FlowLayout());  // Use a flow layout.
   
    res = new Button("RESULT");  //create button

    // Create controls.
    Label no1 = new Label("Enter the First  Number  : ");
    Label no2 = new Label("Enter the Second Number : ");
    Label no3 = new Label("Enter the Third  Number : ");

    n1 = new TextField(10);
    n2 = new TextField(10);
    n3 = new TextField(10);

    // Add the controls to the frame.
    add(no1);
    add(n1);
    add(no2);
    add(n2);
    add(no3);
    add(n3);

    add(res); //button

    res.addActionListener(this);  //add action listeners for buttons

    addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent we) {
      System.exit(0);
    }
  });
}


  public void actionPerformed(ActionEvent ae) {  // User pressed Enter.
    int a=Integer.parseInt(n1.getText());
    int b=Integer.parseInt(n2.getText());
    int c=Integer.parseInt(n3.getText());

    if(a>b && a>c){
    str=Integer.toString(a);
    }
    if(b>a && b>c){
    str=Integer.toString(b);
    }
    if(c>a && c>b){
    str=Integer.toString(c);
    }

    str="Maximum Number is : "+str;
    repaint();
  }


  public void paint(Graphics g) {
    g.drawString(str,100,200);
    str="";
  }


  public static void main(String[] args) {
    maximum appwin = new maximum();  
    appwin.setSize(new Dimension(320, 250));
    appwin.setTitle("TextFieldDemo");
    appwin.setVisible(true);
  }
}
