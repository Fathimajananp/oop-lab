//Add two complex numbers

import java.util.*;
class complex
{
	int r;
	int i;

	complex(int a,int b)//to initialise
	{
		r=a;
		i=b;
	}

	public static void main(String args[])
	{
	int c,d;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter Real and Imaginary Part of First Complex Number : ");
	int x=in.nextInt();
	int y=in.nextInt();
	complex obj1=new complex(x,y);
	
	System.out.print("Enter Real and Imaginary Part of Second Complex Number : ");
	int p=in.nextInt();
	int q=in.nextInt();
	complex obj2=new complex(p,q);

	c=obj1.r+obj2.r;
	d=obj1.i+obj2.i;

	System.out.println("\nSUM OF COMPLEX NUMBERS : "+c+" + "+d+"i");
	}
}




/* OUTPUT

Enter Real and Imaginary Part of First Complex Number : 3 4
Enter Real and Imaginary Part of Second Complex Number : 5 6

SUM OF COMPLEX NUMBERS : 8 + 10i

*/
