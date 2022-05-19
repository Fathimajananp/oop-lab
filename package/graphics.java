/* Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle, Square and Circle. Test the package by finding the area of these figures.*/


import java.util.*;
import Graphics.*;     //importing graphics package

class graphics
{
	public static void main(String args[])
	{
		int a,b,l,h,x,r;
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("1.Rectangle\n2.Triangle\n3.Square\n4.Circle\n5.Exit\n\nEnter your choice :");
			int ch=in.nextInt();
			
			switch(ch){
				case 1 : System.out.println("Enter the length and breadth of a rectangle: ");
						 l=in.nextInt();
						 b=in.nextInt();
						 rectangle obj1=new rectangle();   //creating object for class in package
						 obj1.area(l,b);
					 	 break;
				case 2 : System.out.println("Enter the height and base of a triangle: ");
						 h=in.nextInt();
						 b=in.nextInt();
						 triangle obj2=new triangle();   
						 obj2.area(h,b);
					 	 break;
				case 3 : System.out.println("Enter the side of a square: ");
						 x=in.nextInt();
						 square obj3=new square();   
						 obj3.area(x,1);
					 	 break;
				case 4 : System.out.println("Enter the radius of a circle: ");
						 r=in.nextInt();
						 circle obj4=new circle();   
						 obj4.area(r);
					 	 break;
				case 5 : System.out.println("Exiting...");
						 System.exit(0);
				default :System.out.println("invalid option...");
			}
		}
	}
}




/* OUTPUT

1.Rectangle
2.Triangle
3.Square
4.Circle
5.Exit

Enter your choice :
1
Enter the length and breadth of a rectangle: 
3
4
Area of rectangle : 12
1.Rectangle
2.Triangle
3.Square
4.Circle
5.Exit

Enter your choice :
2
Enter the height and base of a triangle: 
5
6
Area of triangle : 15.0
1.Rectangle
2.Triangle
3.Square
4.Circle
5.Exit

Enter your choice :
3
Enter the side of a square: 
4
Area of square : 16
1.Rectangle
2.Triangle
3.Square
4.Circle
5.Exit

Enter your choice :
4
Enter the radius of a circle: 
5
Area of circle : 78.5
1.Rectangle
2.Triangle
3.Square
4.Circle
5.Exit

Enter your choice :
6
invalid option...
1.Rectangle
2.Triangle
3.Square
4.Circle
5.Exit

Enter your choice :
5
Exiting...

*/
