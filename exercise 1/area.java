/*Find the area of different shapes using overloaded functions*/

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
        Area obj=new Area();

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


