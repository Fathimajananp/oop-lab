/* Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu driven program to find area and perimeter of objects. */


import java.util.*;

interface ap{
	void input();
	void area();
	void perimeter();
}

class circle implements ap{
	int r=0;
	double pi=3.14;
	double area=0;
	double perimeter=0;

	public void input(){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the radius :");
		r=in.nextInt();
	}

	public void area(){
		area=pi*r*r;
		System.out.println("Area of the circle " +area);
	}

	public void perimeter(){
		perimeter=2*pi*r;
		System.out.println("perimeter of the circle " +perimeter);	
	}
}

class rectangle implements ap{
	int l=0;
	int b=0;
	double area=0;
	double perimeter=0;

	public void input(){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the length and breadth:");
		
		l=in.nextInt();
		b=in.nextInt();
	}

	public void area(){
		area=l*b;
		System.out.println("Area of the rectangle " +area);
	}

	public void perimeter(){
		perimeter=2*l*b;
		System.out.println("perimeter of the rectangle " +perimeter);	
	}
}


public class ifacedemo{
	
	public static void main(String args[]){
			int ch;
			Scanner in = new Scanner(System.in);
			circle obj1 = new circle();
			rectangle obj2= new rectangle();
			while(true){
				System.out.println("1.Circle\n2.Rectangle\n3.Exit\nEnter your choice: ");
				ch=in.nextInt();
				switch(ch){
					case 1 : obj1.input();
							 obj1.area();
							 obj1.perimeter();
							 break;

					case 2 : obj2.input();
							 obj2.area();
							 obj2.perimeter();
							 break;

					case 3 : System.out.println("Exiting...");
							 System.exit(0);

					default : System.out.println("Enter a valid option...");

				}
			}
	}
}
	

/*  OUTPUT

1.Circle
2.Rectangle
3.Exit
Enter your choice: 
1
Enter the radius :
3
Area of the circle 28.259999999999998
perimeter of the circle 18.84
1.Circle
2.Rectangle
3.Exit
Enter your choice: 
2
Enter the length and breadth:
3
4
Area of the rectangle 12.0
perimeter of the rectangle 24.0
1.Circle
2.Rectangle
3.Exit
Enter your choice: 
4
Enter a valid option...
1.Circle
2.Rectangle
3.Exit
Enter your choice: 
3
Exiting...

*/	
