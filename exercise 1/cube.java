/*java program to display the cube of the number up to a given
integer.*/

import java.util.Scanner;
class cube{
	public static void main(String args[]){
			int i;
			System.out.println("Enter a number:");
			Scanner in=new Scanner(System.in);
			int num=in.nextInt();
			for(i=1;i<=num;i++)
			{
			System.out.println("The number is "+i+" and cube of the number is :"+(i*i*i));
			}
		}
}


/*output
Enter a number:
5
The number is 1 and cube of the number is :1
The number is 2 and cube of the number is :8
The number is 3 and cube of the number is :27
The number is 4 and cube of the number is :64
The number is 5 and cube of the number is :125
*/
