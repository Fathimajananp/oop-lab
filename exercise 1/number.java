/*program that accepts three numbers from the user and prints
"increasing" if the numbers are in increasing order, "decreasing" if the
numbers are in decreasing order, and "Neither increasing or decreasing order"
otherwise.*/

import java.util.Scanner;
class number{
	public static void main(String args[]){
		System.out.println("Enter a number:");
		Scanner in1=new Scanner(System.in);
		int n1=in1.nextInt();
		System.out.println("Enter a number:");
		Scanner in2=new Scanner(System.in);
		int n2=in2.nextInt();
		System.out.println("Enter a number:");
		Scanner in3=new Scanner(System.in);
		int n3=in3.nextInt();
		if(n1<n2 && n2<n3)
		{
		System.out.println("The numbers are in the increasing order");
		}
		else if(n1>n2 && n2>n3)
		{
		System.out.println("The numbers are in the decreasing order");
		}
		else
		{
		System.out.println("The numbers are Neither increasing or decreasing order");
		}
	}
}

/*output
Enter a number:
5
Enter a number:
4
Enter a number:
9
The numbers are Neither increasing or decreasing order

Enter a number:
1
Enter a number:
2
Enter a number:
3
The numbers are in the increasing order

Enter a number:
1
Enter a number:
2
Enter a number:
3
The numbers are in the increasing order
*/
