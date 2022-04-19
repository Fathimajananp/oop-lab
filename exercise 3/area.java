//Find the area of different shapes using overloaded functions

import java.util.*;
class area
{
    void area(int a,int b)
    {
    System.out.print("AREA OF RECTANGLE: "+(a*b));
    }

    void area(int x)
    {
    System.out.print("AREA OF SQUARE: "+(x*x));
    }

    double area(double r)
    {
    System.out.print("AREA OF CIRCLE: ");
    return 3.14*r*r;
    }

    public static void main(String args[])
    {
	int a,b,s;
        double r,result;
	Scanner in=new Scanner(System.in);
        area obj=new area();

	do
	{
        System.out.print("\n\n1.RECTANGLE\n2.SQUARE\n3.CIRCLE\n4.EXIT\nEnter your Choice:  ");
        int ch=in.nextInt();
        
	switch(ch)
        {
        case 1:System.out.print("Enter length and breadth: ");
               a=in.nextInt();
               b=in.nextInt();
               obj.area(a,b);
               break;

        case 2:System.out.print("Enter side : ");
               s=in.nextInt();
               obj.area(s);
               break;

        case 3:System.out.print("Enter Radius : ");
               r=in.nextDouble();
               result=obj.area(r);
	       System.out.print(result);
               break;

        case 4:System.out.println("Exiting.....");
               System.exit(0);
        }
	}
	while(true);
    }
}




/*OUTPUT

1.RECTANGLE
2.SQUARE
3.CIRCLE
4.EXIT
Enter your Choice:  1
Enter length and breadth: 3 4
AREA OF RECTANGLE: 12

1.RECTANGLE
2.SQUARE
3.CIRCLE
4.EXIT
Enter your Choice:  2
Enter side : 4
AREA OF SQUARE: 16

1.RECTANGLE
2.SQUARE
3.CIRCLE
4.EXIT
Enter your Choice:  3
Enter Radius : 3
AREA OF CIRCLE: 28.259999999999998

1.RECTANGLE
2.SQUARE
3.CIRCLE
4.EXIT
Enter your Choice:  4
Exiting.....

*/
