/*Java program to read a floating-point number and if the number is zero
it prints "zero", otherwise, print "positive" or "negative". Add "small" if the
absolute value of the number is less than 1, or "large" if it exceeds 1,00,000*/

import java.util.Scanner;
class Float{
	public static void main(String args[]){
		System.out.println("Enter a number:");
		Scanner in=new Scanner(System.in);
		float num=in.nextFloat();
		if(num>0)
		{
			if(num<1)
			{
			System.out.println("Positive small number");
			}
			else if(num>1000000)
			{
			System.out.println("Positive large number");
			}
			else
			{
			System.out.println("Positive number");
			}
		}
		else if(num<0)
		{
			if(Math.abs(num)<1)
			{		
			System.out.println("Negative small number");
			}
			else if(Math.abs(num)>1000000)
			{
			System.out.println("Negative large number");
			}
			else
			{
			System.out.println("Negative number");
			}
		}
		else
		{
		System.out.println("The Number is zero");
		}
	}
}

/*output


Enter a number:
0.2
Positive small number


Enter a number:
15000000
Positive large number


Enter a number:
7
Positive number


Enter a number:
-0.2
Negative small number


Enter a number:
-150000000
Negative large number


Enter a number:
-7
Negative number


Enter a number:
0
The Number is zero

*/
