/*Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic operations. Test the package by implementing all operations on two given numbers */



import java.util.*;
import Arithematic.*;//importing arithmetic package
class arithematic
{
public static void main(String args[])
{
    int a,b,c,x,y,r;
    Scanner s=new Scanner(System.in);

    while(true)
    {
    System.out.print("\n\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.EXIT\n\nEnter choice : ");
    int ch=s.nextInt();

    switch(ch)
    {
       case 1:System.out.print("Enter the two Numbers for Addition:");
              a=s.nextInt();
              b=s.nextInt();
              add obj1=new add();//creating object of class in package
              obj1.fucn(a,b);
              break;
       case 2:System.out.print("Enter the two Numbers for Subtraction:");
              a=s.nextInt();
              b=s.nextInt();
              sub obj2=new sub();
              obj2.fucn(a,b);
              break;
       case 3:System.out.print("Enter the two Numbers for Multiplication:");
              a=s.nextInt();
              b=s.nextInt();
              mul obj3=new mul();
              obj3.fucn(a,b);
              break;
       case 4:System.out.print("Enter the two Numbers for Division:");
              a=s.nextInt();
              b=s.nextInt();
              if(b==0){
              System.out.println("Division not possible...");
              }
              else{
              div obj4=new div();
              obj4.fucn(a,b);
              }
              break;
       case 5:System.out.println("Exiting.....!");
              System.exit(0);
       default:System.out.println("Enter a valid option...!");
    }
   }
  }
}

/*OUTPUT


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 1
Enter the two Numbers for Addition:5
6
SUM OF NUMBERS : 11


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 2
Enter the two Numbers for Subtraction:5
3
DIFFERENCE OF NUMBERS : 2


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 3
Enter the two Numbers for Multiplication:4
6
PRODUCT OF NUMBERS : 24


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 4
Enter the two Numbers for Division:10
2
QUOTIENT : 5


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 6
Enter a valid option...!


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 5
Exiting.....!

*/

